class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i = 0 ; i < graph.length ; i++) adj.add(new ArrayList<>());
        int[] indegree = new int[graph.length];
        for(int i = 0 ; i < graph.length ; i++){
            for(int ele : graph[i]){
                adj.get(ele).add(i);
                indegree[i]++;
            }
        }
         Queue<Integer> q = new LinkedList<>();
        List<Integer> ans =  new ArrayList<>();

        for(int i = 0; i < adj.size() ; i++){
            if(indegree[i] == 0){
                q.add(i);
                
            }
        }
        while(q.size()>0){
            int front = q.remove();
            ans.add(front);
            for(int ele: adj.get(front)){
                indegree[ele]--;
                if(indegree[ele]==0){
                    q.add(ele);
                    
                }
            }
        }
    
      Collections.sort(ans);
      return ans;
    }
}