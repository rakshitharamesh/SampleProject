package SetPack;

import java.util.LinkedHashSet;

public class Linked_HashSetClass {

    public static void main (String[] args){

        //Accepts Only one Null value, if we enter another null it will override existing
        //It will follow Preserved Order and maintains.
        //Index can not be used to get data though its following preserved order
        //As we can't use index Normal For and While Loops Can not be used.
        //Enhanced for loop (For Each) and iterator can be used
        //If we Try to add Duplicate Values it will override existing value.
        //Linked HashSet will work like linked list i.e. changes the connections once a value in the middle is removed

        Linked_HashSetClass oBj=new Linked_HashSetClass();
        oBj.Without_Generics();
        oBj.With_Generics();
    }

    public void Without_Generics(){

        LinkedHashSet LHSet=new LinkedHashSet();
        LHSet.add(10);
        LHSet.add("Suresh");
        LHSet.add(28);
        LHSet.add("Karnataka");
        LHSet.add("India");
        LHSet.add("Nellore");
        LHSet.add(524001);
        LHSet.add(null);
        LHSet.add(null);
        LHSet.add(28);
        LHSet.add(30);
        LHSet.remove("Nellore");
        LHSet.remove(30);
        // Here Value 30 will not be considered as index in set, will be considered as Object and deletes it.
        System.out.print(LHSet+"\n");
//        System.out.println("Name of the Employee : "+LHSet.get(1));
//        -- Can not use get(index) here Though LinkedHashSet follows Preserve order
    }

    public void With_Generics(){

        LinkedHashSet<Integer> LHSet=new LinkedHashSet();

        LHSet.add(10);
        LHSet.add(28);
        LHSet.add(524001);
        LHSet.add(524002);
        LHSet.add(null);
        LHSet.add(null);
        LHSet.add(28);
        LHSet.add(30);
        LHSet.remove(524001);
        LHSet.remove(30);
        // Here Value 30 will not be considered as index in set, will be considered as Object and deletes it.
        System.out.print(LHSet+"\n");
        System.out.println("Set Size is : "+LHSet.size());
    }


}
