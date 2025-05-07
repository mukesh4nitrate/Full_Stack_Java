package DAY13;

public class GET_SET {
    
    private String name;  // Private variable

    // Getter method
    public String getName() {
        return name;
    }

    // Setter method
    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        GET_SET obj = new GET_SET();  // Create object of GET_SET
        obj.setName("Alice");  // Set value using setter
        System.out.println(obj.getName());  // Get value using getter
    }
}
