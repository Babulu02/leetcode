class Solution {
    public boolean isPerfectSquare(int num) {
        if(num < 2){
            return true;
        }
        long n = num;
        //Newton's Method
        while(n*n > num){
            n = (n + num/n)/2;
        }
        return n*n == num;
    }
}