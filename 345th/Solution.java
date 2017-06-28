public class Solution {
    public String reverseVowels(String s) {
        HashMap<Integer,Character> st = new LinkedHashMap<Integer,Character>();
        ArrayList<Integer> st1 = new ArrayList<>();
        if(s.length() == 0)
            return new String();
        String temp = "";
        for(int i =0;i<s.length();i++){
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'||s.charAt(i) == 'A' ||s.charAt(i) == 'E' ||s.charAt(i) == 'I' ||s.charAt(i) == 'O' || s.charAt(i) == 'U'){
                //st.put(i,s.charAt(i));
                st1.add(i);
                temp += s.charAt(i);
            }
        }
        //s = new StringBuilder(s).reverse().toString();
        int len = temp.length()-1;
        for(int i=0;i<st1.size();i++){
            st.put(st1.get(i),temp.charAt(len));
            len --;
        }
        char [] arr = s.toCharArray();
        for(Map.Entry<Integer,Character> entry: st.entrySet()){
            arr[entry.getKey()] = entry.getValue();
        }
        return new String(arr);
    }
}
