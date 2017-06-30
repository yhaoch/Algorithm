public class Solution {
    public boolean isPalindrome(String s) {
        HashMap<Character,Integer> alp = new LinkedHashMap<>();
        alp.put('a',0);
        alp.put('b',0);
        alp.put('c',0);
        alp.put('d',0);
        alp.put('e',0);
        alp.put('f',0);
        alp.put('g',0);
        alp.put('h',0);
        alp.put('i',0);
        alp.put('j',0);
        alp.put('k',0);
        alp.put('l',0);
        alp.put('m',0);
        alp.put('n',0);
        alp.put('o',0);
        alp.put('p',0);
        alp.put('q',0);
        alp.put('r',0);
        alp.put('s',0);
        alp.put('t',0);
        alp.put('u',0);
        alp.put('v',0);
        alp.put('w',0);
        alp.put('x',0);
        alp.put('y',0);
        alp.put('z',0);
        alp.put('1',0);
        alp.put('2',0);
        alp.put('3',0);
        alp.put('4',0);
        alp.put('5',0);
        alp.put('6',0);
        alp.put('7',0);
        alp.put('8',0);
        alp.put('9',0);
        alp.put('0',0);
        if(s.length() <=1)
            return true;
        s = s.toLowerCase();
        boolean res = true;
        ArrayList<Character> st = new ArrayList<>();
        for(int i = 0;i< s.length();i++){
            if(alp.keySet().contains(s.charAt(i)) == true)
                st.add(s.charAt(i));
        }
        for(int i = 0;i< st.size()/2;i++){
            if(st.get(i) != st.get(st.size()-1-i))
                res = false;
        }
        return res;
    }
}
