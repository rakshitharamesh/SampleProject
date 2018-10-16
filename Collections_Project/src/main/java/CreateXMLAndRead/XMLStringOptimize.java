package CreateXMLAndRead;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.ArrayList;

public class XMLStringOptimize {

    public static final String xmlFilePath = "C:\\Users\\suresh.dalavayi\\Documents\\Study\\Read Data From XML\\Sample3.xml";
    public static String s="<Name>Suresh</Name><DOB>1990</DOB><Age>29</Age><Phone>8144833358</Phone><EmpId>28126</EmpId>";

    public static void main(String[] args){

        XMLStringOptimize oBj=new XMLStringOptimize();

        try {
            DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();
            Document document = documentBuilder.newDocument();

            Element File = document.createElement("File");
            document.appendChild(File);

            Element EMPName = document.createElement("Name");
            EMPName.appendChild(document.createTextNode(oBj.SubStringMethod("Name")));
            File.appendChild(EMPName);

            Element EMPDob = document.createElement("DOB");
            EMPDob.appendChild(document.createTextNode(oBj.SubStringMethod("DOB")));
            File.appendChild(EMPDob);

            Element EMPAge = document.createElement("Age");
            EMPAge.appendChild(document.createTextNode(oBj.SubStringMethod("Age")));
            File.appendChild(EMPAge);

            //Element Creation Script
            Element EMPPhone = document.createElement("Phone");
            EMPPhone.appendChild(document.createTextNode(oBj.SubStringMethod("Phone")));
            File.appendChild(EMPPhone);

            Element EmployeeID = document.createElement("EmpId");
            EmployeeID.appendChild(document.createTextNode(oBj.SubStringMethod("EmpId")));
            File.appendChild(EmployeeID);

            // xml file creation script
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource domSource = new DOMSource(document);
            StreamResult streamResult = new StreamResult(new File(xmlFilePath));
            transformer.transform(domSource, streamResult);
            System.out.println("XML File Created"+"\n");

            oBj.ReadMethod("File", "Name", "Name is");

        } catch (ParserConfigurationException pce) {
            pce.printStackTrace();
        } catch (TransformerException tfe) {
            tfe.printStackTrace();
        }
    }

    private static String SubStringMethod(String Str){

        int startPosition = s.indexOf("<"+Str+">") + ("<"+Str+">").length();
        int endPosition = s.indexOf("</"+Str+">", startPosition);
        String Value = s.substring(startPosition, endPosition);
        System.out.println(Value);
        return Value;
    }

    public void ReadMethod(String LoopNode, String BringNode, String PrintTXT){

        ArrayList NodeValue = new ArrayList();

        try {

            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder docbuild = dbf.newDocumentBuilder();
            Document doc = docbuild.parse(xmlFilePath);

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