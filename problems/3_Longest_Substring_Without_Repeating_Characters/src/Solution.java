import java.util.ArrayList;

public class Solution {




    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        ArrayList<Character> list = new ArrayList<>();
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            list.clear();
            for (int j = i; j < arr.length; j++) {
                if(!list.contains(arr[j])) list.add(arr[j]);
                else break;
            }
            if(list.size()>max) max = list.size();
        }
        return max;
    }

}
