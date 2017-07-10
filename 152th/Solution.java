// public class Solution {
//     public static int maxProduct(int[] nums) {
//         Stack<Integer> st = new Stack<>();
//             Stack<Integer> res = new Stack<>();
//         int [] dp = new int [nums.length];
//         int max = 0;
//         int Ma = 0;
//         if(nums.length == 0)
//             return 0;
//         else if(nums.length == 1)
//             return nums[0];
//         else{
//             dp[0] = nums[0];
//             max = dp[0];
//             if(max < 0) {
//                 st.push(dp[0]);
//                 dp[0] = 1;
//             }
//             for(int i=1;i<nums.length;i++){
//                 if(nums[i] > 0){
//                     dp[i] = dp[i-1] * nums[i];
//                     max = Math.max(dp[i],max);
//                 }
//                 else if(nums[i] ==0){
//                     max = Math.max(dp[i],max);
//                     dp[i] = 1;
//                 }
//                 else{
//                     if(st.isEmpty() != true){
//                         int temp = st.pop();
//                         dp[i] = dp[i-1] * temp * nums[i];
//                         max = Math.max(dp[i],max);
//                         if(res.isEmpty()!=true){
//                             int ma = res.pop();
//                             max = max * ma;
//                             res.push(max);
//                         }
//                         max = 0;
//                         dp[i] = 1;
//                         st.push(nums[i]);
//                     }
//                     else{
//                         st.push(nums[i]);
//                         dp[i] = 1;
//                         max = Math.max(dp[i],max);
//                         res.push(max);
//                         //dp[i] = 1;
//                     }
//                 }
//             }
//         }
//         if()
//     }
// }

//aaaaaaaa  ffffffff   fffffffff aaaaaaa
public class Solution {
  public int maxProduct(int[] A) {
    if (A == null || A.length == 0) {
        return 0;
    }
    int[] f = new int[A.length];
    int[] g = new int[A.length];
    f[0] = A[0];
    g[0] = A[0];
    int res = A[0];
    for (int i = 1; i < A.length; i++) {
        f[i] = Math.max(Math.max(f[i - 1] * A[i], g[i - 1] * A[i]), A[i]);
        g[i] = Math.min(Math.min(f[i - 1] * A[i], g[i - 1] * A[i]), A[i]);
        res = Math.max(res, f[i]);
    }
    return res;
  }
}
