package DAY24;

import java.util.Scanner;

public class UserInterface{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeService service = new EmployeeService();

        while (true) {
            System.out.println("\n--- Employee Management ---");
            System.out.println("1. Add Employee");
            System.out.println("2. View All Employees");
            System.out.println("3. View Employee by ID");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Salary: ");
                    double salary = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Enter Department: ");
                    String dept = scanner.nextLine();

                    Employee emp = new Employee(id, name, salary, dept);
                    service.addEmployee(emp);
                    System.out.println("Employee added!");
                    break;

                case 2:
                    System.out.println("\n--- All Employees ---");
                    for (Employee e : service.getEmployees()) {
                        System.out.println(e);
                    }
                    break;

                case 3:
                    System.out.print("Enter Employee ID: ");
                    int searchId = scanner.nextInt();
                    Employee found = service.getEmployeeById(searchId);
                    if (found != null) {
                        System.out.println(found);
                    } else {
                        System.out.println(" Employee not found.");
                    }
                    break;

                case 4:
                    System.out.println("Goodbye!");
                    return;

                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}
