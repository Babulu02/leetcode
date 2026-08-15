class Solution {
    public int missingNumber(int[] nums) {
        int len = nums.length;

        /* Approach - 1
         for(int i = 0; i < nums.length; i++){
             res ^= i;
             res ^= nums[i];
         }
         return res; 
        */

         /* Approach - 2
        int sum = (0+len) * (len+1)/2;
        for(int i = 0; i < len; i++) sum -= nums[i];
        return sum;
        */

        // Approach - 3
        long actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }
        long expectedSum = ((long) len * (len + 1)) / 2; 
        return (int) (expectedSum - actualSum);
    }
}