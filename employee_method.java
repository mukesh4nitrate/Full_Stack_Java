package DAY11;

public class employee_method {

    // Method to display employee details
    public static void displayEmployeeDetails(String name, String phone, double salary, int rollNo) {
        System.out.println("Employee Name: " + name);
        System.out.println("Phone Number: " + phone);
        System.out.println("Salary: " + salary);
        System.out.println("Roll Number: " + rollNo);
    }

    public static void main(String[] args) {
        // Example employee details
        String name = "Alice Smith";
        String phone = "987-654-3210";
        double salary = 60000;
        int rollNo = 102;

        // Calling method to display employee details
        displayEmployeeDetails(name, phone, salary, rollNo);
    }
}
