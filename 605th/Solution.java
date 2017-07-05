// public class Solution {
//     public boolean canPlaceFlowers(int[] flowerbed, int n) {
//         int len = flowerbed.length;
//         int res = 0;
//         int count = 0;
//         if(len == 1 && flowerbed[0] == 0)
//             return true;
//         for(int i=0;i<len;i++){
//             if(flowerbed[i] == 0){
//                 count ++;
//             }
//             else if(flowerbed[i] == 1){
//                 if(count == 2){
//                     if(i == 2)
//                         res += 1;
//                 }
//                 if(count >= 3){
//                     if(count % 2 == 0){
//                         count-=2;
//                         res += count / 2;
//                     }
//                     else{
//                         count -= 1;
//                         res += count / 2;
//                     }
//                 }
//                 count = 0;
//             }
//             if(i == len-1){
//                 if(count == 2)
//                     res += 1;
//                 else if(count >=3)
//                     res += count / 2;
//             }
//             //System.out.println(res);
//         }
//         if(res >= n)
//             return true;
//         else
//             return false;
//     }
// }

public class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int i = 0, count = 0;
        while (i < flowerbed.length) {
            if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0) && (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
                flowerbed[i] = 1;
                count++;
            }
            i++;
        }
       if(count >= n)
            return true;
        else
            return false;
    }
}
