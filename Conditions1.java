import java.util.*;

public class Conditions1 {
    // Function to find out to eligibile to vote or not.
    public static void voteOrNot(int age) {
        if (age >= 18)
            System.out.println("Eligible to vote");
        else
            System.out.println("Not Eligible to Vote");
    }

    // Function to find odd or even
    public static void oddOrEven(int no) {
        if (no % 2 == 0)
            System.out.println(no + " is a Even Number");
        else
            System.out.println(no + " is a Odd Number");
    }

    // Function to find which number is a greatest
    public static void greatestNumber(int a, int b) {
        if (a > b)
            System.out.println(a + " is the greatest number");
        else
            System.out.println(b + " is a Greatest Number");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // vote or not
        System.out.print("Enter age: ");
        int a = sc.nextInt();
        System.out.print("Enter a number: ");
        int b = sc.nextInt();
        voteOrNot(a);
        oddOrEven(a);
        greatestNumber(a, b);

    }

}
