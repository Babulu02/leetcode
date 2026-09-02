/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int si = 1, ei = n;
        while(si < ei){
        int mid = si + (ei-si) / 2;
        if(!isBadVersion(mid)) si = mid + 1;
        else ei = mid ;
        }
        return si;
    }
}