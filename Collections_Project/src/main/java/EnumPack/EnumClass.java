package EnumPack;

import java.util.Vector;
import java.util.Enumeration;

public class EnumClass {

    public static void main(String args[]) {

        Enumeration days;
        Enumeration<Integer> Num;
        Vector dayNames = new Vector();

        dayNames.add(1);
        dayNames.add("Sunday");
        dayNames.add("Monday");
        dayNames.add("Tuesday");
        dayNames.add("Wednesday");
        dayNames.add("Thursday");
        dayNames.add("Friday");
        dayNames.add("Saturday");
        days = dayNames.elements();

        System.out.println(dayNames.get(1)+"\n");

        while (days.hasMoreElements()) {
            System.out.println(days.nextElement());
        }

        Vector<Integer> Numbers=new Vector<Integer>();
        Numbers.add(100);
        Numbers.add(200);
        Numbers.add(300);
        Numbers.add(400);
        Numbers.add(500);
        Numbers.add(600);
        Num=Numbers.elements();

        int i=Numbers.size();
        System.out.println("Size of Vector Numbers is : " +i);
        while (Num.hasMoreElements()){
            System.out.println(Num.nextElement());
        }
        System.out.println(Numbers);
    }


}
