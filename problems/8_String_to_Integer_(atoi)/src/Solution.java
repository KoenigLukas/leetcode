public class Solution {
    public int myAtoi(String str) {
        char[] arr = str.stripLeading().toCharArray();
        char[] ret = new char[arr.length];

        if(arr.length == 0) return 0;

        boolean ispositiv = true;
        int in = 0;
        if (!(Character.isDigit(arr[in]) || arr[in] == '-' || arr[in] == '+')) return 0;
        if (arr[in] == '-') ispositiv = false;
        if (!(Character.isDigit(arr[in]))) in++;


        int inret = 0;
        while (in < arr.length && Character.isDigit(arr[in])) {
            ret[inret] = arr[in];
            in++;
            inret++;
        }


        int retval = 0;
        try {
            retval = Integer.parseInt(String.valueOf(ret).trim());
        } catch (NumberFormatException e) {
            if(inret == 0) return 0;
            if (arr[0] == '-'){
                retval = Integer.MIN_VALUE;
            } else{
                retval = Integer.MAX_VALUE;
            }
        }

        if (arr[0] == '-') retval *= -1;

        return retval;
    }
}
