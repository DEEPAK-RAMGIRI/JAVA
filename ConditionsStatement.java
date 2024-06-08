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
                System.out.println("The Remainder of " + a + " and " + b + " is:" + (a % b));
                break;

            default:
                System.out.println("Invalid Number.");

        }
    }

    // Function to find prime number or not
    public static void primeNumberOrNot(int n) {
        boolean isprime = true;
        for (int i = 2; i < (n / 2); i++) {// "i" runs from the 2 becoz 1 is divisible by all :)
            if (n % i == 0) {
                isprime = false;
                break;
            }
        }
        if (isprime) {
            if (n == 1)
                System.out.println("one is neither composite nor prime number");
            else
                System.out.println(n + " is a Prime number");
        } else
            System.out.println(n + " is not a Prime number");
    }

    public static void main(String[] args) {
        // vote or not
        voteOrNot(20);
        // calcualtor
        // 1: addition, 2:subtraction, 3:multiplication, 4:division,5:Remainder
        caluclator(1, 20, 30);
        // prime or not
        primeNumberOrNot(7);
    }
}
