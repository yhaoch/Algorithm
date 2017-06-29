public class Solution {
    public int countSegments(String s) {
        if(s.length() == 0)
            return 0;
        if(s.length() == 1 && s.charAt(0) != ' ')
            return 1;
        if(s.length() == 1 && s.charAt(0) == ' ')
            return 0;
        int count = 0;
        int start = 0;
        int i = 0;
        while(i<s.length()){
            start = 0;
            if(s.charAt(i) != ' '){
                int j= 0;
                for(j = i;j<s.length();j++){
                    if(s.charAt(j) == ' '){
                        count ++;
                        start ++;
                        break;
                    }
                }
                if(start == 0)
                    count ++;
                i = j;
            }
            i ++;
            // if(s.charAt(i) == ' '){
            //     if(i == 0)
            //         if(s.charAt(i+1) != ' ')
            //             count++;
            //     else if(i == s.length() -1)
            //         if(s.charAt(i-1) != ' ')
            //             count++;
            //     else{
            //         if(s.charAt(i-1) != ' ')
            //             count++;
            //         if(s.charAt(i+1) != ' ')
            //             count++;
            //     }
            // }
        }
        return count;
    }
}
