public class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int len1 = s.length();
        int len2 = p.length();
         List<Integer> save = new ArrayList<>();
        if(len1 < len2)
            return save;
        boolean ans = false;
        //HashMap<Character,Integer> st = new HashMap<>();
        HashMap<Character,Integer> st = new LinkedHashMap<>();
        for(int k = 0;k<len2;k++){
            if(st.keySet().contains(p.charAt(k)) == true)
                st.put(p.charAt(k),st.get(p.charAt(k)) + 1);
            else
                st.put(p.charAt(k),1);
        }
        for(int i = 0;i<len1-len2 + 1;i++){
            //HashMap<Character,Integer> st1 = st;
            ans = compute(i,len2,s,st);
            //System.out.println(ans);
            if(ans == true)
                save.add(i);
        }
        return save;
    }
    public boolean compute(int start,int len,String s,HashMap<Character,Integer> st){
        int idx = 0;
        //for(Map.Entry<Character,Integer> entry:st.entrySet()){
        //    System.out.println(entry.getKey() + " " + entry.getValue());
        //}
        /**
        for(int i = start; i<start + len;i++){
            if(st.keySet().contains(s.charAt(i)) != true){
                return false;
            }
            else if(st.keySet().contains(s.charAt(i)) == true){
                if(st.get(s.charAt(i)) == 0){
                    return false;
                }
                else{
                    st.put(s.charAt(i),st.get(s.charAt(i))-1);
                    //System.out.println(st.get(s.charAt(i))-1);
                }
            }
        }**/
        for(Character key:st.keySet()){
            int count = 0;
            for(int i = start; i<start + len;i++){
                if(s.charAt(i) == key)
                    count++;
            }
            if(st.get(key) != count)
                return false;
        }
        return true;
    }
}
