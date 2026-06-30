class Solution {

    public int rev(int n) {
        int r = 0;
        while (n != 0) {
            r = r * 10 + (n % 10);
            n /= 10;
        }
        return r;
    }

    public int countNicePairs(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int ele : arr) {
            int number = ele - rev(ele);

            if (map.containsKey(number)) {
                int freq = map.get(number);
                count = count + freq;
                count %= 1000000007;
                map.put(number, freq + 1);
            } else {
                map.put(number, 1);
            }
        }

        return count;
    }
}