public class Solution {
    public List<List<Integer>> generate(int numRows){
        List<List<Integer>> st = new ArrayList<>();
        if(numRows == 0){
            return st;
        }
        for(int i=1;i<=numRows;i++){
            List<Integer> save = new ArrayList<>();
            if(i == 1)
                save.add(1);
            else if( i ==2){
                save.add(1);
                save.add(1);
            }
            else{
                save.add(1);
                for(int j = 1;j<=i-2;j++){
                    save.add(st.get(st.size()-1).get(j-1) + st.get(st.size()-1).get(j));
                }
                save.add(1);
            }
            st.add(save);
        }
        return st;
    }
}
