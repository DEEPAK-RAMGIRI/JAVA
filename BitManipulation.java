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

    // Cahnageing the number or fliping the number to get goal state
    public static int minBitFlips(int start, int goal) {
        int ans = 0;
        int xor = start ^ goal;

        while (xor != 0) {
            ans += xor & 1;
            xor >>= 1;
        }
        return ans;
    }

    /*
     * Input: arr = [1,3,4,8], queries = [[0,1],[1,2],[0,3],[3,3]]
     * Output: [2,7,14,8]
     * Explanation:
     * The binary representation of the elements in the array are:
     * 1 = 0001
     * 3 = 0011
     * 4 = 0100
     * 8 = 1000
     * The XOR values for queries are:
     * [0,1] = 1 xor 3 = 2
     * [1,2] = 3 xor 4 = 7
     * [0,3] = 1 xor 3 xor 4 xor 8 = 14
     * [3,3] = 8
     */
    public static int[] xorQueries(int[] arr, int[][] queries) {
        int xorArray[] = new int[arr.length + 1];

        for (int i = 1; i < arr.length + 1; i++)
            xorArray[i] = arr[i - 1] ^ xorArray[i - 1];

        int[] ans = new int[queries.length];
        int k = 0;

        for (int[] i : queries)
            ans[k++] = xorArray[i[1] + 1] ^ xorArray[i[0]];

        return ans;

    }

    public static void main(String[] args) {
        // int n = bitwiseComplement(5);
        // System.out.println(n);
        // getBit(5);
        // setBit(5);
        // clearBit(5);
        // update bit also a bit manuplation which have two ways 1 to0 and 0 to 1
        // for 0 to 1 setbit operation method only
        // for 1 to 0 clear operationonly.
        // int a[] = { 1, 1, 2, 2, 4, 5, 5 };
        // findUniqueNoinarray(a);
        // System.out.println(minBitFlips(10, 7)); // 3 flips need to change the 10 to 7
        int arr[] = { 1, 3, 4, 8 };
        int queries[][] = { { 0, 1 }, { 1, 2 }, { 0, 3 }, { 3, 3 } };
        int ans[] = xorQueries(arr, queries);
        for (int i : ans)
            System.out.print(i);

    }
}
