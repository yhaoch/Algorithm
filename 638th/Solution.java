public class Solution {
    public int shoppingOffers(List < Integer > price, List < List < Integer >> special, List < Integer > needs) {
        return shopping(price, special, needs, 0);
    }
    //recursive + dp niubi
    public int shopping(List < Integer > price, List < List < Integer >> special, List < Integer > needs, int i) {
        if (i == special.size())
            return dot(needs, price);
        //be careful here, pass the reference will will change the original array;
        ArrayList < Integer > clone = new ArrayList < > (needs);
        int j = 0;
        for (j = 0; j < special.get(i).size() - 1; j++) {
            int diff = clone.get(j) - special.get(i).get(j);
            if (diff < 0)
                break;
            clone.set(j, diff);
        }
        if (j == special.get(i).size() - 1)
            return Math.min(special.get(i).get(j) + shopping(price, special, clone, i), shopping(price, special, needs, i + 1));
        else
            return shopping(price, special, needs, i + 1);
    }
    
    public int dot(List < Integer > a, List < Integer > b) {
        int sum = 0;
        for (int i = 0; i < a.size(); i++) {
            sum += a.get(i) * b.get(i);
        }
        return sum;
    }
}
