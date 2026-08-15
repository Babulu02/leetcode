class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> m = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char s1 = s.charAt(i);
            char t1 = t.charAt(i);
            if(m.containsKey(s1)){
                if(m.get(s1) != t1){
                    return false;
                }
            }
            else if(m.containsValue(t1)){
                return false;
            }
            m.put(s1, t1);
        }
        return true;
    }
}