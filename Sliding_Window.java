////import java.util.*;
////
////public class Sliding_Window {
////    public static int Sum(String s,int n){
////       int[] freq=new int[26];
////       int left=0;
////       int ans=0;
////       for(int right=0; right<n; right++){
////           freq[s.charAt(right)-97]++;
////           while(left<right && freq[s.charAt(right)-97]>s.charAt(right)-97+1){
////           left++;
////           freq[s.charAt(right)-97]--;
////           }
////           ans=Math.max(ans,right-left+1);
////       }
////
////        return ans;
////
////    }
////
////    public static void main(String[] args) {
////        int[] arr={-2,10,1,3,2,-1,4,5};
////        int num='z'-97+1;
////        System.out.println(num);
////    }
////}
////
////class Solution {
////    public int findMin(int[] arr){
////        int min=Integer.MAX_VALUE;
////        for(int i=0; i< arr.length; i++){
////            if(arr[i]<min){
////                min=arr[i];
////            }
////        }
////        return min;
////    }
////    public int minOperations(int[] arr, int k) {
////        int min=findMin(arr);
////        int ans=0;
////        if(min<k){
////            return -1;
////        }
////        Set<Integer> set=new HashSet<>();
////        for(int i=0; i< arr.length; i++){
////            set.add(arr[i]);
////        }
////        for(int num:set){
////            if(num>k) ans++;
////        }
////        return ans;
////    }
////}
//
////import java.util.*;
////import java.lang.*;
////import java.io.*;
////
////class Codechef
////{
////
////    public static int bfs(List<List<Integer>> adjList,int node,int n,boolean[] visited,int[] distance ){
////        Queue<Integer> q=new LinkedList<>();
////        q.add(node);
////        visited[node]=true;
////        distance[node]=1;
////        while(!q.isEmpty()){
////             int temp= q.poll();
////             if(temp==n) break;
////             for(int neighbour:adjList.get(temp)){
////                 if(!visited[neighbour]){
////                     if(distance[neighbour]>1+distance[temp]){
////                         distance[neighbour]=1+distance[temp];
////                     }
////                 }
////             }
////        }
////        return 1+distance[n];
////
////    }
////
////
////    public static void main (String[] args) throws java.lang.Exception
////    {
////        // your code goes here
////        Scanner sc=new Scanner(System.in);
////        int n=sc.nextInt();
////        int m=sc.nextInt();
////        List<List<Integer>> adjList=new ArrayList<>();
////        for(int i=0; i<m; i++){
////            adjList.add(new ArrayList<>());
////        }
////        while(m-->0){
////            int u=sc.nextInt();
////            int v=sc.nextInt();
////            adjList.get(u).add(v);
////            adjList.get(v).add(u);
////        }
////        boolean[] vis=new boolean[n+1];
////        int[] distance=new int[n+1];
////        for(int i=0; i<n; i++){
////            distance[i]=Integer.MAX_VALUE;
////        }
////        System.out.println(bfs(adjList,1,n,vis,distance));
////
////    }
////}
//
//
////import java.util.*;
////import java.lang.*;
////import java.io.*;
////
////class Codechef
////{
////    public static void DFS(List<List<Integer>> adjList, int node, List<Integer> list,boolean[] visited) {
////        visited[node]=true;
////        for(int neighbour: adjList.get(node)){
////            if(!visited[neighbour]) {
////                DFS(adjList,neighbour,list, visited);
////                list.add(neighbour);
////            }
////        }
////    }
////    public static void topological(List<List<Integer>> adjList,int node,int n){
////        List<Integer> list=new ArrayList<>();
////        boolean[] visited=new boolean[n+1];
////        Arrays.fill(visited,false);
////        for(int i=1; i<=n; i++){
////            if(!visited[i]){
////                DFS( adjList,  i,  list,visited);
////            }
////        }
////        Collections.reverse(list);
////        for(int x:list){
////            System.out.print(x+" ");
////        }
////        System.out.println();
////    }
////    public static void main (String[] args) throws java.lang.Exception
////    {
////        // your code goes here
////        Scanner sc=new Scanner(System.in);
////        int n=sc.nextInt();
////        int m=sc.nextInt();
////        List<List<Integer>> adjList=new ArrayList<>();
////        for(int i=0; i<n; i++){
////            adjList.add(new ArrayList<>());
////        }
////        while(m-->0){
////            int u=sc.nextInt();
////            int v=sc.nextInt();
////            adjList.get(u).add(v);
////        }
////        topological(adjList,1,n);
////
////    }
////}
////
////
////class Solution {
////    public void dfs(List<List<Integer>> adjList, int node,boolean[] visited){
////        visited[node]=true;
////        for(int neighbour:adjList.get(node)){
////            if(!visited[neighbour]) {
////                dfs(adjList, neighbour, visited);
////            }
////        }
////    }
////    public boolean hasCycle(List<List<Integer>> adjList, int node,int[] colour){
////        colour[node]=1;
////        for(int i: adjList.get(node)){
////            if(colour[i]==0){
////                if(hasCycle(adjList, 1, colour)) return true;
////            }
////            else if(colour[i]==1) return true;
////
////        }
////        colour[node]=2;
////        return false;
////    }
////    public boolean canFinish(int numCourses, int[][] prerequisites) {
////        int n=prerequisites.length;
////        List<List<Integer>> adjList=new ArrayList<>();
////        for(int i=0; i<n; i++){
////            adjList.add(new ArrayList<>());
////        }
////        for (int[] edge : prerequisites) {
////            int u = edge[0];
////            int v = edge[1];
////            adjList.get(u).add(v);
////        }
////        int[] color=new int[n+1];
////        Arrays.fill(color,0);
////        for(int i=0; i<n; i++){
////            if(color[i]==0 && hasCycle(adjList,i,color)) return false;
////        }
////        return true;
////
////    }
////}
//
////import java.util.*;
////class Solution{
////    public static List<Integer> topological(List<List<Integer>> adjList,int n,int[] indegree){
////        Queue<Integer> q=new LinkedList<>();
////        List<Integer> list=new ArrayList<>();
////        for(int i=0; i<n; i++){
////            if(indegree[i]==0) q.add(i);
////        }
////        while(!q.isEmpty()){
////            int node=q.poll();
////            list.add(node);
////            for(int v:adjList.get(node)){
////                indegree[v]--;
////                if(indegree[v]==0){
////                    q.add(v);
////                }
////            }
////        }
////        if(list.size()==n) {
////            return list;
////        }
////        return new ArrayList<>();
////    }
////    public int[] findOrder(int n,int[][] arr){
////        List<List<Integer>> adjList=new ArrayList<>();
////        for(int i=0; i<n; i++){
////            adjList.add(new ArrayList<>());
////        }
////        int[] indegree=new int[n];
////        for (int[] edge : arr) {
////            int u = edge[0];
////            int v = edge[1];
////            adjList.get(u).add(v);
////            indegree[v]++;
////        }
////
////        int[] ans=new int[n];
////        List<Integer> list=new ArrayList<>();
////        list=topological(adjList,n,indegree);
////        if(list==null) return new int[0];
////        int[] result = new int[list.size()];
////        for (int i = 0; i < list.size(); i++) {
////            result[i] = list.get(i);
////        }
////        return result;
////
////    }
////}
////
////
////class Solution {
////    public static int SumOfDigit(String s){
////        int n=s.length();
////        if(n%2!=0){
////            return 0;
////        }
////        int f=0;
////        int g=0;
////        for(int i=0;i<n/2;i++){
////            f+=s.charAt(i)-'0';
////        }
////        for(int i=n/2;i<n;i++){
////            g+=s.charAt(i)-'0';
////        }
////        if(f==g) return 1;
////        return 0;
////    }
////    public int countSymmetricIntegers(int low, int high) {
////        int count=0;
////        while(low<=high){
////            String s= String.valueOf(low);
////            count+=SumOfDigit(s);
////            low++;
////        }
////
////        return count;
////    }
////}
//
//
////class Solution {
////
////    public long countGoodIntegers(int n, int k) {
////        Set<String> set=new HashSet<>();
////        int d=(n+1)/2;
////        int start = (int) Math.pow(10, d - 1);
////        int end = (int) Math.pow(10, d) - 1;
////
////        for (int i = start; i <= end; i++) {
////            String leftHalf = String.valueOf(i);
////            String full = "";
////            if (n % 2 == 0) {
////                StringBuilder rightHalf = new StringBuilder(leftHalf).reverse();
////                full = leftHalf + rightHalf.toString();
////            } else {
////                StringBuilder rightHalf = new StringBuilder(leftHalf.substring(0, d - 1)).reverse();
////                full = leftHalf + rightHalf.toString();
////            }
////
////              long number = Long.parseLong(full);
////              if (number % k != 0)
////                  continue;
////
////              char[] chars = full.toCharArray();
////              Arrays.sort(chars);
////              set.add(new String(chars));
////          }
////
////          long[] fact=new long[11];
////          fact[0]=1;
////          for(int i=1;i<11; i++){
////              fact[i]=fact[i-1]*i;
////          }
////
////          long res=0;
////          for(String str:set){
////              long[] countDigit=new long[10];
////              for(char ch:str.toCharArray()){
////                  countDigit[ch-'0']++;
////              }
////              long nonZero=str.length()-countDigit[0];
////              long ans=(nonZero*fact[n-1]);
////              for(int i=0; i<10; i++){
////                  ans/=fact[(int)countDigit[i]];
////              }
////              res+=ans;
////          }
////          return res;
////
////    }
////}
////
////
////
////import java.util.Scanner;
////
////public class Main {
////
////    public static void main(String[] args) throws java.lang.Exception {
////        Scanner sc = new Scanner(System.in);
////        int t = sc.nextInt();
////        while (t-- > 0) {
////            int n=sc.nextInt();
////            int m=sc.nextInt();
////            int l=sc.nextInt();
////            int r=sc.nextInt();
////
////            if(l>=0 && r>=0){
////                System.out.println(0+" "+m);
////            }
////            else {
////                System.out.println(-1*(m/2)+" "+(m-m/2));
////            }
////
////        }
////        sc.close();
////    }
////}
////
////class Solution {
////    public static boolean isPrime(long n) {
////        if (n <= 1) return false;
////        if (n <= 3) return true;
////        if (n % 2 == 0 || n % 3 == 0) return false;
////
////        for (long i = 5; i * i <= n; i += 6) {
////            if (n % i == 0 || n % (i + 2) == 0)
////                return false;
////        }
////
////        return true;
////    }
////
////    class Solution {
////        private boolean isPrime(int n) {
////            return n == 2 || n == 3 || n == 5 || n == 7;
////        }
////
////        public int countGoodNumbers(long n) {
////            int ans= (int) (Math.pow(10,9)+7);
////            long start = 0;
////            long end = (long) Math.pow(10, n) - 1;
////            int count=0;
////            for (long i = start; i <= end; i++) {
////                String s=String.valueOf(i);
////                boolean flag=true;
////                for(int j=0; j<s.length(); j++){
////                    if(j%2==0 && (s.charAt(j)-'0')%2!=0) {
////                        flag=false;
////                        break;
////                    }
////                    if(j%2!=0 && !isPrime(s.charAt(j)-'0')) {
////                        flag=false;
////                        break;
////                    }
////
////                }
////                if(flag) count++;
////            }
////            return count%ans;
////        }
////    }
////}
//
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//
//class Solution {
//    public double findMedianSortedArrays(int[] a, int[] b) {
//          int m=a.length;
//          int n=b.length;
//          List<Integer> list=new ArrayList<>();
//          for(int i=0; i<m; i++){
//              list.add(a[i]);
//          }
//        for(int i=0; i<n; i++){
//            list.add(b[i]);
//        }
//        Collections.sort(list);
//        int s=list.size();
//        int mid=s/2;
//        if(s%2!=0){
//            int num= list.get(mid);
//            return num;
//        } else {
//            int f=list.get(mid);
//            int x=list.get(mid-1);
//            return (double) (f+x)/2;
//        }
//
//    }
//}

