package ListPack;

import java.util.ArrayList;

public class ArrayListClass {

    public static void main(String[] args){

        //Accepts any number of Null values and Duplicates
        //Follows Insertion Order
        //Only Difference is Storage format will differ between ArrayList and LinkedList
        //Better to user if we have searching operations much on the data, its faster to search
        //Better to user if we don't have more insertion operations

        ArrayListClass oBj=new ArrayListClass();
        oBj.Without_Generics();
        oBj.With_Generics();
    }


    public void Without_Generics(){

        ArrayList ArrList=new ArrayList();
        ArrList.add(10);
        ArrList.add("Suresh");
        ArrList.add(28);
        ArrList.add("Karnataka");
        ArrList.add("India");
        ArrList.add("Nellore");
        ArrList.add(524001);
        ArrList.add(null);
        ArrList.add(28);
        ArrList.remove("Nellore");
        ArrList.remove(3);
        System.out.print(ArrList+"\n");
        System.out.println("Name of the Employee : "+ArrList.get(1));


    }
    public void With_Generics(){

        ArrayList<String> ArrList=new ArrayList();
        ArrList.add("Suresh");
        ArrList.add("Karnataka");
        ArrList.add("India");
        ArrList.add("Nellore");
        ArrList.add(null);
        ArrList.add(null);
        ArrList.remove("Nellore");
        ArrList.remove(1);
        System.out.print(ArrList+"\n");
        System.out.println("Name of the Country : "+ArrList.get(1));
    }

}
