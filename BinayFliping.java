public class BinayFliping {

    public static int findComplement(int num) {

        String binary = Integer.toBinaryString(num);
        String flip = new String();
        for (char i : binary.toCharArray()) {
            if (i == '0')
                flip += '1';
            else
                flip += '0';
        }
        return Integer.parseInt(flip, 2);
    }

    public static void main(String[] args) {
        System.out.println(findComplement(10));// 1010 after fliping 0101 which will be 5.
    }
}
