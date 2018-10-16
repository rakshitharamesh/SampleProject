package SetPack;

import java.util.TreeSet;

public class TreeSetClass {

    public static void main(String[] args) {
        //Tree Set will not accept even one null value
        //It will follow Asscending Order whether the data in integer or string.
        //Index can not be used to get data though its following Ascending order
        //As we can't use index Normal For and While Loops Can not be used.
        //Enhanced for loop (For Each) and iterator can be used
        //If we Try to add Duplicate Values it will override existing value.
        //Tree Set will changes the connections and connects the data once a value in the middle is removed

        //IMP: TreeSet should always be with generics, without generics we cant create TreeSet
        //IMP: When we don't mention the type it will by default consider <Integer>

        TreeSetClass oBj = new TreeSetClass();
        oBj.Without_Generics();
        oBj.With_Generics();
        oBj.With_String();

    }

    public void Without_Generics(){

        TreeSet TSet=new TreeSet();
        TSet.add(20);
        TSet.add(28);
        TSet.add(524001);
//        TSet.add(null); -- Treeset will not accept Null values
        TSet.add(28);
        TSet.add(30);
        TSet.remove(30);
    // Here Value 30 will not be considered as index in set, will be considered as Object and deletes it.
        System.out.print(TSet+"\n");
//        System.out.println("Name of the Employee : "+TSet.get(1));
//        -- Can not use get(index) here Though TreeSet will follow Ascending order
}

    public void With_String(){

        TreeSet<String> TSet=new TreeSet();
        TSet.add("Suresh");
        TSet.add("Karnataka");
        TSet.add("India");
        TSet.add("Nellore");
//        TSet.add(null); -- Treeset will not accept Null values
        TSet.remove("Nellore");
        System.out.print(TSet+"\n");
    }


    public void With_Generics(){

        TreeSet<Integer> TSet=new TreeSet<Integer>();

        TSet.add(10);
        TSet.add(28);
        TSet.add(524001);
        TSet.add(524002);
//        TSet.add(null); -- TreeSet will not accept null values
        TSet.add(28);
        TSet.add(30);
        TSet.remove(524001);
        TSet.remove(30);
        // Here Value 30 will not be considered as index in set, will be considered as Object and deletes it.
        System.out.print(TSet+"\n");
        System.out.println("Set Size is : "+TSet.size());
    }


}
