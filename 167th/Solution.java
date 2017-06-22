public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int [] res = new int[2];
        int i = 0;
        HashMap<Integer,Integer> st = new HashMap<Integer,Integer>();
        //while(i<numbers.length-1){
        int count = 0;
        st.put(numbers[0],0);
        for(int j = 1;j<numbers.length;j++){
            if(numbers[j] == numbers[j-1]){
                if((numbers[j] + numbers[j-1]) == target){
                    res[0] = j;
                    res[1] = j + 1;
                    return res;
                }
                else{
                    st.put(numbers[j],j);
                }
            }
            else if(numbers[j] != numbers[j-1])
                st.put(numbers[j],j);
        }
        for(Map.Entry<Integer,Integer> entry:st.entrySet()){
            for(Map.Entry<Integer,Integer> entry1:st.entrySet()){
                if(entry.getKey() == entry1.getKey()){
                    continue;
                }
                else{
                    if((entry.getKey()+entry1.getKey()) == target){
                        res[0] = Math.min(entry.getValue() + 1,entry1.getValue() + 1);
                        res[1] = Math.max(entry.getValue() + 1,entry1.getValue() + 1);
                        return res;
                    }
                    if((entry.getKey()+entry1.getKey()) == target){
                        return res;
                    }
                }
            }
        }
        return res;
    }
}
