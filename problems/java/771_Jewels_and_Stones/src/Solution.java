import java.util.Arrays;
import java.util.HashSet;

public class Solution {

    public int numJewelsInStones(String J, String S) {
        HashSet<Character> set = new HashSet<>();
        int count = 0;
        for (char c : J.toCharArray()) {
            set.add(c);
        }
        for (char c : S.toCharArray()) {
            if(set.contains(c)) count++;
        }
        return count;
    }

}
