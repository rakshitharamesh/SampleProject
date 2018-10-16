package SetPack;

import java.util.HashSet;

public class HashSetClass {

    public static void main (String[] args){

        //Accepts Only one Null value, if we enter another null it will override existing
        //Doesn't Follows any Order.
        //Index can not be used to get data as it wont follow order
        //As we cant use index Normal For and While Loops Can not be used.
        //Enhanced for loop (For Each) and iterator can be used
        //If we Try to add Duplicate Values it will override existing value.
        //HashSet will shift the values Left once a value in the middle is removed

        HashSetClass oBj=new HashSetClass();
        oBj.Without_Generics();
        oBj.With_Generics();
    }

    public void Without_Generics(){

        HashSet HSet=new HashSet();
        HSet.add(10);
        HSet.add("Suresh");
        HSet.add(28);
        HSet.add("Karnataka");
        HSet.add("India");
        HSet.add("Nellore");
        HSet.add(524001);
        HSet.add(null);
        HSet.add(null);
        HSet.add(28);
        HSet.add(30);
        HSet.remove("Nellore");
        HSet.remove(30);
        // Here Value 30 will not be considered as index in set, will be considered as Object and deletes it.
        System.out.print(HSet+"\n");
//        System.out.println("Name of the Employee : "+HSet.get(1));
//        -- Can not use get(index) here as HashSet will not follow Preserve order
    }

    public void With_Generics(){

        HashSet<Integer> HSet=new HashSet();

        HSet.add(10);
        HSet.add(28);
        HSet.add(524001);
        HSet.add(524002);
        HSet.add(null);
        HSet.add(null);
        HSet.add(28);
        HSet.add(30);
        HSet.remove(524001);
        HSet.remove(30);
        // Here Value 30 will not be considered as index in set, will be considered as Object and deletes it.
        System.out.print(HSet+"\n");
        System.out.println("Set Size is : "+HSet.size());
    }


}
