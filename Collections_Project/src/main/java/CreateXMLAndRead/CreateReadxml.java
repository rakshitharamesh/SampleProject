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

public class CreateReadxml {

//    String Str="<File><Name>Suresh</Name><DOB>1990</DOB><Age>29</Age><Phone>8144833358</Phone><EmpId>28126</EmpId></File>";

    public static final String xmlFilePath = "C:\\Users\\suresh.dalavayi\\Documents\\Study\\Read Data From XML\\Sample2.xml";

    public static void main(String[] args){

            try {
                DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
                DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();
                Document document = documentBuilder.newDocument();
                // root element
                Element root = document.createElement("company");
                document.appendChild(root);
                // employee element
                Element employee = document.createElement("employee");
                root.appendChild(employee);
                //you can also use staff.setAttribute("id", "1") for this
                // firstname element
                Element firstName = document.createElement("firstname");
                firstName.appendChild(document.createTextNode("James"));
                employee.appendChild(firstName);
                // lastname element
                Element lastname = document.createElement("lastname");
                lastname.appendChild(document.createTextNode("Harley"));
                employee.appendChild(lastname);
                // email element
                Element email = document.createElement("email");
                email.appendChild(document.createTextNode("james@example.org"));
                employee.appendChild(email);
                // department elements
                Element department = document.createElement("department");
                department.appendChild(document.createTextNode("Human Resources"));
                employee.appendChild(department);
                // create the xml file
                //transform the DOM Object to an XML File
                TransformerFactory transformerFactory = TransformerFactory.newInstance();
                Transformer transformer = transformerFactory.newTransformer();
                DOMSource domSource = new DOMSource(document);
                StreamResult streamResult = new StreamResult(new File(xmlFilePath));
                transformer.transform(domSource, streamResult);
                System.out.println("Done creating XML File");
            } catch (ParserConfigurationException pce) {
                pce.printStackTrace();
            } catch (TransformerException tfe) {
                tfe.printStackTrace();
            }
    }

}
