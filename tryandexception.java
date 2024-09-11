import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class tryandexception {

    public static void ArithmeticException() {
        // Division by Zero Handling: Write a function safe_divide(a, b) that takes two
        // numbers, a and b, and returns the result of a / b. If a division by zero
        // occurs, catch the exception and return the string "Cannot divide by zero".

        Scanner scan = new Scanner(System.in);
        try {
            int c = scan.nextInt() / scan.nextInt();
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("cannot divide" + e.getMessage());
        } finally {
            scan.close();
        }
    }

    public static void fileReadingException() {
        // File Reading with Exception Handling: Write a program that tries to open and
        // read a file named "data.txt". If the file is not found, catch the
        // FileNotFoundError and print "File not found. Please check the file path.".
        try {
            File file = new File("E://file.txt");
            FileReader fr = new FileReader(file);
        } catch (FileNotFoundException e) {
            System.out.println("File is not found" + e.getMessage());
        }
    }

    public static void InputMismatchException() {
        // Invalid Input Handling: Write a function get_integer() that prompts the user
        // to enter an integer. Use try and except to catch ValueError if the input is
        // not an integer, and keep prompting until a valid integer is entered.
        Scanner scan = new Scanner(System.in);
        try {
            int b = scan.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("enter the valid number" + e.getMessage());
        } finally {
            scan.close();
        }

    }

    public static void calculate() {

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        char operend = scan.next().charAt(0);

        try {
            switch (operend) {

                case '+':
                    System.out.println("Addition is: " + (a + b));
                    break;

                case '-':
                    System.out.println("Subtraction is: " + (a - b));
                    break;

                case '*':
                    System.out.println("Multiplication is: " + (a * b));
                    break;

                case '/':
                    if (b == 0)
                        throw new ArithmeticException("Cannot Divide By zero");
                    System.out.println("Division is: " + (a / b));
                    break;

                default:
                    throw new IllegalArgumentException("Inavlid Operand");
            }
        } catch (ArithmeticException e) {
            System.out.println("" + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("" + e.getMessage());
        } finally {
            scan.close();
        }
    }

    public static void main(String[] args) {

        // ArithmeticException();
        // fileReadingException();
        // InputMismatchException();
        calculate();

    }
}