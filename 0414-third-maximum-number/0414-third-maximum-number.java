class Solution {
    public int thirdMax(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int x : arr) {
            set.add(x);
        }

        int[] copy = new int[set.size()];
        int i = 0;

        for (int x : set) {
            copy[i++] = x;
        }

        Arrays.sort(copy);

        if (copy.length < 3)
            return copy[copy.length - 1];

        return copy[copy.length - 3];
    }
}