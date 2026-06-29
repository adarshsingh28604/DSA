class Solution {
    public boolean canArrange(int[] arr, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = arr.length;
        for(int i = 0; i<n ; i++){
            int ele = arr[i]%k;
            if(ele<0) ele+=k;
            if(map.containsKey(ele)){
               int freq= map.get(ele);
               map.put(ele,freq+1);
            }
            else map.put(ele,1);
        }
        if(map.containsKey(0)){
         if(map.get(0)%2!=0)  return false;
            map.remove(0);
        }
        for(int key : map.keySet()){
            int rem = k - key;
            if(!map.containsKey(rem)) return false;
            int keyfreq = map.get(key);
            int Remfreq = map.get(rem);
            if(keyfreq!=Remfreq) return false;
            // return true;
        }
         return true;
    }
}