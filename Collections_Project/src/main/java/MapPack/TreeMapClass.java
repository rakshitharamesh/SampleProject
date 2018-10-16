package MapPack;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapClass {

    public static void main(String[] arg){

        //Tree Map Doesn't accepts null values at all as Key, will accept as Value
        //Follows Preserved Order(Insertion Order).
        //Index can not be used to get data Though its following insertion order
        //As we cant use index, Normal For and While Loops Can not be used.
        //Enhanced for loop (For Each) and iterator can be used
        //If we Try to add Duplicate Values in Key, it will override existing Key and the lastly added Keys Value will be stored.
        //Accepts Multiple null values As value for any number of unique Keys.
        //An Entry can be removed by passing the Key as an attribute.

        //IMP: Difference from HashMap and Linked HashMap is, it will follow Key ascending order.
        //IMP: Tree Map Doesn't accepts null values at all as Key, but will accept as Value

        TreeMap<Integer, String> TMap=new TreeMap<Integer, String>();

        TMap.put(+91, "India");
        TMap.put(+977, "Nepal");
        TMap.put(+44, "UK");
        TMap.put(+1, "USA");
        TMap.put(+1, "Canada");
        TMap.put(40, "India");
//        TMap.put(null, null);
//        TMap.put(null, "Mauritius");
        TMap.put(5, null);
        TMap.put(6, null);

        System.out.println("Linked Hash Map Values: "+"\n" +TMap);
        TMap.remove(44);
        // Enhanced For Loop
        for (Map.Entry m:TMap.entrySet())
        {
            System.out.println(m.getKey()+"="+m.getValue());
        }
    }

}
