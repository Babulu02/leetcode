class Solution {
    public int strStr(String haystack, String needle) {
        // if(needle.length() > haystack.length()) return -1;
        // for(int i = 0, j = needle.length(); j <= haystack.length(); i++,j++){
        //     if(haystack.substring(i,j).equals(needle)){
        //         return i;
        //     }
        // }
        // return -1;
        if(haystack.contains(needle)){
            return haystack.indexOf(needle);
        }
        return -1;
    }
}