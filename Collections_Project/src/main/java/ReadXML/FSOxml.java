package ReadXML;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;

public class FSOxml {

    public static void main(String[] args){

        FSOxml oBj=new FSOxml();
        oBj.ReadMethod("UnionTerritory", "Place1", "Union Territory 1 is");
    }

    public void ReadMethod(String LoopNode, String BringNode, String PrintTXT){

        ArrayList NodeValue = new ArrayList();

        try {
            File file = new File("C:\\Users\\suresh.dalavayi\\Documents\\Study\\Read Data From XML\\Sample.xml");

            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder dbuild = dbf.newDocumentBuilder();
            Document doc = dbuild.parse(file);

            NodeList nodeLst = doc.getElementsByTagName(LoopNode);

            for (int s = 0; s < nodeLst.getLength(); s++) {

                Node NodeoBj = nodeLst.item(s);

                if (NodeoBj.getNodeType() == Node.ELEMENT_NODE) {

                    Element ElementoBj = (Element) NodeoBj;

                    NodeList NodeListoBj = ElementoBj.getElementsByTagName(BringNode);
                    Element ElementValueoBj = (Element) NodeListoBj.item(0);
                    NodeList ChildNodeoBj = ElementValueoBj.getChildNodes();
//                    Element TagValueoBj = (Element) NodeListoBj.item(0);
//                    NodeValue.add(TagValueoBj);
                    NodeValue.add(((Node) ChildNodeoBj.item(0)).getNodeValue());
                    System.out.println(PrintTXT+ ": "+NodeValue);
//                    System.out.println(PrintTXT+ ": " + ((Node) ChildNodeoBj.item(0)).getNodeValue());
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
