package ReadXML;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Element;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;

public class TryFSO {

    public static void main(String argv[]) {
        ArrayList Country = new ArrayList();
        ArrayList State = new ArrayList();
        ArrayList Location = new ArrayList();
        ArrayList PinCode = new ArrayList();
        ArrayList Place = new ArrayList();

        try {
            File file = new File("C:\\Users\\suresh.dalavayi\\Documents\\Study\\Read Data From XML\\Sample.xml");

            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder dbuild = dbf.newDocumentBuilder();
            Document doc = dbuild.parse(file);

            NodeList nodeLst = doc.getElementsByTagName("build");

            for (int s = 0; s < nodeLst.getLength(); s++) {

                Node fstNode = nodeLst.item(s);

                if (fstNode.getNodeType() == Node.ELEMENT_NODE) {

                    Element fstElmnt = (Element) fstNode;

                    NodeList fstNmElmntLst = fstElmnt.getElementsByTagName("Country");
                    Element fstNmElmnt = (Element) fstNmElmntLst.item(0);
                    NodeList fstNm = fstNmElmnt.getChildNodes();
                    Element CountryName = (Element) fstNmElmntLst.item(0);
                    Country.add(CountryName);
                    System.out.println("Country : "+ ((Node) fstNm.item(0)).getNodeValue());


                    NodeList lstNmElmntLst = fstElmnt.getElementsByTagName("State");
                    Element lstNmElmnt = (Element) lstNmElmntLst.item(0);
                    NodeList lstNm = lstNmElmnt.getChildNodes();
                    Element StateName = (Element) lstNm;
                    State.add(StateName);
                    System.out.println("State : "+ ((Node) lstNm.item(0)).getNodeValue());


                    NodeList ThirdNmElmntLst = fstElmnt.getElementsByTagName("Location");
                    Element ThirdNmElmnt = (Element) ThirdNmElmntLst.item(0);
                    NodeList ThirdNm = ThirdNmElmnt.getChildNodes();
                    Element LocationNm = (Element) ThirdNm;
                    Location.add(LocationNm);
                    System.out.println("Location : "+ ((Node) ThirdNm.item(0)).getNodeValue());


                    NodeList FourthNmElmntLst = fstElmnt.getElementsByTagName("PinCode");
                    Element FourthNmElmnt = (Element) FourthNmElmntLst.item(0);
                    NodeList FourthNm = FourthNmElmnt.getChildNodes();
                    Element PincodeNm = (Element) FourthNm;
                    PinCode.add(PincodeNm);
                    System.out.println("PinCode : "+ ((Node) FourthNm.item(0)).getNodeValue()+"\n");


                }

            }

            NodeList nodeLstUT = doc.getElementsByTagName("UnionTerritory");

            for (int UT = 0; UT < nodeLstUT.getLength(); UT++) {

                Node UTNode = nodeLstUT.item(UT);

                if (UTNode.getNodeType() == Node.ELEMENT_NODE) {

                    Element SecondElmnt = (Element) UTNode;

                    NodeList SubNodeOne = SecondElmnt.getElementsByTagName("Place1");
                    Element SubNodeOneElmnt = (Element) SubNodeOne.item(0);
                    NodeList SubOneNm = SubNodeOneElmnt.getChildNodes();
                    Element Place1Nm = (Element) SubOneNm;
                    Place.add(Place1Nm);
                    System.out.println("Place1 : " + ((Node) SubOneNm.item(0)).getNodeValue() );

                    NodeList SubNodeTwo = SecondElmnt.getElementsByTagName("Place2");
                    Element SubNodeTwoElmnt = (Element) SubNodeTwo.item(0);
                    NodeList SubTwoNm = SubNodeTwoElmnt.getChildNodes();
                    Element Place2Nm = (Element) SubTwoNm;
                    Place.add(Place2Nm);
                    System.out.println("Place2 : " + ((Node) SubTwoNm.item(0)).getNodeValue() + "\n");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
