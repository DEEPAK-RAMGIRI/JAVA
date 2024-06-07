import java.util.*;

public class ConditionsStatement {
    // Function to find out to eligibile to vote or not.
    public static void voteOrNot(int age) {
        if (age >= 18)
            System.out.println("Eligible to vote");
        else
            System.out.println("Not Eligible to Vote");
    }

    // Function to write the calculations using switch
    public static void caluclator(int n, int a, int b) {
        switch (n) {
            case 1:
                System.out.println("The Addition of " + a + " and " + b + " is:" + (a + b));
                break;

            case 2:
                System.out.println("The Subtraction of " + a + " and " + b + " is:" + (a - b));
                break;

            case 3:
                System.out.println("The Multiplication of " + a + " and " + b + " is:" + (a * b));
                break;

            case 4:
                System.out.println("The Division of " + a + " and " + b + " is:" + (a / b));
                break;

            case 5:
                System.out.println("The Subtraction of " + a + " and " + b + " is:" + (a * b));
                break;

            default:
                System.out.println("Invalid Number.");

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // vote or not
        System.out.print("Enter age: ");
        int a = sc.nextInt();
        voteOrNot(a);
        caluclator(1, 20, 30);
    }
}
