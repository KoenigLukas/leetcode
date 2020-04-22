public class Solution2 {

    public String defangIPaddr(String address){
        StringBuilder b = new StringBuilder();
        for(char c : address.toCharArray()){
            if(Character.isDigit(c)) b.append(c);
            else b.append("[.]");
        }
        return b.toString();
    }

}

