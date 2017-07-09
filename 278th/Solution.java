/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int low = 1; int high = n;
        int max = 0;
        while(low <= high){
            int mid = low + (high - low ) /2;
            if(isBadVersion(mid) == false){
                low = mid + 1;
            }
            else if(isBadVersion(mid) == true){
                high = mid -1;
                max = mid;
            }
        }
        return max;   
    }
}
