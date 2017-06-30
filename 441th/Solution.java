public class Solution {
    public int arrangeCoins(int n) {
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        return bs(n);
        
    }
    public int bs(int n){
        long low = 1, high = n;
        while(low < high){
            long mid = low + (high - low) / 2;
            System.out.println(mid);
            //if(mid * mid + mid == 2 * target)
            //    return mid;
            if((mid * mid + mid)/2 >n)
                high = mid;
            if((mid * mid + mid)/2 <=n)
                low = mid + 1;
        }
        System.out.println(low-1);
        return (int)low-1;
    }
}
