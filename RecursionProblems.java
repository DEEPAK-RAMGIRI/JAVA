import java.util.*;

public class RecursionProblems {
    public static int first = -1;
    public static int last = -1;

    public static int factorial(int n) {
        // Function about Factorisal 5*4*3*2*1 =120
        if (n == 0)
            return 1;
        return n * factorial(n - 1);
    }

    public static void fibanacci(int a, int b, int n) {
        // Function about Fibanacci 0 1 1 2 3 5 8
        if (n == 0)
            return;
        int c = a + b;
        System.out.print(c + " ");
        fibanacci(b, c, n - 1);
    }

    public static int toThePower(int x, int n) {// Stack height = logn;
        // X^n =2^2 =4 //by recursion function
        if (n == 0)
            return 1;
        if (x == 0)
            return 0;
        if (n % 2 == 0)
            return toThePower(x, n / 2) * toThePower(x, n / 2);
        else
            return toThePower(x, n / 2) * toThePower(x, n / 2) * x;
    }

    public static void towerOfHonnoi(int n, String source, String helper, String destination) {
        // n = number of boxs in the honnoi
        // Time complexcity O(2^n)
        if (n == 1) {
            System.out.println("Transfer " + n + " from " + source + " to " + destination);
            return;
        }
        towerOfHonnoi(n - 1, source, destination, helper);
        System.out.println("Transfer " + n + " from " + source + " to " + destination);
        towerOfHonnoi(n - 1, helper, source, destination);

    }

    public static void reverseString(String name, int size) {
        // Reverse of string using recursion
        if (size < 0)
            return;
        System.out.print(name.charAt(size));
        reverseString(name, size - 1);

    }

    public static void firstAndLastOcuurences(String str, int n, char element) {
        // function in which it will give first and last occurence of alphabhets in the
        // given string
        if (n == str.length()) {
            System.out.println("\nFirst Occurenece: " + first);
            System.out.println("Last Occurence: " + last);
            return;
        }
        if (str.charAt(n) == element) {
            if (first == -1)
                first = n;
            else
                last = n;
        }
        firstAndLastOcuurences(str, n + 1, element);

    }

    public static boolean strictlySorted(int a[], int n) {
        // Function to tell that the array is strictly sorted or not
        // strictly sorted means = (correct) 1 2 3 4 5 6 ,(wrong) 1 2 3 4 4
        // Time Complexcity = O(n)
        if (n == a.length)
            return true;
        if (a[n] < a[n + 1])
            strictlySorted(a, n + 1);
        return false;
    }

    public static void endOfString(String str, String originalString, int index, int count) {
        // in this function it will add x at the last and alphabets at first
        // Time Complexcity = O(n)
        if (index == str.length()) {
            for (int i = 0; i < count; i++)
                originalString += 'x';
            System.out.println(originalString);
            return;
        }
        if (str.charAt(index) == 'x')
            count++;
        else
            originalString += str.charAt(index);
        endOfString(str, originalString, index + 1, count);

    }

    public static boolean[] map = new boolean[26];// boolean intitally intailzed with the false to store aplhabetics
                                                  // order

    public static void deleteDuplicates(String Str, String NewString, int Index) {
        // Time complexcity is O(n)
        if (Index == Str.length()) {
            System.out.println(NewString);
            return;
        }
        if (map[Str.charAt(Index) - 'a'])
            deleteDuplicates(Str, NewString, Index + 1);
        else {
            NewString += Str.charAt(Index);
            map[Str.charAt(Index) - 'a'] = true;
            deleteDuplicates(Str, NewString, Index + 1);
        }

    }

    public static void printingSubsequence(String Str, int index, String newString) {
        // Time complexcity O(2^n)
        if (index == Str.length()) {
            System.out.println(newString);
            return;
        }
        printingSubsequence(Str, index + 1, newString + Str.charAt(index));
        printingSubsequence(Str, index + 1, newString);
    }

    public static void uniquePrintingSubsequence(String Str, int index, String newString, HashSet<String> set) {
        // Time complexcity O(2^n)
        if (Str.length() == index) {
            if (set.contains(newString))
                return;
            else {
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        uniquePrintingSubsequence(Str, index + 1, newString + Str.charAt(index), set);
        uniquePrintingSubsequence(Str, index + 1, newString, set);
    }

    public static String[] keyboard = { ".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static void printCombinations(String str, int index, String combination) {
        // Time complexcity for O(4^n)
        // For these number of string is 4 (pqrs) that why time complexcity is O(4^n)
        if (str.length() == index) {
            System.out.println(combination);
            return;
        }
        String mapping = keyboard[str.charAt(index) - '0'];
        for (int i = 0; i < mapping.length(); i++)
            printCombinations(str, index + 1, combination + mapping.charAt(i));
    }

    public static void main(String[] args) {
        System.out.println("Factorial of 5 is: " + factorial(5));
        System.out.print("Fibancci Series of first 7 digits are :" + 0 + " " + 1 + " ");
        fibanacci(0, 01, 5);
        System.out.println("\nThe power is: " + toThePower(2, 2));
        System.out.println("\nTower of Honnoi Game");
        towerOfHonnoi(3, "SOURCE", "HELPER", "DESTINATION");
        System.out.print("\nReverse of string Deepak is: ");
        reverseString("Deepak", 5);
        System.out.println();
        firstAndLastOcuurences("abaacdaefaah", 0, 'a');// Time Complexcity is O(n);
        int a[] = { 1, 2, 3, 4, 5 };
        if (strictlySorted(a, a.length) == true)
            System.out.println("\n { 1, 2, 3, 4, 5 } yes it is sorted");
        else
            System.out.println("\n m No it is not sorted");

        System.out.print("\nGiven string axbcxxd and converrted into: ");
        endOfString("axbcxxd", " ", 0, 0);
        System.out.print("\ndeleting the duplicate values abaacdaeefagah:");
        deleteDuplicates("abaacdaeefagah", "", 0);
        System.out.println("\nPrinting subsequences for the string abc are: ");
        printingSubsequence("abc", 0, "");
        System.out.println("\nPrinting uniquesubsequences for the string aaa are: ");
        HashSet<String> set = new HashSet<>();
        uniquePrintingSubsequence("aaa", 0, "", set);
        System.out.println("combinations are: ");
        printCombinations("23", 0, "");
    }
}
