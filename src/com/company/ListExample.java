package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ListExample {

    ArrayList<String> arrayList1 = new ArrayList<String>();
    LinkedList<Integer> linkList1 = new LinkedList<Integer>();
    public ListExample() {
        arrayList1.add("kathmandu");
        arrayList1.add("lalitpur");
        arrayList1.add("Bhaktapur");
        arrayList1.add("kathmandu");

        linkList1.add(2);
        linkList1.add(6);
        linkList1.add(3);
        linkList1.add(2);
        linkList1.add(6);

    }
    public void printArrayList()
    {
        System.out.println("ArrayList elements" + arrayList1);
        System.out.println("using iterator");
        Iterator eAL = arrayList1.iterator();
        while(eAL.hasNext())
        {
            String s = (String)eAL.next();
            System.out.println(s + " ");
        }
    }

    public void printLinkList()
    {
        System.out.println("LinkList elements" + linkList1);
        System.out.println("using iterator");
        Iterator eAL = linkList1.iterator();
        while(eAL.hasNext())
        {
            Integer i = (Integer)eAL.next();
            System.out.println(i + " ");
        }

        System.out.println("List prints in order list and can have duplicate value." );
    }



}
