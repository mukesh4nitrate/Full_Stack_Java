package DAY22;

import java.util.*;

public class Arraylist {

    public static void main(String[] args) {

        // ✅ Step 1: Create and Add elements
        ArrayList<String> list = new ArrayList<>();
        list.add("Marco");                             // add(Object o)
        list.add("Mark");
        list.add(1, "Martin");                         // add(int index, Object o)
        System.out.println("List after add(): " + list);

        // ✅ Step 2: Add another collection
        ArrayList<String> moreNames = new ArrayList<>();
        moreNames.add("Meth");
        moreNames.add("Louis");

        list.addAll(moreNames);                        // addAll(Collection<?> c)
        list.addAll(2, Arrays.asList("Tom", "Jerry")); // addAll(int, Collection<?> c)
        System.out.println("List after addAll(): " + list);

        // ✅ Step 3: Access elements
        System.out.println("Element at index 3: " + list.get(3));   // get(index)
        System.out.println("Index of 'Martin': " + list.indexOf("Martin")); // indexOf()
        System.out.println("Last index of 'Marco': " + list.lastIndexOf("Marco")); // lastIndexOf()

        // ✅ Step 4: Check properties
        System.out.println("Is list empty? " + list.isEmpty());     // isEmpty()
        System.out.println("Does list contain 'Louis'? " + list.contains("Louis")); // contains()

        // ✅ Step 5: Modify elements
        list.set(0, "Rock");                         // set(index, Object)
        System.out.println("After set(0, 'Rock'): " + list);

        // ✅ Step 6: Remove operations
        list.remove(2);                              // remove(index)
        list.remove("Meth");                         // remove(Object)
        System.out.println("List after remove(): " + list);

        list.removeAll(Arrays.asList("Louis", "Mark")); // removeAll()
        System.out.println("After removeAll(): " + list);

        list.retainAll(Arrays.asList("Rock", "Jerry")); // retainAll()
        System.out.println("After retainAll(): " + list);

        // ✅ Step 7: Sublist and size
        list.add("Harry");
        list.add("Ron");
        List<String> subList = list.subList(0, 2);      // subList(from, to)
        System.out.println("Sublist from 0 to 2: " + subList);

        System.out.println("Size of list: " + list.size()); // size()

        // ✅ Step 8: Clear the list
        list.clear();                                 // clear()
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


