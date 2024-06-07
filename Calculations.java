import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int a = Sc.nextInt(); // 2
        int b = Sc.nextInt(); // 2
        System.out.println("The Addition of " + a + " and " + b + " is:" + (a + b));// 4
        // Bracket is nessary here (a+b) if u dont put brackets then it will give output
        // as 22 for above
        System.out.println("The division of " + a + " and " + b + " is:" + (a / b));// 1
        System.out.println("The Subtraction of " + a + " and " + b + " is:" + (a - b));// 0
        System.out.println("The Remainder of " + a + " and " + b + " is:" + (a % b));// 0

    }
}
