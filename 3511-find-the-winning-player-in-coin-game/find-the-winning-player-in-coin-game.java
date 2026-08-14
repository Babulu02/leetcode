class Solution {
    public String winningPlayer(int x, int y) {
        int t = Math.min(x, y/4);
        return (t % 2 == 1) ? "Alice" : "Bob";
    }
}