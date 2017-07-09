public class Solution {
    public int largestPalindrome(int n) {
        int upper = 0;
        for(int i=0;i<n;i++)
            upper = upper * 10 + 9;
        int lower = upper / 10 + 1;
        long product = 0;
        long max = 0;
        for(int i = upper;i >= lower;i--){
            for(int j = i;j >= lower;j--){
                product = (long)i * j;
                if(product <= max)
                    break;
                if(product % 10 != 9)
                    continue;
                else{
                    if(helper(product) == true && product > max){
                        //System.out.println(product);
                        max = product;
                    }
                }
            }
        }
        //System.out.println(max);
        return (int)(max%1337);
    }
    public boolean helper(long x){
        long temp = 0;
        long input = x;
        while(x != 0){
            temp = temp * 10 + x % 10;
            x /= 10;
        }
        if(temp == input)
            return true;
        else
            return false;
    }
}
