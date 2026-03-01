class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int cnt = 0;
        for(int i = left; i <= right; i++){
            int si = words[i].charAt(0);
            int ei = words[i].charAt(words[i].length()-1);
            if(si == 'a' || si == 'e' || si == 'i' || si == 'u' || si == 'o'){
                if(ei == 'a' || ei == 'e' || ei == 'i' || ei == 'o' || ei == 'u'){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}