public class Solution {
    public boolean detectCapitalUse(String word) {
        if(word.toLowerCase().equals(word) == true)
            return true;
        else if(word.toUpperCase().equals(word) == true)
            return true;
        else{
            //substring the final character using the string.length() to represent, do not use length()-1;
            //System.out.println((int)word.charAt(0));
            //System.out.println(word.substring(1,word.length()).toLowerCase().equals(word.substring(1,word.length())) == true);
            if((int)word.charAt(0) <= 90 && word.substring(1,word.length()).toLowerCase().equals(word.substring(1,word.length())) == true)
                return true;
        }
        return false;
    }
}
