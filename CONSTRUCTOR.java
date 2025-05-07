package DAY12;

public class CONSTRUCTOR {

    String name;

    // Constructor to initialize the name
    public CONSTRUCTOR(String name) {
        this.name = name;
    }

    // Method to display the name
    public void display() {
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        // Creating an object using the constructor
        CONSTRUCTOR obj = new CONSTRUCTOR("John");

        // Displaying the name
        obj.display();
    }
}
