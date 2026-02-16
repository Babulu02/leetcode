class Solution {
    public String reverseOnlyLetters(String s) {
        char[] ch = s.toCharArray();
        int si = 0;
        int ei = s.length()-1;
        while(si < ei){
            if(!Character.isLetter(s.charAt(si))){
                si++;
            }
            else if(!Character.isLetter(s.charAt(ei))){
                ei--;
            }
            else{
                char temp = ch[si];
                ch[si] = ch[ei];
                ch[ei] = temp;
                si++;ei--;
            }
        }
        return String.valueOf(ch);
    }
}