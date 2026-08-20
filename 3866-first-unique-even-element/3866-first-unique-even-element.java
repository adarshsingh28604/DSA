class Solution {
    public int firstUniqueEven(int[] arr) {
    HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])){
                int freq = map.get(arr[i]);
                map.put(arr[i], freq+1);
            }
            else map.put(arr[i], 1);
        }

        
     for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0) {
                if(map.get(arr[i])==1) return arr[i];
            }
        }


        return -1;
    }
}



    //            int[] freq = new int[101];

    //     for(int i = 0; i < nums.length; i++) {
    //         freq[nums[i]]++;
    //     }

        
    //  for(int i = 0; i < nums.length; i++) {
    //         if(nums[i] % 2 == 0 && freq[nums[i]] == 1) {
    //             return nums[i];
    //         }
    //     }


    //     return -1;