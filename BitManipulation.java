public class BitManipulation {
    public static int bitwiseComplement(int n) {
        // compliment of the value in base 10 binary bit
        if (n == 0)
            return 1;
        int mask = 0, temp = n;
        while (n != 0) {
            mask = mask << 1;
            mask = mask | 1;
            n = n >> 1;
        }
        return (~temp) & mask;
    }

    public static void getBit(int n) {
        // Function to find out bit value at the certain position
        int position = 2;// finding secound position value in binary bit format (n=5) 101 must return 1
                         // remember index value starts from 0
        int bitmask = 1 << position;// 0100
        if ((bitmask & n) == 0)
            System.out.println("0");
        else
            System.out.println("1");
    }

    public static void setBit(int n) {
        // Function to change the bit value at the certain position
        // n=5 0101 after changing seting first value 0111
        int position = 1;// changes occur either 0 or 1 only
        int bitmask = 1 << position;// 0010
        System.out.println(bitmask | n);// 111 = 7 is answer
    }

    public static void clearBit(int n) {
        // n==5 0101 clearing the 2nd position 0001
        // Function to change the bit value at the certain position
        int position = 2;// changes occur 1 to 0 only
        int bitmask = 1 << position;
        System.out.println(~(bitmask) & n);
    }

    // Finding only single Element in the array

    public static void findUniqueNoinarray(int a[]) {
        int result = 0;
        for (int i : a)
            result = result ^ i;
        System.out.println("the Unique number in the given array is:" + result);
    }

    public static void main(String[] args) {
        int n = bitwiseComplement(5);
        System.out.println(n);
        getBit(5);
        setBit(5);
        clearBit(5);
        // update bit also a bit manuplation which have two ways 1 to0 and 0 to 1
        // for 0 to 1 setbit operation method only
        // for 1 to 0 clear operationonly.
        int a[] = { 1, 1, 2, 2, 4, 5, 5 };
        findUniqueNoinarray(a);
    }
}
