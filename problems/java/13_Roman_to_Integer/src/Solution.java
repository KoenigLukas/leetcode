public class Solution {


//    I -> 1
//    V -> 5
//    X -> 10
//    L -> 50
//    C -> 100
//    D -> 500
//    M -> 1000

//    I can be placed before V (5) and X (10) to make 4 and 9.
//    X can be placed before L (50) and C (100) to make 40 and 90.
//    C can be placed before D (500) and M (1000) to make 400 and 900.

    public int romanToInt(String s) {
        int ret = 0;
        int c = ' ';
        int len = s.length();
        for (int i = 0; i < len; i++) {
            if (i + 1 < len) {
                c = s.charAt(i+1);
            }
                if (s.charAt(i) == 'I') {
                    if (c == 'V') {
                        ret += 4;
                        i++;
                    } else if (c == 'X') {
                        ret += 9;
                        i++;
                    } else ret += 1;
                } else if (s.charAt(i) == 'X') {
                    if (c == 'L') {
                        ret += 40;
                        i++;
                    } else if (c == 'C') {
                        ret += 90;
                        i++;
                    } else ret += 10;
                } else if (s.charAt(i) == 'C') {
                    if (c == 'D') {
                        ret += 400;
                        i++;
                    } else if (c == 'M') {
                        ret += 900;
                        i++;
                    } else ret += 100;
                } else if(s.charAt(i) == 'V') ret += 5;
                else if(s.charAt(i) == 'L') ret += 50;
                else if (s.charAt(i) == 'D') ret += 500;
                else if (s.charAt(i) == 'M') ret += 1000;
            }
        return ret;
    }
}