//import java.util.*;
//
//class Solution {
//    public long countGood(int[] arr, int k) {
//        int n= arr.length;
//        int left=0,right=0;
//        long res=0;
//        long pairs=0;
//        Map<Integer,Integer> map=new HashMap<>();
//        while(right<n){
//            pairs+=map.getOrDefault(arr[right],0);
//            map.put(arr[right], map.getOrDefault(arr[right],0)+1);
//            while(left<n){
//                res+=(n-right);
//                map.put(arr[left],map.get(arr[left]-1));
//                pairs-=map.get(arr[left]);
//                left++;
//            }
//            right++;
//        }
//        return res;
//    }
//}

import java.util.*;
//class Solution {
//    public boolean isAnagram(String s, String t) {
//         if(s.length()!=t.length()) return false;
//          char[] a=s.toCharArray();
//          char[] b=t.toCharArray();
//
//          Arrays.sort(a);
//          Arrays.sort(b);
//          return a.equals(b);
//    }
//}
//import java.util.*;
//class Solution {
//    public String freqString(String str){
//        int n=str.length();
//        int[] freq=new int[26];
//        StringBuilder sb=new StringBuilder();
//        for(char c:str.toCharArray()){
//            freq[c-'a']++;
//        }
//        for(int i=0; i<26; i++){
//            if(freq[i]>0){
//                sb.append((char)i+'a');
//                sb.append(freq[i]);
//            }
//        }
//        return sb.toString();
//
//    }
//    public List<List<String>> groupAnagrams(String[] arr) {
//        if(arr.length==0 || arr==null) return new ArrayList<>();
//           List<List<String>> ans=new ArrayList<>();
//           Map<String,List<String>> map=new HashMap();
//           int n= arr.length;
//           for(String s:arr){
//               String freqS=freqString(s);
//               if(map.containsKey(freqS)){
//                   map.get(freqS).add(s);
//               } else {
//                   List<String> list=new ArrayList<>();
//                   list.add(s);
//                   map.put(freqS, list);
//               }
//           }
//           for(Map.Entry<String,List<String>> res:map.entrySet()){
//               ans.add(res.getValue());
//           }
//
//           return ans;
//    }
//}

//class Solution {
//    public int findLower(int[] arr,int target,int low,int high){
//        int ans=Integer.MAX_VALUE;
//        while(low<=high){
//            int mid=(low)+(high-low)/2;
//            if(arr[mid]==target) {
//                ans=Math.min(ans,mid);
//                high=mid-1;
//            } else if(arr[mid]<target) {
//                low=mid+1;
//            } else {
//                high=mid-1;
//            }
//        }
//        return ans;
//    }
//    public int findUpper(int[] arr,int key,int low,int high){
//        int ans=Integer.MIN_VALUE;
//        while(low<=high){
//            int mid=(low)+(high-low)/2;
//            if(arr[mid]==key) {
//                ans=Math.max(ans,mid);
//                low=mid+1;
//            } else if(arr[mid]>key) {
//                high=mid-1;
//            } else {
//                low=mid+1;
//            }
//        }
//        return ans;
//    }
//    public int[] searchRange(int[] arr, int target) {
//        int a=findLower(arr,target,0, arr.length-1);
//        int b=findUpper(arr,target,0, arr.length-1);
//        if(a==Integer.MAX_VALUE && b==Integer.MIN_VALUE) {
//            return new int[] {-1,-1};
//        }
//        return new int[] {a,b};
//    }
//}