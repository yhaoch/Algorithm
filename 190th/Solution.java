public class Solution {
    // you need treat n as an unsigned value
    public static int reverseBits(int n) {
        if(n==0)
            return 0;
//         String res = "";
//         int count =0;
//         while(n != 0){
//             res += "" + n % 2;
//             n /= 2;
//             count ++;
//         }
//         for(int j= count;j<32;j++){
//             res += '0';
//         }

//         System.out.println(res);
//         //String ans = new StringBuilder(res).reverse().toString();
//         //System.out.println(ans);
//         int len = res.length();

        long sum = 0;
        for(int i=0;i<32;i++){
                sum += Math.pow(2, 32 - 1 - i) * (n&1);
                n = n>>1;
        }
        return (int)sum ;
    }
}
