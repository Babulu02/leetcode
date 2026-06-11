class Solution {
    public int fib(int n) {
        if(n <= 1) return n;
        int f1 = 0, f2 = 1;
        int res = 0;
        for(int i = 2; i <= n; i++){
            int f3 = f1 + f2;
            res = f3;
            f1 = f2;
            f2 = f3;
        }
        return res;
    }
}