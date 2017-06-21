public class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character,Integer> store = new HashMap<Character,Integer>();
        for(int i=0;i<t.length();i++){
            if(store.keySet().contains(t.charAt(i))){
                store.put(t.charAt(i),1 + store.get(t.charAt(i)));
            }
            else
                store.put(t.charAt(i),1);
        }
        for(int j=0;j<s.length();j++){
            if(store.keySet().contains(s.charAt(j))){
                store.put(s.charAt(j),store.get(s.charAt(j))-1);
            }
        }
        for(Map.Entry<Character,Integer> entry:store.entrySet()){
            if(entry.getValue() == 1)
                return entry.getKey();
            // else if(entry.getValue() == s.length() + t.length()){
            //     return entry.getKey();
            // }
        }
        return 'W';
    }
}
