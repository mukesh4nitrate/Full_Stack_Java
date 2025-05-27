package DAY22;

import java.util.*;

public class Arraylist {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Marco");                       
        list.add("Mark");
        list.add(1, "Martin");                        
        System.out.println("List after add(): " + list);


        ArrayList<String> moreNames = new ArrayList<>();
        moreNames.add("Meth");
        moreNames.add("Louis");

        list.addAll(moreNames);                        
        list.addAll(2, Arrays.asList("Tom", "Jerry")); 
        System.out.println("List after addAll(): " + list);

   
        System.out.println("Element at index 3: " + list.get(3));   
        System.out.println("Index of 'Martin': " + list.indexOf("Martin")); 
        System.out.println("Last index of 'Marco': " + list.lastIndexOf("Marco")); 

        
        System.out.println("Is list empty? " + list.isEmpty());     
        System.out.println("Does list contain 'Louis'? " + list.contains("Louis")); 

       
        list.set(0, "Rock");                        
        System.out.println("After set(0, 'Rock'): " + list);

      
        list.remove(2);                            
        list.remove("Meth");                      
        System.out.println("List after remove(): " + list);

        list.removeAll(Arrays.asList("Louis", "Mark")); 
        System.out.println("After removeAll(): " + list);

        list.retainAll(Arrays.asList("Rock", "Jerry")); 
        System.out.println("After retainAll(): " + list);

       
        list.add("Harry");
        list.add("Ron");
        List<String> subList = list.subList(0, 2);     
        System.out.println("Sublist from 0 to 2: " + subList);

        System.out.println("Size of list: " + list.size()); )

       
        list.clear();                               
        System.out.println("After clear(), isEmpty? " + list.isEmpty());
    }
}


//package DAY22;
//
//import java.util.ArrayList;
//
//public class Arraylist {
//
//public static void main(String[] args) {
//
//ArrayList <Integer>l1 = new ArrayList<Integer>();
//
//l1.add(2);
//l1.add(3);
//l1.addAll(l1);
//l1.remove(2);
//l1.clear();
//System.out.println(l1);
//
//ArrayList <String>l2 = new ArrayList<String>();
//l2.add("marco");
//l2.add("mark");
//l2.add("martin");
//l2.addAll(l2);
//System.out.println("martin, mark, meth, marco");
//
//ArrayList <String>l3 = new ArrayList<String>();
//l3.add("arco");
//l3.add("ark");
//l3.add("art");
//l3.addAll(l2);
//l3.addFirst("rock");
//l3.addLast("louis");
//System.out.println(l3);
//Syste


