public class Solution {

    public static void main(String[] args) {
        System.out.println("\n" + convert("PAYPALISHIRING", 4));
    }

    public static String convert(String s, int numRows) {
        char[][] zizag = new char[numRows][s.length()];
        char[] str = s.toCharArray();
        boolean flag = true;
        int i = 0;
        int y = 0;
        while (flag) {
            if (i == str.length) flag = false;

            for (int j = 0; j < numRows; j++) {
                if (i == str.length) {
                    flag = false;
                    break;
                }
                zizag[j][y] = str[i];
                i++;
            }
            y++;
            for (int j = numRows - 2; j > 0; j--) {
                if (i == str.length) {
                    flag = false;
                    break;
                }
                zizag[j][y] = str[i];
                i++;
                y++;
            }
        }
        char[] ret = new char[str.length];
        int x = 0;
        for (char[] chars : zizag) {
            for (char c : chars) {

                if (c != '\0') {
                    ret[x] = c;
                    x++;
                    System.out.print(c);
                } else System.out.print('.');
            }
            System.out.print("\n");
        }
        return String.valueOf(ret);
    }
}
