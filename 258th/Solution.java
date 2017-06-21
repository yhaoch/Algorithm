public class Solution {
    public int addDigits(int num) {
        while(num >=10){
            char[] store = String.valueOf(num).toCharArray();
            num = 0;
            for(int i = 0;i<store.length;i++){
                num += Character.getNumericValue(store[i]);
            }
        }
        return num;
    }
}

