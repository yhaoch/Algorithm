public class Solution {
    // public boolean isPerfectSquare(int num) {
    //     if(num <= 1)
    //         return true;
    //     int [] st = new int [num];
    //     int original = num;
    //     int count = 0;
    //     while(num != 0){
    //         num /= 10;
    //         count ++;
    //     }
    //     num = (int)Math.pow(10,count);
    //     while(num * num > original){
    //         num /=2;
    //     }
    //     int idx = bs(0,num-1,original);
    //     if(idx == -1)
    //         return false;
    //     else
    //         return true;
    // }
    public boolean isPerfectSquare(int num){
        if(num <= 1)
            return true;
        long low = 0, high = num;
        while(low <= high){
            long mid = low + (high - low) / 2;
            //long temp = mid * mid;
            if((mid * mid) > num)
                high = mid -1;
            if((mid * mid) < num)
                low = mid + 1;
            if(mid * mid == num)
                return true;
        }
        return false;
    }
}