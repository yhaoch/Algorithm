import java.util.HashMap;
import java.util.Scanner;

public class Solution {
    public static int lengthOfLongestSubstring(String s) {
    	HashMap<Integer,String> index_table = new HashMap<Integer,String>();
    	String temp = "";
    	int idx = 0;
    	if(s.length() == 0){
			return 0;
		}
    	else{
	    	while(true){
	    		if(s.length() == 1){
					index_table.put(1, s);
					break;
	    		}
	    		else if(idx == s.length()){
	    			index_table.put(temp.length(), temp);
	    			break;
	    		}
	    		else{
		    		char te = s.charAt(idx);
		    		//System.out.println(te);
		    		if(temp.indexOf(te) >= 0){
		    			//System.out.println(temp);
		    			index_table.put(temp.length(), temp);
		    			//System.out.println(s);
		    			s = s.substring(idx, s.length());
		    			//System.out.println(s);
		    			//System.out.println(s.length());
		    			//s = s.substring(idx, s.length());
		//    			System.out.println(idx);
		//    			System.out.println(s.length());
		    			//System.out.println(s);
		    			temp = "";
		    			idx = 0;
		    		}
		    		else{
		    			temp += te;
		    			//System.out.println(temp);
		    			idx ++;
		    		}
		    	}
	    	}
    		int maxKey = 0;
    		for(Integer key: index_table.keySet()){
    			if(maxKey < key)
    				maxKey = key;
    		}
    		return maxKey;
    	}
    }
    
    
    public static void main(String args[]){
    	Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
    	System.out.println(lengthOfLongestSubstring(str));
    }
}