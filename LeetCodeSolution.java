import java.util.*;
public class LeetCodeSolution {
    public static void main(String[] args) {

    }
}
//class Edge {
//    int neighbor;
//    boolean isReal;
//
//    Edge(int neighbor, boolean isReal) {
//        this.neighbor = neighbor;
//        this.isReal = isReal;
//    }
//}
//
//
//class Solution {
//    public void dfs(Map<Integer,List<Edge>> adjList,int node,boolean[] visited,int ans){
//        visited[node]=true;
//        for(Edge x:adjList.get(node)){
//            if(!visited[x.neighbor]){
//                if(x.isReal==true) ans++;
//                dfs(adjList, x.neighbor, visited, ans);
//            }
//        }
//
//    }
//    public int minReorder(int n, int[][] arr) {
//        Map<Integer,List<Edge>> adjList=new HashMap<>();
//        for(int[] x:arr){
//           adjList.putIfAbsent(x[0],new ArrayList<>());
//           adjList.get(x[0]).add(new Edge(x[1],true));   // 0-->(1,true)
//
//           adjList.putIfAbsent(x[1],new ArrayList<>());
//           adjList.get(x[1]).add(new Edge(x[0],false));  // 1-->(0,false)
//        }
//        boolean[] visited=new boolean[n];
//        Arrays.fill(visited,false);
//        int ans=0;
//        dfs(adjList,0,visited,ans);
//        return ans;
//    }
//}

//class Solution {
//    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
//        int n=graph.length;
//        List<List<Integer>> res=new ArrayList<>();
//        List<Integer> list=new ArrayList<>();
//        DFS(res,graph,list,0,n-1);
//        return res;
//    }
//
//    private void DFS(List<List<Integer>> res,int[][] graph,List<Integer> list,int source,int dest) {
//        list.add(source);
//        if(source==dest) {
//            res.add(new ArrayList<>(list));
//        } else {
//            for (int x : graph[source]) {
//                 DFS(res, graph, list, x, dest);
//            }
//        }
//        list.remove(list.size()-1);
//    }
//}


//class Solution {
//    int timer=1;
//    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
//        List<List<Integer>> graph=new ArrayList<>();
//        for(int i=0; i<n; i++){
//            graph.add(new ArrayList<>());
//        }
//        for(List<Integer> list:connections){
//            graph.get(list.get(0)).add(list.get(1));
//            graph.get(list.get(1)).add(list.get(0));
//        }
//        int[] tin=new int[n];
//        int[] low=new int[n];
//        boolean[] visited=new boolean[n];
//        List<List<Integer>> bridges=new ArrayList<>();
//        dfs(0,-1,graph,visited,tin,low,bridges);
//
//        return bridges;
//
//    }
//
//    private void dfs(int node,int parent,List<List<Integer>> graph,
//                       boolean[] visited, int[] tin, int[] low, List<List<Integer>> bridges) {
//           visited[node]=true;
//           tin[node]=low[node]=timer;
//           timer++;
//           for(Integer neighbour:graph.get(node)){
//               if(neighbour==parent) continue;
//               if(!visited[neighbour]) {
//                   dfs(neighbour, node, graph, visited, tin, low, bridges);
//                   low[node] = Math.min(low[node], low[neighbour]);
//                   if(low[neighbour]>low[node]) {
//                       bridges.add(Arrays.asList(node,neighbour));
//                   }
//               } else{
//                   low[node] = Math.min(low[node], low[neighbour]);
//               }
//           }
//
//    }
//}

//class Solution {
//    public int nearestExit(char[][] maze, int[] entrance) {
//        int m= maze.length;
//        int n=maze[0].length;
//        Queue<int[]> q=new LinkedList<>();
//        q.offer(new int[]{entrance[0],entrance[1],0});
//        maze[entrance[0]][entrance[1]]='+';
//        int[][] direction={{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
//        while(!q.isEmpty()){
//            int arr[]=q.poll();
//            for(int[] dir:direction){
//                int rows=arr[0]+dir[0], cols=dir[1]+arr[1],steps=dir[2];
//                if(rows>=0 && rows<m && cols>=0 && cols<n && maze[rows][cols]=='.'){
//                    if(rows==0 || rows==m-1 || cols==0 || cols==n-1){
//                        return steps+1;
//                    }
//                    q.offer(new int[]{rows,cols,steps+1});
//                }
//            }
//        }
//
//        return -1;
//    }
//}

