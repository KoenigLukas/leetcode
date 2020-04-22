import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new LinkedList<>();
        HashMap<Character, Boolean> key = new HashMap<>();
        char[] sChar = s.toCharArray();
        char[] pChar = p.toCharArray();
        int slen = sChar.length;
        int plen = pChar.length;

        for (char c : pChar) {
            key.put(c,false);
        }


        for (int i = 0; i < slen-plen+1 ; i++) {
            boolean contains = true;
            for (int j = 0; j < plen; j++) {
               if(key.containsKey(sChar[i+j]) && key.get(sChar[i+j]) == false){
                   
               }
            }
            if(contains) list.add(i);
        }
        return list;
    }
}
