class Solution {
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        HashMap<String, Boolean> hm = new HashMap<>();
        Set<String> hs = new HashSet<>();
        for(String str : words){
            hs.add(str);
        }
        List<String> res = new ArrayList<>();
        for(int i = 0; i < words.length; i++){
            if(isConcat(words[i], hs, hm)){
                res.add(words[i]);
            }
        }
        return res;
    }
    public static boolean isConcat(String str, Set<String> hs, HashMap<String, Boolean> hm){
        if(hm.containsKey(str)){
            return hm.get(str);
        }
        for(int i = 0; i < str.length(); i++){
            String prefix = str.substring(0, i+1);
            String suffix = str.substring(i+1, str.length());
            if(hs.contains(prefix) && hs.contains(suffix) || hs.contains(prefix) && isConcat(suffix,hs,hm)){
                hm.put(str, true);
                return true;
            }
        }
        hm.put(str, false);
        return false;
    }
}