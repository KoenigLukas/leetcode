public class Solution {

    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
    }

    public static int reverse(int x) {
        char[] in = Integer.toString(x).toCharArray();
        char[] ret = new char[in.length];
        int start = 0;
        if(in[0] == '-'){
            ret[0] = '-';
            start = 1;
        }
        int j = in.length-1;
        for (int i = start; i < in.length; i++) {
            ret[i] = in[j];
            j--;
        }
        int retint = 0;
        try{
            retint = Integer.parseInt(String.valueOf(ret));
        } catch (NumberFormatException e){
        }
        return  retint;
    }
}
