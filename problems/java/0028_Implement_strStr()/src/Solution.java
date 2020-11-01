public class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.compareTo(needle) == 0) return 0;
        if(haystack.isEmpty()) return -1;
        if(needle.isEmpty()) return 0;
        for (int i = 0; i < haystack.length()-needle.length(); i++) {
            if(haystack.charAt(i) != needle.charAt(0)) continue;
            else{
                boolean flag = true;
                for (int j = 0; j <= needle.length(); j++) {
                    if(haystack.charAt(i+j) != needle.charAt(j)) flag = false;
                }
                if(flag) return i;
            }
        }
        return -1;
    }
}
