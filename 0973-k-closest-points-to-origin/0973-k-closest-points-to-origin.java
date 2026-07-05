// class Solution {
//     public int[][] kClosest(int[][] arr, int k) {

//         HashMap<Integer, Double> map = new HashMap<>();
//         ArrayList<Integer> list = new ArrayList<>();

//         for (int i = 0; i < arr.length; i++) {
//             double distance = (
//                     arr[i][0] * arr[i][0] +
//                     arr[i][1] * arr[i][1]
//             );

//             map.put(i, distance);
//         }

//         while (k > 0 && !map.isEmpty()) {

//             double smallValue = Double.MAX_VALUE;
//             int index = -1;

//             for (int key : map.keySet()) {

//                 if (map.get(key) < smallValue) {
//                     smallValue = map.get(key);
//                     index = key;
//                 }

//             }

//             list.add(index);
//             map.remove(index);
//             k--;
//         }

//         int[][] ans = new int[list.size()][2];

//         for (int i = 0; i < list.size(); i++) {
//             ans[i] = arr[list.get(i)];
//         }

//         return ans;
//     }
// }
class Solution {
    public int[][] kClosest(int[][] points, int k) {

        Arrays.sort(points, (a, b) ->
            (a[0] * a[0] + a[1] * a[1]) -
            (b[0] * b[0] + b[1] * b[1])
        );

        int[][] ans = new int[k][2];

        for (int i = 0; i < k; i++) {
            ans[i] = points[i];
        }

        return ans;
    }
}