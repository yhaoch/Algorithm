public class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String,Integer> store0 = new HashMap<String,Integer>();
        HashMap<String,Integer> store1 = new HashMap<String,Integer>();
        HashMap<String,Integer> res = new HashMap<String,Integer>();
        
        for(int i=0;i<list1.length;i++){
            store0.put(list1[i],i);
        }
        for(int i=0;i<list2.length;i++){
            store1.put(list2[i],i);
        }
        for(String key:store0.keySet()){
            if(store1.keySet().contains(key) == true){
                res.put(key,store0.get(key) + store1.get(key));
            }
        }
        int idx = 10000;
        for(Map.Entry<String,Integer> entry:res.entrySet()){
            if(entry.getValue() <= idx)
                idx = entry.getValue();
        }
        System.out.println(idx);
        int count = 0;
        for(Map.Entry<String,Integer> entry:res.entrySet()){
            if(entry.getValue() == idx){
                count ++;
            }
        }
        System.out.println(count);
        int index = 0;
        String[] ans = new String[count];
        for(Map.Entry<String,Integer> entry:res.entrySet()){
            if(entry.getValue() == idx){
                ans[index] = entry.getKey();
                index ++;
            }
        }
        return ans;
    }
}