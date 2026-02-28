class Solution {
    public int climbStairs(int n) {
        // if(n <= 1){
        //     return 1;
        // }
        // return climbStairs(n-1) + climbStairs(n-2);
        int f1 = 1, f2 = 1;
        for(int i = 2; i <= n; i++){
            int f3 = f2;
            f2 = f1+f3;
            f1 = f3;
        }
        return f2;
    }
}