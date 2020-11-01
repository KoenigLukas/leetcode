public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0 || strs[0].length() == 0) return "";
        int index = 0;
        while(checkEqual(strs,index)) index++;
        return strs[0].substring(0,index);
    }

    private boolean checkEqual(String[] strs, int index){
        for (String str : strs) {
            if(index == str.length()) return false;
            if(!(str.charAt(index) == strs[0].charAt(index))) return false;
        }
        return true;
    }
}
