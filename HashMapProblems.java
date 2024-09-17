import java.util.*;

public class HashMapProblems {

    public static String[] uncommonFromSentences(String s1, String s2) {

        HashMap<String, Integer> map = new HashMap<>();

        String sent1[] = s1.split(" ");
        String sent2[] = s2.split(" ");

        List<String> unCommon = new ArrayList<>();

        for (String i : sent1)
            map.put(i, map.getOrDefault(i, 0) + 1);
        for (String i : sent2)
            map.put(i, map.getOrDefault(i, 0) + 1);

        for (Map.Entry<String, Integer> set : map.entrySet()) {
            if (set.getValue() == 1)
                unCommon.add(set.getKey());
        }
        return unCommon.toArray(new String[0]);
    }

    public static void main(String[] args) {

        String s1 = "this apple is sweet";
        String s2 = "this apple is sour";

        System.out.println(Arrays.toString(uncommonFromSentences(s1, s2)));
    }
}
