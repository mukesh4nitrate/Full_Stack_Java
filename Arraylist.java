package DAY22;

import java.util.ArrayList;

public class Arraylist {

public static void main(String[] args) {

ArrayList <Integer>l1 = new ArrayList<Integer>();

l1.add(2);
l1.add(3);
l1.addAll(l1);
l1.remove(2);
l1.clear();
System.out.println(l1);

ArrayList <String>l2 = new ArrayList<String>();
l2.add("marco");
l2.add("mark");
l2.add("martin");
l2.addAll(l2);
System.out.println("martin, mark, meth, marco");

ArrayList <String>l3 = new ArrayList<String>();
l3.add("arco");
l3.add("ark");
l3.add("art");
l3.addAll(l2);
l3.addFirst("rock");
l3.addLast("louis");
System.out.println(l3);
System.out.println(l3.getFirst());
}}

