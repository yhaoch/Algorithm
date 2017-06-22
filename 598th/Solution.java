public static int maxCount(int m, int n, int[][] ops) {
        //int [][] res = new int[m][n];
        int a=0,b=0;
        System.out.println(ops.length);
        if(ops.length == 0 || ops == null){
            return m * n;
        }
        // for(int i = 0;i< m;i++){
        //     for(int j = 0;j<n;j++){
        //         res[i][j] =0;
        //     }
        // }
        int max = 0;
        int min_a = 40001;
        int min_b = 40001;
        for(int i = 0;i<ops.length;i++){
            a = ops[i][0];
            b = ops[i][1];
            if(a < min_a)
                min_a = a;
            if(b < min_b)
                min_b = b;
            //res[j][k] = 0;
            // for(int j = 0; j < a;j++){
            //     for(int k = 0;k < b;k++){
            //         res[j][k]++;
            //         if(res[j][k] > max)
            //             max = res[j][k];
            //     }
        }
        // int count = 0;
        // for(int i = 0;i< m;i++){
        //     for(int j = 0;j<n;j++){
        //         if(res[i][j] == max)
        //             count++;
        //     }
        // }
        return min_a * min_b;
    }
