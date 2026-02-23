class Solution {
    public boolean isAcronym(List<String> words, String s) {
        StringBuilder sb = new StringBuilder();
        for(String ch : words){
            sb.append(ch.charAt(0));
        }
        return sb.toString().equals(s);
    }
}