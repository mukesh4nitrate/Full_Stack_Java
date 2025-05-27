package DAY23;
import java.util.ArrayList;
import java.util.Collections;
public class list {
public static void main(String[] args) {

ArrayList l1= new ArrayList();

l1.add(10);
l1.add(20);
l1.add(30);
l1.add(40);
l1.add(50);

l1.add("DAN");
l1.add("CHIN");
l1.add("CHAN");
l1.add("CAL");
l1.add("AZURE");


ArrayList<Integer> l2 = new ArrayList<>();
ArrayList<String> l3 = new ArrayList<>();

for (Object obj : l1) {
    if (obj instanceof Integer)
        l2.add((Integer) obj);
    else if (obj instanceof String)
        l3.add((String) obj);
}
System.out.println(l2);
System.out.println(l3);

//Collections.sort(l2); 
//Collections.sort(l3); 

ArrayList<Object> merged = new ArrayList<>();
merged.addAll(l2); 
merged.addAll(l3); 


System.out.println("Sorted Integers: " + l2);
System.out.println("Sorted Strings: " + l3);
System.out.println("Merged List: " + merged);
}}

