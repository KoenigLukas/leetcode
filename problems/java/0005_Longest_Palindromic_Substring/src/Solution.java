public class Solution {

    public static void main(String[] args) {
        System.out.println("Test1: " + longestPalindrome("c") + "\t\tExpected: c");
        System.out.println("Test2: " + longestPalindrome("cbbd") + "\t\tExpected: bb");
        System.out.println("Test3: " + longestPalindrome("bacbad") + "\t\tExpected: b");
        System.out.println("Test4: " + longestPalindrome("babad") + "\t\tExpected: bab");
        System.out.println("Test5: " + longestPalindrome("ccbd") + "\t\tExpected: cc");
        System.out.println("Test6: " + longestPalindrome("bdcbab") + "\t\tExpected: bab");
        System.out.println("Test7: " + longestPalindrome("ljgeraiocacabgjrhgahgacbababaccaac") + "\t\tExpected: babab");
        System.out.println("Test8: " + longestPalindrome("kyyrjtdplseovzwjkykrjwhxquwxsfsorjiumvxjhjmgeueafubtonhlerrgsgohfosqssmizcuqryqomsipovhhodpfyudtusjhonlqabhxfahfcjqxyckycstcqwxvicwkjeuboerkmjshfgiglceycmycadpnvoeaurqatesivajoqdilynbcihnidbizwkuaoegmytopzdmvvoewvhebqzskseeubnretjgnmyjwwgcooytfojeuzcuyhsznbcaiqpwcyusyyywqmmvqzvvceylnuwcbxybhqpvjumzomnabrjgcfaabqmiotlfojnyuolostmtacbwmwlqdfkbfikusuqtupdwdrjwqmuudbcvtpieiwteqbeyfyqejglmxofdjksqmzeugwvuniaxdrunyunnqpbnfbgqemvamaxuhjbyzqmhalrprhnindrkbopwbwsjeqrmyqipnqvjqzpjalqyfvaavyhytetllzupxjwozdfpmjhjlrnitnjgapzrakcqahaqetwllaaiadalmxgvpawqpgecojxfvcgxsbrldktufdrogkogbltcezflyctklpqrjymqzyzmtlssnavzcquytcskcnjzzrytsvawkavzboncxlhqfiofuohehaygxidxsofhmhzygklliovnwqbwwiiyarxtoihvjkdrzqsnmhdtdlpckuayhtfyirnhkrhbrwkdymjrjklonyggqnxhfvtkqxoicakzsxmgczpwhpkzcntkcwhkdkxvfnjbvjjoumczjyvdgkfukfuldolqnauvoyhoheoqvpwoisniv") + "\t\tExpected: qahaq");
    }


    public static String longestPalindrome(String s) {
        int len = s.length();
        if (len <= 1) return s;
        String substring = "";
        boolean flag = true;
        for (int i = 0; i < len; i++) {
            for (int j = len - 1; j > i; j--) {
                flag = true;
                for (int k = 0; k <= (j - i)/2; k++) {
                    if (s.charAt(i + k) != s.charAt(j - k)) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    if (((j+1) - i) > substring.length()) substring = s.substring(i, j + 1);
                    if(substring.length() == len) return substring;
                }
            }
        }
        if (substring.equals("")) substring = s.substring(0, 1);
        return substring;
    }

}
