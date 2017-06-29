public class Solution {
    public boolean repeatedSubstringPattern(String s) {
        if(s.length() <= 1)
            return false;
        int len = s.length();
        for(int i = len/2;i>=1;i--){
            if(len % i == 0){
                int count = len / i;
                //String temp = "";
                int j = 0;
                String sub = s.substring(0,i);
                for(j = 0;j<count;j++){
                    //temp += s.substring(0,i);
                    if(!sub.equals(s.substring(j*i,i+j*i))) 
                        break;
                }
                if(j == count)
                    return true;
            }
        }
        return false;
    }
//     public boolean repeatedSubstringPattern(String str) {
// 	int l = str.length();
// 	for(int i=l/2;i>=1;i--) {
// 		if(l%i==0) {
// 			int m = l/i;
// 			String subS = str.substring(0,i);
// 			StringBuilder sb = new StringBuilder();
// 			for(int j=0;j<m;j++) {
// 				sb.append(subS);
// 			}
// 			if(sb.toString().equals(str)) return true;
// 		}
// 	}
// 	return false;
// }
}
