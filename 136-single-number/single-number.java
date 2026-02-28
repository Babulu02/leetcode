class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> st = new HashSet<>();
        for(int n : nums){
            if(st.contains(n)){
                st.remove(n);
            }else{
                st.add(n);
            }
        }
        return st.iterator().next();
    }
}