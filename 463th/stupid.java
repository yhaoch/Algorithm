public class Solution {
    public int islandPerimeter(int[][] grid) {
        int row = grid.length;
        if(row == 0)
            return 0;
        else if(row ==1 && col == 1){
            return 4;
        }
        else if(row == 1){
            if(col == 1){
                return 4;
            }
            else if(col == 2){
                return 
            }
            
        }
        else {
            int count = 0;
            int col = grid[0].length;
            for(int i=0;i<row;i++){
                for(int j = 0;j < col;j++){
                    if(grid[i][j] != 0)
                        count += judge(grid,i,j,row,col);
                    else
                        continue;
                }
            }
            return count;
        }
    }

    public int judge(int[][] grid, int row, int col,int tot_row, int tot_col){
        int cou = 4;
        if(row == 0 && col ==0){
            if(grid[1][0] == 1)
                cou --;
            if(grid[0][1] == 1)
                cou --;
            return cou;
        }
        else if(row == 0 && col == tot_col - 1){
            if(grid[0][tot_col-2] == 1)
                cou --;
            if(grid[1][tot_col-1] == 1)
                cou --;
            return cou;
        }
        else if(row == tot_row -1 && col == 0){
            if(grid[tot_row-2][0] == 1)
                cou --;
            if(grid[tot_row-1][1] == 1)
                cou --;
            return cou;
        }
        else if(row == tot_row -1 && col == tot_col - 1){
            if(grid[tot_row-2][tot_col-1] == 1)
                cou --;
            if(grid[tot_row-1][tot_col -2] == 1)
                cou --;
            return cou;
        }
        else if(row > 0 && row < tot_row-1 && col == 0){
            if(grid[row-1][col] == 1)
                cou --;
            if(grid[row + 1][col] == 1)
                cou --;
            if(grid[row][col+1] == 1)
                cou --;
            return cou;
        }
        else if(row > 0 && row < tot_row-1 && col == tot_col-1){
            if(grid[row-1][col] == 1)
                cou --;
            if(grid[row + 1][col] == 1)
                cou --;
            if(grid[row][col-1] == 1)
                cou --;
            return cou;
        }
        else if(col > 0 && col < tot_col-1 && row == 0){
            if(grid[row][col-1] == 1)
                cou --;
            if(grid[row][col+1] == 1)
                cou --;
            if(grid[row+1][col] == 1)
                cou --;
            return cou;
        }
        else if(col > 0 && col < tot_col-1 && row == tot_row-1){
            if(grid[row][col-1] == 1)
                cou --;
            if(grid[row][col+1] == 1)
                cou --;
            if(grid[row-1][col] == 1)
                cou --;
            return cou;
        }
        else{
            if(grid[row][col-1] == 1)
                cou --;
            if(grid[row][col+1] == 1)
                cou --;
            if(grid[row-1][col] == 1)
                cou --;
            if(grid[row+1][col] == 1)
                cou --;
            return cou;
        }
    }
}
