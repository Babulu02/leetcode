class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            res[i] = Math.abs(nums[i]*nums[i]);
        }
        Arrays.sort(res);
        return res;
    }
}