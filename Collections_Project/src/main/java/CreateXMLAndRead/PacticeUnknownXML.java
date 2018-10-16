package CreateXMLAndRead;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;

public class PacticeUnknownXML {

    public static String s="<root><Name>Suresh</Name><DOB>1990</DOB><Age>29</Age><Phone>8144833358</Phone><EmpId>28126</EmpId></root>";
    public static final String xmlFilePath = "C:\\Users\\suresh.dalavayi\\Documents\\Study\\Read Data From XML\\Sample4.xml";

    public static void main(String[] args){

        try {
            StringReader NewStr=new StringReader(s);
            PacticeUnknownXML oBj=new PacticeUnknownXML();

            Document doc = DocumentBuilderFactory.newInstance()
                    .newDocumentBuilder()
                    .parse(new InputSource(NewStr));

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource domSource = new DOMSource(doc);
            StreamResult streamResult = new StreamResult(new File(xmlFilePath));
            transformer.transform(domSource, streamResult);

//            DOMSource domSource = new DOMSource(doc);
//            StreamResult streamResult = new StreamResult(new File(xmlFilePath));
//            Transformer transformer=TransformerFactory.newInstance().newTransformer().transform(domSource, streamResult);


            System.out.println("XML File Created"+"\n");

            oBj.ReadMethod("root", "Name", "Name is");

        } catch (ParserConfigurationException pce) {
            pce.printStackTrace();
        } catch (TransformerException tfe) {
            tfe.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void ReadMethod(String LoopNode, String BringNode, String PrintTXT){

        ArrayList NodeValue = new ArrayList();

        try {

//            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
//            DocumentBuilder docbuild = dbf.newDocumentBuilder();
//            Document doc = docbuild.parse(xmlFilePath);

            Document doc = DocumentBuilderFactory.newInstance()
                    .newDocumentBuilder().parse(xmlFilePath);


            NodeList nodeLst = doc.getElementsByTagName(LoopNode);

            for (int s = 0; s < nodeLst.getLength(); s++) {

                Node NodeoBj = nodeLst.item(s);

                if (NodeoBj.getNodeType() == Node.ELEMENT_NODE) {

                    Element ElementoBj = (Element) NodeoBj;

//                    NodeList NodeListoBj = ElementoBj.getElementsByTagName(BringNode);
//                    Element ElementValueoBj = (Element) NodeListoBj.item(0);
//                    NodeList ChildNodeoBj1 = ElementValueoBj.getChildNodes();

                    NodeList ChildNodeoBj=ElementoBj.getElementsByTagName(BringNode).item(0).getChildNodes();

                    NodeValue.add(((Node) ChildNodeoBj.item(0)).getNodeValue());
                }
            }
            System.out.println(PrintTXT+ ": "+NodeValue);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}