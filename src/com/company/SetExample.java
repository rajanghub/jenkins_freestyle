package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.stream.Collectors;

public class SetExample {
    HashSet<String> hashSet1 = new HashSet<>();

    HashSet<Book> hashSetBook = new HashSet<>();

    LinkedHashSet<Integer> lhs = new LinkedHashSet<>();

    TreeSet<Integer> ths = new TreeSet<>();

    public SetExample()
    {
        hashSet1.add("Nepal");
        hashSet1.add("USA");
        hashSet1.add("UK");
        hashSet1.add("UK");

        hashSetBook.add(new Book(1,"Book1"));
        hashSetBook.add(new Book(1,"Book1"));
        hashSetBook.add(new Book(3,"Book3"));

        lhs.add(2);
        lhs.add(8);
        lhs.add(8);


        ths.add(2);
        ths.add(5);
        ths.add(6);
        ths.add(8);
        ths.add(8);

    }

    public void printHashSet()
    {
        System.out.println("HahsSet elements " + hashSet1);
        Iterator iHS = hashSet1.iterator();
        while(iHS.hasNext())
        {
            System.out.println(iHS.next() + " ");
        }
        System.out.println("HashSet size " + hashSet1.size());
        System.out.println("HashSet does not maintain insertion order and cannot have duplicate value will replace the exiting one.");
        System.out.println("#################");
       // System.out.println(hashSetBook);
        for(Book b: hashSetBook)
        {
            System.out.println(b);
        }
        System.out.println("#################");

        hashSet1.stream().forEach(entry -> {
           if(entry.contains("Nepal")){
               System.out.println("filter" + entry);
           }
        });

       List<String> str1 = hashSet1.stream().filter(entry -> entry.contains("Nepal")).map(entry -> entry.toLowerCase()).collect(Collectors.toList());
       str1.stream().forEach(System.out::println);
       for(String s : str1){
           System.out.println(s);
    }

       List<Integer> numbers = Arrays.asList(new Integer[]{2,3,4,5,3,2});
    Integer sum= numbers.stream().reduce(1,(a,b) -> a*b);
        System.out.println(sum);
        System.out.println(numbers.stream().reduce(Integer::max).get());
        System.out.println(numbers.stream().reduce(Integer::sum).get());
    }



    public void printLinkedHashSet()
    {
        System.out.println("LinnkedHahsSet elements " + lhs);
        Iterator iHS = lhs.iterator();
        while(iHS.hasNext())
        {
            System.out.println(iHS.next() + " ");
        }
        System.out.println("HashSet size " + lhs.size());
        System.out.println("LinkedHashSet maintains insertion order and cannot have duplicate value will replace the exiting one.");
    }


    public void printTreeSet()
    {
        System.out.println("TreeSet elements " + ths);
        Iterator iHS = ths.iterator();
        while(iHS.hasNext())
        {
            System.out.println(iHS.next() + " ");
        }
        System.out.println("HashSet size " + ths.size());
        System.out.println("TreeSet elements are sorted in ascending order and cannot have duplicate value will replace the exiting one.");
    }
}
