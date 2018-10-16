package ListPack;

import java.util.LinkedList;

public class LinkedListClass {

    public static void main(String[] args){

        //Accepts any number of Null values and Duplicates
        //Follows Insertion Order
        //Only Difference is Storage format will differ between ArrayList and LinkedList
        //Better to user if we don't have searching operations much on the data.
        //Better to user if we have more insertion operations

        LinkedListClass oBj=new LinkedListClass();
        oBj.Without_Generics();
        oBj.With_Generics();
    }

    public void Without_Generics(){

        LinkedList LinkList=new LinkedList();
        LinkList.add(10);
        LinkList.add("Suresh");
        LinkList.add(28);
        LinkList.add("Karnataka");
        LinkList.add("India");
        LinkList.add("Nellore");
        LinkList.add(524001);
        LinkList.add(null);
        LinkList.add(null);
        LinkList.add(28);
        LinkList.remove("Nellore");
        LinkList.remove(3);
        System.out.print(LinkList+"\n");
        System.out.println("Name of the Employee : "+LinkList.get(1));
    }

    public void With_Generics(){

        LinkedList<Integer> LinkList=new LinkedList();
        LinkList.add(10);
        LinkList.add(28);
        LinkList.add(524001);
        LinkList.add(null);
        LinkList.add(null);
        LinkList.add(28);
        LinkList.remove(3);
        System.out.print(LinkList+"\n");
        System.out.println("Age of the Employee : "+LinkList.get(1));


    }

}
