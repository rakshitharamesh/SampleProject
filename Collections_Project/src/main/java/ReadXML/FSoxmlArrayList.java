package ReadXML;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;

public class FSoxmlArrayList {

    public static void main(String[] args){

        FSoxmlArrayList oBj=new FSoxmlArrayList();
        oBj.ReadMethod("File", "Name", "Name is");
    }

    public void ReadMethod(String LoopNode, String BringNode, String PrintTXT){

        ArrayList NodeValue = new ArrayList();

        try {
            File file = new File("C:\\Users\\suresh.dalavayi\\Documents\\Study\\Read Data From XML\\Sample3.xml");

            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder docbuild = dbf.newDocumentBuilder();
            Document doc = docbuild.parse(file);

            NodeList nodeLst = doc.getElementsByTagName(LoopNode);

            for (int s = 0; s < nodeLst.getLength(); s++) {

                Node NodeoBj = nodeLst.item(s);

                if (NodeoBj.getNodeType() == Node.ELEMENT_NODE) {

                    Element ElementoBj = (Element) NodeoBj;

                    NodeList NodeListoBj = ElementoBj.getElementsByTagName(BringNode);
                    Element ElementValueoBj = (Element) NodeListoBj.item(0);
                    NodeList ChildNodeoBj = ElementValueoBj.getChildNodes();

                    NodeValue.add(((Node) ChildNodeoBj.item(0)).getNodeValue());
                }
            }
            System.out.println(PrintTXT+ ": "+NodeValue);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
