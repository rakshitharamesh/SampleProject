package CreateXMLAndRead;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import java.lang.Object;
import java.io.Reader;
import java.io.StringReader;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class UnknownXML {

    public static String s="<Name>Suresh</Name><DOB>1990</DOB><Age>29</Age><Phone>8144833358</Phone><EmpId>28126</EmpId>";
    public static final String xmlFilePath = "C:\\Users\\suresh.dalavayi\\Documents\\Study\\Read Data From XML\\Sample4.xml";

    public static void main(String[] args){

        StringReader ns=new StringReader(s);
        System.out.println(ns);

        try {
            DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();
            Document document = documentBuilder.newDocument();

            Element File = document.createElement("Sample");
            File.appendChild(document.createTextNode(s));
            document.appendChild(File);

            // xml file creation script
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource domSource = new DOMSource(document);
            StreamResult streamResult = new StreamResult(new File(xmlFilePath));
            transformer.transform(domSource, streamResult);
            System.out.println("XML File Created"+"\n");

        } catch (ParserConfigurationException pce) {
            pce.printStackTrace();
        } catch (TransformerException tfe) {
            tfe.printStackTrace();
        }


    }
}
