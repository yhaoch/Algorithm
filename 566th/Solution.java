import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by u6001301 on 19/06/17.
 */
public class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int row = nums.length;
        int col = nums[0].length;
        if(r*c != row*col)
            return nums;
        else{
            int [][] result = new int[r][c];
            ArrayList<Integer> store = new ArrayList<Integer>();
            for(int i = 0;i < row;i++)
                for(int j = 0;j<col;j++){
                    store.add(nums[i][j]);
                }
            int idx = 0;
            for(int k =0;k<r;k++)
                for(int m = 0;m<c;m++){
                    result[k][m] = store.get(idx);
                    idx ++;
                }
            return result;
        }
    }

    public static void main(String args[]){
        int [][] arr = new int [2][2];
//       arr[0][0] = 1;
//       arr[0][1] = 2;
//       arr[1][0] = 3;
//       arr[1][1] = 4;
        int len = arr.length;
        int len1 = arr[0].length;
        System.out.println(len + " " + len1);
    }
}