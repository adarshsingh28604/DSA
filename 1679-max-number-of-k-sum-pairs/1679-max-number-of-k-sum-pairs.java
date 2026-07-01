// class Solution {
//     public int maxOperations(int[] arr, int k) {
//         HashMap<Integer,Integer> map1 = new HashMap<>();
//         HashMap<Integer,Integer> map2 = new HashMap<>();
//         int count = 0;
//         for(int i =0; i<arr.length;i++){
//             map1.put(arr[i],count++);
//                int number = arr[i];
//                if (map2.containsKey(number)) {
//                 int freq = map2.get(number);
//                 map2.put(number, freq + 1);
//             } else {
//                 map2.put(number, 1);
//             }
//         }
//         int ans = 0;
//           for(int i =0; i<arr.length;i++){
//             int search = k-arr[i];
//             if((map1.containsKey(search) && map2.containsKey(search)) && (i != map1.get(k-arr[i]))){
//                 map1.remove(arr[i]);
//                 map1.remove(k-arr[i]);
//                 map2.remove(arr[i]);
//                 map2.remove(k-arr[i]);
//                ans++;
//             }
//           }
//        return ans;
//     }
// }
class Solution {
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = 0;
        for (int num : nums) {
            int need = k - num;
            if (map.containsKey(need) && map.get(need) > 0) {
                ans++;
                map.put(need, map.get(need) - 1);
            } else {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }
        return ans;
    }
}