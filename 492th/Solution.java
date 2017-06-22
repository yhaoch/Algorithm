public class Solution {
    public int[] constructRectangle(int area) {
        HashMap<Integer,Integer> st = new HashMap<Integer,Integer>();
        List<Integer> res = new ArrayList<Integer> ();
        int div=2;
        int temp = area;
        int min_value = 9999999;
        int [] ans = new int[2];
        //compute the 
        int itera = (int)Math.sqrt(area);
        while(itera != 0){
            //System.out.println(area);
            if(area % itera == 0){
                //area /= div;
                if(Math.abs(itera - (area/itera)) < min_value)
                    min_value = Math.abs(itera - (area/itera));
                st.put(itera, Math.abs(itera - (area/itera)));
                //System.out.println(temp/area + " " + Math.abs(area - (temp/area)));
                itera --;
            }
            else if(area % itera != 0){
                itera --;
            }
        }
        for(Map.Entry<Integer,Integer> entry:st.entrySet()){
            if(entry.getValue() == min_value)
                if(entry.getKey() >= (area/entry.getKey()))
                    ans[0] = entry.getKey();
                else
                    ans[0] = (area/entry.getKey());
        }
        ans[1] = temp / ans[0];
        return ans;
    }
}
