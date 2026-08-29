class Solution {
    public int getLucky(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            sb.append((ch - 'a') + 1);
        }
        // K-Times Transform Karna hai
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum = 0;
            for (char ch : sb.toString().toCharArray()) {
                sum += ch-'0';
            }
            sb = new StringBuilder(String.valueOf(sum));
            /* First Transform k = 0 par sum = 17 aaya. so, updating sb = 17 
               Second Transform k = 1 par sum => 1+7 = 8. so, updating sb = 8;
             */ 
        }
        return sum;
    }
}