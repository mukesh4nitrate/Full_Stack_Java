package DAY20;

import java.util.*;

public class Exceptionalhanding {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = null;

        try {
            System.out.println(22 / 2);  // ArithmeticException
            System.out.println(arr[335]);  // ArrayIndexOutOfBoundsException
            int num = sc.nextInt();      // InputMismatchException
            System.out.println("Input is correct: " + num);
        } 
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught");
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught");
        } 
        catch (InputMismatchException e) {
            System.out.println("InputMismatchException caught");
        } 
        catch (Exception e) {
            System.out.println("Some other exception caught");
        } 
        finally {
            System.out.println("Finally block always runs");
            sc.close();
        }
    }
}






