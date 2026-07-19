class Solution {
    public int subarraySum(int[] arr, int k) {
        int count = 0;
        for (int i = 1; i < arr.length; i++) {
                 arr[i] += arr[i-1];
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
              int rem = arr[i] - k ;
              if(arr[i]==k) count++;
              if(map.containsKey(rem)) count += map.get(rem);
            map.put(arr[i] , map.getOrDefault(arr[i],0)+1);
        }
        return count;
    }
}