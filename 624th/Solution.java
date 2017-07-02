public class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int min = arrays.get(0).get(0);
        int max = arrays.get(0).get(arrays.get(0).size()-1) ;
        /**
        for(int i=1;i<arrays.size();i++){
            //if((arrays.get(i).get(0) < min) && (arrays.get(i).get(arrays.get(i).size()-1) > max) && (min - arrays.get(i).get(0)) <  (arrays.get(i).get(arrays.get(i).size()-1) - max))
            if((arrays.get(i).get(0) < min) && (arrays.get(i).get(arrays.get(i).size()-1) < max))
                min = arrays.get(i).get(0);
            else if((arrays.get(i).get(0) > min) && (arrays.get(i).get(arrays.get(i).size()-1) > max))
                max = arrays.get(i).get(arrays.get(i).size()-1);
            else if((arrays.get(i).get(0) <= min) && (arrays.get(i).get(arrays.get(i).size()-1) > max)){
                if(Math.abs(min - arrays.get(i).get(0)) <= Math.abs(arrays.get(i).get(arrays.get(i).size()-1) - max))
                    //min = arrays.get(i).get(0);
                    max = arrays.get(i).get(arrays.get(i).size()-1);
                else if(Math.abs(min - arrays.get(i).get(0)) > Math.abs(arrays.get(i).get(arrays.get(i).size()-1) - max))
                    //max = arrays.get(i).get(arrays.get(i).size()-1);
                    min = arrays.get(i).get(0);
            }
            else if((arrays.get(i).get(0) > min) && (arrays.get(i).get(arrays.get(i).size()-1) <= max)){
                if(Math.abs(min - arrays.get(i).get(0)) < Math.abs(arrays.get(i).get(arrays.get(i).size()-1) - max))
                    min = arrays.get(i).get(0);
                    //max = arrays.get(i).get(arrays.get(i).size()-1);
                else if(Math.abs(min - arrays.get(i).get(0)) >= Math.abs(arrays.get(i).get(arrays.get(i).size()-1) - max))
                    max = arrays.get(i).get(arrays.get(i).size()-1);
                    //min = arrays.get(i).get(0);
            }
        }**/
        //er... I am stupid;
        int ans = 0;
        for(int i =1;i < arrays.size();i++){
            ans = Math.max(ans, Math.abs(arrays.get(i).get(0) - max));
            ans = Math.max(ans, Math.abs(arrays.get(i).get(arrays.get(i).size() - 1) - min));
            max = Math.max(max, arrays.get(i).get(arrays.get(i).size() - 1));
            min = Math.min(min, arrays.get(i).get(0));
        }
        //System.out.println(max + " " + min);
        return ans;
    }
}
