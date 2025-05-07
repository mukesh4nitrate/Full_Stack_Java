//package DAY5;  // This just tells that the file is part of the 'DAY5' package
//
//import java.util.Scanner;  // This is for getting input from the user
//
//public class calculator{  // This is the class where all the code is written
//
//    public static void main(String[] args) {  // This is the main method that runs when the program starts
//        Scanner scanner = new Scanner(System.in);  // Create an object to get input from the user
//
//        // Step 1: Asking the user for the first number
//        System.out.print("Enter first number: ");
//        double num1 = scanner.nextDouble();  // Store the first number input by the user
//
//        // Step 2: Asking the user for the second number
//        System.out.print("Enter second number: ");
//        double num2 = scanner.nextDouble();  // Store the second number input by the user
//
//        // Step 3: Asking the user for the operation they want (+, -, *, /)
//        System.out.print("Choose operation (+, -, *, /): ");
//        char operator = scanner.next().charAt(0);  // Get the operator input by the user
//
//        double result = 0;  // Variable to store the result of the operation
//        boolean validOperation = true;  // Variable to check if the operation is valid
//
//        // Step 4: Performing the operation based on the user's choice
//        switch (operator) {
//            case '+':  // If user chooses plus
//                result = num1 + num2;  // Add the numbers
//                break;
//            case '-':  // If user chooses minus
//                result = num1 - num2;  // Subtract the numbers
//                break;
//            case '*':  // If user chooses multiplication
//                result = num1 * num2;  // Multiply the numbers
//                break;
//            case '/':  // If user chooses division
//                if (num2 != 0) {  // Check if the second number is not zero
//                    result = num1 / num2;  // Divide the numbers
//                } else {
//                    System.out.println("Error: Cannot divide by zero.");  // Handle division by zero error
//                    validOperation = false;  // Mark operation as invalid
//                }
//                break;
//            default:  // If user enters an invalid operator
//                System.out.println("Error: Invalid operator.");  // Show error message
//                validOperation = false;  // Mark operation as invalid
//        }
//
//        // Step 5: Display the result if the operation was valid
//        if (validOperation) {
//            System.out.println("Result: " + result);  // Show the result of the operation
//        }
//
//        // Step 6: Close the scanner object to avoid memory leaks
//        scanner.close();
//    }
//}
