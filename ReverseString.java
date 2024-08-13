public class ReverseString {
    public static String function1(String a) {
        StringBuilder sb = new StringBuilder(a);
        for (int i = 0; i < a.length() / 2; i++) {
            char front = a.charAt(i);
            char back = a.charAt(a.length() - i - 1);
            sb.setCharAt(i, back);
            sb.setCharAt(a.length() - i - 1, front);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String a = "ytilaer eht ot pu ekaw";
        System.out.println(function1(a));
    }
}
