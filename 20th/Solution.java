public class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{'|| s.charAt(i) == '[')
                st.push(s.charAt(i));
            else if(st.isEmpty() != true){
                char temp;
                temp = st.pop();
                if(s.charAt(i) == ')' && temp != '('){
                    return false;
                }
                if(s.charAt(i) == ']' && temp != '['){
                    return false;
                }
                if(s.charAt(i) == '}' && temp != '{'){
                    return false;
                }
            }
            else{
                return false;
            }
        }
        if(st.isEmpty() == true)
        	return true;
        else
            return false;
    }
}
