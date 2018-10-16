package CreateXMLAndRead;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class xmlSubString {

    public static final String xmlFilePath = "C:\\Users\\suresh.dalavayi\\Documents\\Study\\Read Data From XML\\Sample3.xml";
    public static void main(String[] args){

        String s="<Name>Suresh</Name><DOB>1990</DOB><Age>29</Age><Phone>8144833358</Phone><EmpId>28126</EmpId>";

        int startPosition = s.indexOf("<Name>") + "<Name>".length();
        int endPosition = s.indexOf("</Name>", startPosition);
        String Name = s.substring(startPosition, endPosition);
        System.out.println(Name);

        int DOBStart = s.indexOf("<DOB>") + "<DOB>".length();
        int DOBEnd = s.indexOf("</DOB>", startPosition);
        String DOB = s.substring(DOBStart, DOBEnd);
        System.out.println(DOB);

        int AgeStart = s.indexOf("<Age>") + "<Age>".length();
        int AgeEnd = s.indexOf("</Age>", startPosition);
        String Age = s.substring(AgeStart, AgeEnd);
        System.out.println(Age);

        int PhoneStart = s.indexOf("<Phone>") + "<Phone>".length();
        int PhoneEnd = s.indexOf("</Phone>", startPosition);
        String Phone = s.substring(PhoneStart, PhoneEnd);
        System.out.println(Phone);

        int EmpIdStart = s.indexOf("<EmpId>") + "<EmpId>".length();
        int EmpIdEnd = s.indexOf("</EmpId>", startPosition);
        String EmpId = s.substring(EmpIdStart, EmpIdEnd);
        System.out.println(EmpId);


        try {
            DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();
            Document document = documentBuilder.newDocument();

            Element File = document.createElement("File");
            document.appendChild(File);

            Element EMPName = document.createElement("Name");
            EMPName.appendChild(document.createTextNode(Name));
            File.appendChild(EMPName);

            Element EMPDob = document.createElement("DOB");
            EMPDob.appendChild(document.createTextNode(DOB));
            File.appendChild(EMPDob);

            Element EMPAge = document.createElement("Age");
            EMPAge.appendChild(document.createTextNode(Age));
            File.appendChild(EMPAge);

            //Element Creation Script
            Element EMPPhone = document.createElement("Phone");
            EMPPhone.appendChild(document.createTextNode(Phone));
            File.appendChild(EMPPhone);

            Element EmployeeID = document.createElement("EmpID");
            EmployeeID.appendChild(document.createTextNode(EmpId));
            File.appendChild(EmployeeID);

            // xml file creation script
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource domSource = new DOMSource(document);
            StreamResult streamResult = new StreamResult(new File(xmlFilePath));
            transformer.transform(domSource, streamResult);
            System.out.println("XML File Created");

        } catch (ParserConfigurationException pce) {
            pce.printStackTrace();
        } catch (TransformerException tfe) {
            tfe.printStackTrace();
        }

    }

}
