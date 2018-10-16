package MapPack;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapClass {

    public static void main(String[] args){

        //Accepts Only one Null value in Key, if we enter another null as Key, it will override existing
        //Follows Preserved Order(Insertion Order).
        //Index can not be used to get data Though its following insertion order
        //As we cant use index, Normal For and While Loops Can not be used.
        //Enhanced for loop (For Each) and iterator can be used
        //If we Try to add Duplicate Values in Key, it will override existing Key and the lastly added Keys Value will be stored.
        //Accepts Multiple null values As value for any number of unique Keys.
        //An Entry can be removed by passing the Key as an attribute.

        //IMP: Only difference from HashMap is it will follow Preserver order.


        LinkedHashMap<Integer, String> LHMap=new LinkedHashMap<Integer, String>();

        LHMap.put(+91, "India");
        LHMap.put(+977, "Nepal");
        LHMap.put(+44, "UK");
        LHMap.put(+1, "USA");
        LHMap.put(+1, "Canada");
        LHMap.put(40, "India");
        LHMap.put(null, null);
        LHMap.put(null, "Mauritius");
        LHMap.put(5, null);
        LHMap.put(6, null);

        System.out.println("Linked Hash Map Values: "+"\n" +LHMap);
        LHMap.remove(44);
        // Enhanced For Loop
        for (Map.Entry m:LHMap.entrySet())
        {
            System.out.println(m.getKey()+"="+m.getValue());
        }

    }

}
