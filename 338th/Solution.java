public class Solution {
    public int[] countBits(int num) {
        int [] res = new int [num+1];
        if(num == 0){
            res[0] = 0;
            return res;
        }
        else if(num == 1){
            res[0] = 0;
            res[1] = 1;
            return res;
        }
        else{
            res[0] = 0;
            res[1] = 1;
            for(int i = 2; i<=num ;i++){
                res[i] = res[(i / 2)] + (i % 2);
            }
            return res;
        }
    }
}
