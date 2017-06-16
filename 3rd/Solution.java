
import java.util.HashMap;
import java.util.Scanner;

public class Solution {
	//Using DP to solve the problem. DP[i] = DP[i-1] + 1;
    public static int lengthOfLongestSubstring(String s) {
    	//HashMap<Integer,String> index_table = new HashMap<Integer,String>();
    	HashMap<Character,Integer> index_char = new HashMap<Character,Integer>();
    	int m = 0;
    	int start = 0;
    	if(s.length() == 0){
			return 0;
		}
		else if(s.length() == 1)
			return 1;
    	else{
    		int max[] = new int[s.length()];
    		max[0] = 1;
    		index_char.put(s.charAt(0),0);
	    	for(int j = 1;j< s.length();j++){
	    		char te = s.charAt(j);
	    		//System.out.println(te);
	    		if(index_char.get(te) != null && start <= index_char.get(te)){
	    			//System.out.println(temp);
    				max[j] = j - index_char.get(te);
    				start = index_char.get(te) + 1;
    				index_char.put(te,j);
	    			//System.out.println(m);
	    			//System.out.print(i);
	    			//System.out.println(s);
	    			//s = s.substring(index_char.get(te) + 1, s.length());
	    		}
	    		else{
	    			index_char.put(te,j);
	    			max[j] = max[j-1] + 1;
	    		}
	    		if(max[j] > m)
	    			m = max[j];
	    	}
	    	return m;
    	}
    }

    //From the internet: http://www.cnblogs.com/beetle-shu/p/4175651.html
	public static int lengthOfLongestSubstring1(String s) {
        int strLength = s.length();
        int maxLength = -1;
        int start = 0;
        for (int i = 1; i < strLength; i++) {
            char temp = s.charAt(i);
            for (int j = i; j > start; j--) {
                if (s.charAt(j-1)== temp) {
                    maxLength = (maxLength >(i-start))?maxLength:(i-start);
                    start = j;
                }
            }
        }
        maxLength = (maxLength >(strLength-start))?maxLength:(strLength-start);
        return maxLength;
    }
    
    
    public static void main(String args[]){
  //   	Scanner sc = new Scanner(System.in);
		// String str = sc.nextLine();
		
    	String s="abcabcbb";
    	long start=System.currentTimeMillis();   //获取开始时间  
		int ans = lengthOfLongestSubstring(s);
		long end=System.currentTimeMillis(); //获取结束时间  
		System.out.println("程序运行时间: " + (end-start) +"ms"); 
		long start1=System.currentTimeMillis();   //获取开始时间  
		int ans1 = lengthOfLongestSubstring1(s);
		long end1=System.currentTimeMillis(); //获取结束时间  
		System.out.println("程序运行时间: " + (end1-start1) +"ms"); 
    	System.out.println(ans);
    	System.out.println(ans1);
    }
}