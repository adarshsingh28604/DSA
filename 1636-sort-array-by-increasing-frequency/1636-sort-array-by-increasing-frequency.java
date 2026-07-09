import java.util.*;

class Solution {
    public int[] frequencySort(int[] nums) {

        Integer[] arr = new Integer[nums.length];

        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i];
        }

        Arrays.sort(arr, (a, b) -> {

            int fa = 0;
            int fb = 0;

            for (int x : nums) {
                if (x == a)
                    fa++;
            }

            for (int x : nums) {
                if (x == b)
                    fb++;
            }

            if (fa != fb)
                return fa - fb;

            return b - a;
        });

        for (int i = 0; i < nums.length; i++) {
            nums[i] = arr[i];
        }

        return nums;
    }
}