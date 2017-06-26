public class Solution {
    public int numberOfBoomerangs(int[][] points) {
        int len1 = points.length;
        //HashMap<Integer,Integer> st = new HashMap<Integer,Integer>();
        if(len1<3)
            return 0;
        else{
            int count = 0;
            int x=0,y=0;
            for(int i=0;i<len1;i++){
                HashMap<Integer,Integer> st = new HashMap<Integer,Integer>();
                x = points[i][0];
                y = points[i][1];
                for(int j=0;j<len1;j++){
                    int x1 = 0,y1=0,temp=0;
                    if(i == j)
                        continue;
                    else{
                        x1=points[j][0];
                        y1=points[j][1];
                        temp = (int)(Math.pow((x1-x),2) + Math.pow((y1-y),2));
                        //System.out.println(temp);
                        if(st.keySet().contains(temp) == true){
                            st.put(temp,st.get(temp) + 1);
                        }
                        else{
                            st.put(temp,1);
                        }
                    }
                }
                for(Map.Entry<Integer,Integer> entry:st.entrySet()){
                    int t = entry.getValue();
                    //System.out.println(t);
                    if(t>=2){
                        count += t*(t-1); 
                    }
                }
            }
            //int count = 0;
            // for(Map.Entry<Integer,Integer> entry:st.entrySet()){
            //     int t = entry.getValue();
            //     //System.out.println(t);
            //     if(t>=2){
            //         count += t*(t-1); 
            //     }
            // }
            return count;
        }
    }
}
