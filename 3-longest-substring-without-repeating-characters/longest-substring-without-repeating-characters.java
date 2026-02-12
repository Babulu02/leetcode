class Solution {
    public int lengthOfLongestSubstring(String s) {
        int si = 0, ei = 0, max_len = 0;
        List<Character> li = new ArrayList<Character>();
        while(ei < s.length()){
            if(!li.contains(s.charAt(ei))){
                li.add(s.charAt(ei));
                ei++;
                max_len = Math.max(max_len, li.size());
            }
            else{
                li.remove(Character.valueOf(s.charAt(si)));
                si++;
            }
        }
        return max_len;
    }
}