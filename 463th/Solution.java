import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by u6001301 on 20/06/17.
 */
public class Solution {
    public static int islandPerimeter(int[][] grid) {
        int row = grid.length;
        if(row == 0)
            return 0;
        else {
            int count = 0;
            int adj = 0;
            int col = grid[0].length;
            for(int i=0;i<row;i++){
                for(int j = 0;j < col;j++){
                    if(grid[i][j] == 1){
                        count ++;
                        if(i < row-1 && grid[i+1][j] == 1)
                            adj ++;
                        if(j < col-1 && grid[i][j+1] == 1)
                            adj++;
                    }
                }
            }
            return count * 4 - adj * 2;
        }
    }
}