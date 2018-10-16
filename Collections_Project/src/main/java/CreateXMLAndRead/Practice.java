package CreateXMLAndRead;

public class Practice {

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
    }

}
