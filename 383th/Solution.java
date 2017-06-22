public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> st = new HashMap<Character,Integer>();
        HashMap<Character,Integer> st1 = new HashMap<Character,Integer>();
        boolean res = false;
        if(ransomNote.length() == 0 && magazine.length() == 0)
            return true;
        if(ransomNote.length() == 0 && magazine.length() != 0)
            return true;
        if(ransomNote.length() != 0 && magazine.length() == 0)
            return false;
        for(int i = 0;i<ransomNote.length();i++){
            if(st.keySet().contains(ransomNote.charAt(i)) == true){
                st.put(ransomNote.charAt(i),st.get(ransomNote.charAt(i)) + 1);
            }
            else{
                st.put(ransomNote.charAt(i),1);
            }
        }
        for(int i = 0;i<magazine.length();i++){
            if(st1.keySet().contains(magazine.charAt(i)) == true){
                st1.put(magazine.charAt(i),st1.get(magazine.charAt(i)) + 1);
            }
            else{
                st1.put(magazine.charAt(i),1);
            }
        }
        // for(Map.Entry<Character,Integer> entry:st.entrySet()){
        //     System.out.println(entry.getKey() + " " + entry.getValue());
        // }
        // //System.out.println(st1.get('f'));
        // for(Map.Entry<Character,Integer> entry:st1.entrySet()){
        //     System.out.println(entry.getKey() + " " + entry.getValue());
        // }
        for(Map.Entry<Character,Integer> entry:st.entrySet()){
            if(st1.keySet().contains(entry.getKey())==true){
                if(st1.get(entry.getKey()) >= entry.getValue()){
                    //System.out.println(st1.get(entry.getKey()) + " " + entry.getValue());
                    res = true;
                }
                else{
                    res = false;
                    return res;
                }
            }
            else{
                res = false;
                return res;
            }
        }
        return res;
    }
}
