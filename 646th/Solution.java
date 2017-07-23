public class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, (a, b) -> (a[0] - b[0]));
        
        int i, j, max = 0, n = pairs.length;
        int dp[] = new int[n];
      
        for (i = 0; i < n; i++) dp[i] = 1;
        
        for (i = 1; i < n; i++)
            for (j = 0; j < i; j++)
                if (pairs[i][0] > pairs[j][1] && dp[i] < dp[j] + 1)
                    dp[i] = dp[j] + 1;

        for (i = 0; i < n; i++) if (max < dp[i]) max = dp[i];
        
        return max;
    }
}

//Greedy 
public int findLongestChain(int[][] pairs) {
        if(pairs==null||pairs.length==0) return 0;
        int n = pairs.length;
        Arrays.sort(pairs,new Comparator<int[]>(){
            public int compare(int [] o1,int [] o2){
                return o1[1] - o2[1];
            }
        });
        int cur = Integer.MIN_VALUE;
        int num = 0;
        int i = 0;
        while(i<n){
            if(pairs[i][0]>cur){
                cur = pairs[i][1];
                num++;
            }else{
                i++;
            }
        }
        return num;
    }