package MapPack;

import java.util.HashMap;
import java.util.Map;

public class HasMapClass {

    //Accepts Only one Null value in Key, if we enter another null as Key, it will override existing
    //Doesn't Follows any Order.
    //Index can not be used to get data as it wont follow order
    //As we cant use index, Normal For and While Loops Can not be used.
    //Enhanced for loop (For Each) and iterator can be used
    //If we Try to add Duplicate Values in Key, it will override existing Key and the lastly added Keys Value will be stored.
    //Accepts Multiple null values As value for any number of unique Keys.
    //An Entry can be removed by passing the Key as an attribute.


    public static void main(String[] args){

        HashMap<Integer, String> HMap=new HashMap<Integer, String>();
        HMap.put(+91, "India");
        HMap.put(+977, "Nepal");
        HMap.put(+44, "UK");
        HMap.put(+1, "USA");
        HMap.put(+1, "Canada");
        HMap.put(40, "India");
        HMap.put(null, null);
        HMap.put(null, "Mauritius");
        HMap.put(5, null);
        HMap.put(6, null);

        System.out.println("Hash Map Values: "+"\n" +HMap);
        HMap.remove(44);
        // Enhanced For Loop
        for (Map.Entry m:HMap.entrySet())
        {
        System.out.println(m.getKey()+"="+m.getValue());
        }
        
    }

}
