class Solution {
    public boolean isBalanced(String num) {
        int[] nums = new int[num.length()];
        for(int i = 0; i < nums.length; i++){
            nums[i] = Integer.parseInt(String.valueOf(num.charAt(i)));
        }
        int evenSum = 0, oddSum = 0;
        for(int i = 0; i < nums.length; i++){
            if(i % 2 == 0){
                evenSum += nums[i];
            }else{
                oddSum += nums[i];
            }
        }
        return oddSum == evenSum;
    }
}