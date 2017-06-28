public class Solution {
    // you need to treat n as an unsigned value
    // public int hammingWeight(int n) {
    //     int count = 0;
    //     if( n == 0)
    //         return 0;
    //     if(n ==1)
    //         return 1;
    //     while(n != 1){
    //         if(n % 2 == 1)
    //             count ++;
    //         n /= 2;
    //         if(n == 1)
    //             count ++;
    //     }
    //     return count;
    // }
    public int hammingWeight(int n){
        int count = 0;
        int mask = 1;
        //2,147,483,648 > 2^32 - 1, so it will return -2147483648.
        // if(n<=1)
        //     return n;
        for(int i = 0;i<32;i++){
            if((n & mask) != 0)
                count ++;
            mask = mask << 1;
        }
        return count;
    }
}
