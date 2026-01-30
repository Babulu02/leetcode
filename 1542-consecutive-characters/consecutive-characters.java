class Solution {
    public int maxPower(String s) {
        int count = 0;
        int max = Integer.MIN_VALUE;
        if(s.length() == 1) return 1;
        for(int i = 0; i < s.length()-1; i++){
            if(s.charAt(i) == s.charAt(i+1)){
                count++;
            }else{
                count = 0;
            }
            if(count > max){
                max = count;
            }
        }
        return max+1;
    }
}