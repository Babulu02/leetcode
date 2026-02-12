class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^A-Za-z0-9]", "");
        int si=0, ei = s.length()-1;
        while(si <= ei){
            if(s.charAt(si) != s.charAt(ei)){
                return false;
            }
            si++; ei--;
        }
        return true;
    }
}