class Solution {
    public boolean checkIfPangram(String sentence) {
        HashSet<Character> hs = new HashSet<>();
        char[] ch = sentence.toCharArray();
        for(char c : ch){
            hs.add(c);
        }
        if(hs.size() == 26){
            return true;
        }
        return false;
    }
}