//class Solution {
//    public boolean canReach(int[] arr, int start) {
//        int n= arr.length;
//        boolean[] visited=new boolean[n];
//        Arrays.fill(visited,false);
////        Map<Integer,Integer> map=new HashMap();
////        for(int i=0; i<n; i++){
////            map.put(arr[i],i);
////        }
//        Queue<Integer> q=new LinkedList<>();
//        q.add(start);
//        visited[start]=true;
//        while(!q.isEmpty()){
//            int node=q.poll();
//            int aage=node+arr[node];   // i+arr[i].
//            int piche=node-arr[node];  // i-arr[i].
//            if(aage<n){
//                if(!visited[aage]) {
//                    if (arr[aage] == 0) return true;
//                    else {
//                        q.add(aage);
//                        visited[aage] = true;
//                    }
//                }
//            }
//            if(piche>=0){
//                if(!visited[piche]) {
//                    if (arr[piche] == 0) return true;
//                    else {
//                        q.add(piche);
//                        visited[piche] = true;
//                    }
//                }
//            }
//        }
//        return false;
//    }
//}


//class Solution {
//
//    public int shortestBridge(int[][] grid) {
//        int n=grid[0].length;
//        Queue<int[]> q=new LinkedList<>();
//        boolean[] visited=new boolean[n];
//        int level=0;
//        int[][] direction={{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
//        for(int i=0; i<n; i++){
//            for(int j=0; j<n;j++){
//                if(grid[i][j]==1) {
//                    DFS(grid,q,visited,i,j,direction);
//                    return BFS(grid, q, direction, visited);
//                }
//            }
//        }
//        return 0;
//    }
//
//    private void DFS(int[][] grid, Queue<int[]> q, boolean[] visited,int i,int j,int[][] direction) {
//        visited[grid[i][j]]=true;
//        q.add(new int[]{i,j});
//        for(int[] dir:direction) {
//            int rows = i + dir[0], cols = dir[1] + j;
//            if(rows>=0 && rows< grid.length && cols>=0 && cols< grid.length &&grid[rows][cols]==1){
//                if(!visited[grid[rows][cols]]) {
//                    DFS(grid, q, visited, rows, cols, direction);
//                }
//            }
//
//        }
//
//    }
//    private int BFS(int[][] grid,Queue<int[]> q,int[][] direction,boolean[] visited){
//        int level=0;
//        while(!q.isEmpty()){
//            int l=q.size();
//            while(l-->0){
//                int[] arr=q.poll();
//                for(int[] dir:direction){
//                    int rows=arr[0]+dir[0];
//                    int cols=arr[1]+dir[1];
//                    if(rows>=0 && rows< grid.length && cols>=0 && cols< grid.length && !visited[grid[rows][cols]]){
//                      if(grid[rows][cols]==1){
//                          return level;
//                      }
//                      visited[grid[rows][cols]]=true;
//                      q.offer(new int[]{rows,cols});
//                    }
//                }
//            }
//            level++;
//        }
//        return -1;
//    }
//}

//class Solution {
//    public boolean duplicate(char[] chars){
//        HashSet<Character> hs=new HashSet<>();
//        for(char c:chars){
//            if(hs.contains(c)) return false;
//            else hs.add(c);
//        }
//        return true;
//    }
//    public int possibleStringCount(String word) {
//        int ans=0;
//        char[] chars = word.toCharArray();
//        Arrays.sort(chars);
//        if(chars[0] == chars[chars.length - 1]) {
//            return word.length();
//        }
//        if(duplicate(chars)){
//            return 1;
//        }
//        for (int i=0; i<word.length(); i++){
//                if(i==0) continue;
//                if(word.charAt(i)==word.charAt(i-1)){
//                    ans++;
//                }
//        }
//        return ans+1;
//
//
//    }
//}