class Solution {
public:
    vector<int> twoSum(vector<int>& arr, int x) {
        int n = arr.size();
    for (int i = 0; i < n -1 ; i++ ){
        for(int j= i + 1; j<n; j++){
            if(arr[i] + arr[j] == x){
                return {i,j};
            }
        }
    }
    return {-1,-1};
        
    }
};