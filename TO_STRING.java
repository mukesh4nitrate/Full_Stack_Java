package DAY13;

public class TO_STRING {
    private String name = "Alice";

    @Override
    public String toString() {
        return name;
    }

    public static void main(String[] args) {
        System.out.println(new TO_STRING());  // Automatically calls toString() method
    }
}
