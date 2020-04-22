import java.sql.SQLOutput;

public class Solution2 {

    public static void main(String[] args) {
        System.out.println(myAtoi("-91283472332"));
      System.out.println(myAtoi("-785"));
    }

    public static int myAtoi(String str) {
        char[] arr = str.stripLeading().toCharArray();
        int ret = 0;

        boolean ispositiv = true;
        int in = 0;
        if (!(Character.isDigit(arr[in]) || arr[in] == '-' || arr[in] == '+')) return 0;
        if (arr[in] == '-') ispositiv = false;
        if (!(Character.isDigit(arr[in]))) in++;
        int val;
        while(in < arr.length && Character.isDigit(arr[in])){
            val = Character.getNumericValue(arr[in]);
            System.out.println(Integer.MAX_VALUE-(ret*10)+1 + " " + val);
            if(ret > 214748364)  return ispositiv ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            if(ret != 0 && ispositiv  && (Integer.MAX_VALUE-(ret*10)) <= val) return Integer.MAX_VALUE;
            if(ret != 0 && !ispositiv && (Integer.MIN_VALUE+(ret*10)) >= 0-val) return Integer.MIN_VALUE;
            ret *=10;
            ret += val;
            in++;
        }

        if(!ispositiv) ret *= -1;
        return ret;
    }
}
