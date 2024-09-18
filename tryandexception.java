import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

class LengthException extends Exception {
    LengthException(String password) {
        super(password);
    }
}

class SmallException extends Exception {
    SmallException(String password) {
        super(password);
    }
}

class CapitalException extends Exception {
    CapitalException(String password) {
        super(password);
    }
}

class SpecialException extends Exception {
    SpecialException(String password) {
        super(password);
    }
}

class DigitException extends Exception {
    DigitException(String password) {
        super(password);
    }
}

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

    public static void StrongPassword() {

        Scanner scan = new Scanner(System.in);
        String password = scan.nextLine();

        boolean digit = false, capital = false, small = false, special = false;

        try {
            if (password.length() < 12)
                throw new LengthException("Your password is Weak must contains Minimum 12 digits");

            for (int i = 0; i < password.length(); i++) {
                if (password.charAt(i) == '@' || password.charAt(i) == '$')
                    special = true;
                if (password.charAt(i) >= 'A' && password.charAt(i) <= 'Z')
                    capital = true;
                if (password.charAt(i) >= 'a' && password.charAt(i) <= 'z')
                    small = true;
                if (password.charAt(i) >= '0' && password.charAt(i) <= '9')
                    digit = true;
            }
            if (special == false)
                throw new SpecialException(" Your password must contains SpecialCharacters");
            if (digit == false)
                throw new DigitException("Your password must contains atleast one digit");
            if (small == false)
                throw new SmallException("Your password must contains atleast one smaller alpahabet");
            if (capital == false)
                throw new CapitalException("Your password must contains atleast one upper case letter");

            System.out.println("password set succesfull");
        } catch (LengthException e) {
            System.out.println(e.getMessage());
        } catch (SpecialException e) {
            System.out.println(e.getMessage());
        } catch (DigitException e) {
            System.out.println(e.getMessage());
        } catch (SmallException e) {
            System.out.println(e.getMessage());
        } catch (CapitalException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {

        // ArithmeticException();
        // fileReadingException();
        // InputMismatchException();
        // calculate();
        StrongPassword();

    }
}