//import java.util.Scanner;
//
//public class XORAndGCD {
//    public static int GCD(int a,int b){
//        while(a!=b){
//            if(a>b) a-=b;
//            else b-=a;
//        }
//        return a;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int t=sc.nextInt();
//        while(t-->0){
//            int n=sc.nextInt();
//            int k=sc.nextInt();
//            int[] arr=new int[n];
//            for(int i=0; i<n; i++){
//                arr[i]=sc.nextInt();
//            }
//            int max=arr[0];
//            int min=arr[0];
//            for(int i=1; i<n; i++){
//                max=Math.max(arr[i],max);
//                min=Math.min(arr[i],min);
//            }
//            if(min==max ) {
//                if(min==k) System.out.println(0);
//                else System.out.println(1);
//                return;
//            }
//            int res=arr[0];
//            for(int i=1; i< arr.length; i++){
//                res=GCD(res,arr[i]);
//            }
//            if(res%k==0) System.out.println(1);
//            else System.out.println(2);
//        }
//    }
//}


//import java.util.*;
//class Solution {
//    public int numRabbits(int[] arr) {
//        int n=arr.length;
//        Map<Integer,Integer> map=new HashMap<>();
//        for(int x:arr) {
//            map.put(x,map.getOrDefault(x,0)+1);
//        }
//        int count=0;
//        for(int x:map.keySet()){
//            int noOfx=map.get(x);
//            int groupSize=(x+1);
//            int noOfGroup= (int) Math.ceil((double)(noOfx)/groupSize);
//            count+=noOfGroup * (groupSize);
//        }
//        return count;
//    }
//}

//import java.util.*;
//import java.lang.*;
//import java.io.*;
//
//class Codechef
//{
//    public static void count_(String s,String t,int count,List<Integer> list){
//        for(int i=1; i<s.length(); i++){
//            if(s.charAt(i)!=t.charAt(i)){
//                list.add(i);
//                count++;
//            }
//        }
//
//    }
//    public static void main (String[] args) throws java.lang.Exception
//    {
//        // your code goes here
//        Scanner sc=new Scanner(System.in);
//        int test=sc.nextInt();
//        while(test-->0){
//            int n=sc.nextInt();
//            String s=sc.next();
//            String t=sc.next();
//            if(s.charAt(0)!=t.charAt(0)){
//                System.out.println("-1");
//                continue;
//            }
//            List<Integer> list=new ArrayList<>();
//            int count=0;
//            count_(s,t,count,list);
//            System.out.println(count);
//            Collections.sort(list);
//            for(int x:list){
//                System.out.print(x+" ");
//            }
//            System.out.println();
//
//        }
//
//    }
//}

import java.util.*;

//class Solution {
//    public int subarraysDivByK(int[] arr, int k) {
//        // brut force approach for the problem.
//        int n=arr.length;
//        int count=0;
//        Map<Integer,Integer> map=new HashMap<>();
//        int currSum=0;
//        map.put(currSum, map.getOrDefault(currSum,0)+1);
//        for(int i=0; i<n; i++){
//            currSum+=arr[i];
//            int rem=currSum%k;
//            if(rem<0) {
//                rem=(rem+k)%k;
//            }
//            if(!map.containsKey(rem)){
//                map.put(rem,1);
//            } else {
//                count+=map.get(rem);
//                map.put(rem,map.get(rem)+1);
//            }
//        }
//        return count;
//
//    }
//
//}

//class Solution {
//    public long countInterestingSubarrays(List<Integer> list, int m, int k) {
//        int n=list.size();
//        int[] arr=new int[n];
//        // making prefix sum array..
//        for(int i=0; i<n; i++) {
//            if(list.get(i)%m==k) arr[i]=1;
//            else arr[i]=0;
//        }
//        int[] map=new int[k];
//        map[0]=1;
//        int currSum=0,count=0;
//        for(int i=0; i<n; i++){
//            currSum+=arr[i];
//            int rem=currSum%m;
//            if(rem<0) {
//                rem=(rem+k)%m;
//            }
//            count+=map[rem]++;
//        }
//        return count;
//    }
//}

//class Solution {
//    public int numberOfSubarrays(int[] arr, int k) {
//        HashMap<Integer,Integer> map=new HashMap<>();
//        int n=arr.length;
//        int count=0;
//        int sum=0;
//        map.put(sum,1);
//        for(int i=0; i<n; i++){
//            if(arr[i]%k!=0) sum++;
//            count+=map.getOrDefault(sum-k,0);
//            map.put(arr[i],map.getOrDefault(sum,0)+1);
//        }
//        return count++;
//    }
//}

//class Solution {
//    public String findCommonResponse(List<List<String>> list) {
//        int n=list.size();
//        Map<String,Integer> map=new HashMap<>();
//        for(List<String> s:list){
//            Set<String> set=new HashSet<>();
//            for(int i=0; i<s.size(); i++){
//                set.add(s.get(i));
//            }
//            List<String> aftab = new ArrayList<>(set);
//            for(int i=0; i<set.size(); i++){
//                map.put(aftab.get(i),map.getOrDefault(aftab.get(i),0)+1);
//            }
//        }
//        int count=0;
//        String ans="";
//        for(String key:map.keySet()){
//            if(map.get(key)>count){
//                count=map.get(key);
//                ans=key;
//            }
//            else if (map.get(key) == count) {
//                if (ans.equals("") || key.compareTo(ans) < 0) {
//                    ans = key;
//                }
//            }
//        }
//        return ans;
//    }
//}

//class Solution {
//    public void dfs(char[][] grid,int i,int j){
//        if(i<0 || i>= grid.length || j<0 || j>=grid[0].length || grid[i][j]=='0'){
//            return;
//        }
//        grid[i][j]='0';
//        dfs(grid,i+1,j);
//        dfs(grid,i-1,j);
//        dfs(grid,i,j-1);
//        dfs(grid,i,j+1);
//    }
//    public int numIslands(char[][] grid) {
//        if(grid==null || grid.length==0 || grid[0].length==0){
//            return 0;
//        }
//        int count=0;
//        for(int i=0; i< grid.length; i++){
//            for(int j=0; j< grid[0].length; j++){
//                if(grid[i][j]=='1'){
//                    dfs(grid,i,j);
//                    count++;
//                }
//            }
//        }
//    return count;
//    }
//}

//class Solution {
//    public void dfs(int[][] grid,int i,int j,int fresh){
//        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]==0 || grid[i][j]==2){
//            return;
//        }
//        grid[i][j]=2;
//        fresh--;
//
//    }
//    public int orangesRotting(int[][] grid) {
//        int row= grid.length;
//        int col=grid[0].length;
//        int fresh=0,count=0;
//        for(int i=0; i<row; i++){
//            for(int j=0; j<col; j++){
//                if(grid[i][j]==1) fresh++;
//            }
//        }
//        for(int i=0; i<row; i++){
//            for(int j=0; j<col; j++){
//                if(grid[i][j]==2) {
//                    dfs(grid,i+1,j,fresh);
//                    dfs(grid,i,j-1,fresh);
//                    dfs(grid,i,j+1,fresh);
//                    dfs(grid,i,j-1,fresh);
//                    count++;
//                }
//
//            }
//        }
//        if(fresh>0){
//            return -1;
//        }
//        return count;
//    }
//}

//class Solution {
//    public long countSubarrays(int[] arr, long k) {
//        int n=arr.length;
//        long count=0;
////        for(int x:arr){
////            if(x<k) count++;
////        }
//        int currSum=0;
//        int left=0,right=0;
//        while(right<n){
//            currSum+=arr[right];
//            int score=(right-left+1)*arr[right];
//            if(score<k){
//                count+=right-left+1;
//            } else {
//                while(score>=k){
//                    score-=arr[left];
//                    left--;
//                }
//            }
//            right++;
//        }
//        return count;
//    }
//}

//class Solution {
//    public long countSubarrays(int[] arr, int k) {
//        int max=0,n=arr.length;
//        for(int x:arr) {
//            if(x>max) max=x;
//        }
//        int left=0,right=0;
//        long count=0;
//        Map<Integer,Integer> map=new HashMap<>();
//        while(right<arr.length){
//            int num=arr[right];
//            map.put(num,map.getOrDefault(num,0)+1);
//            while(map.get(max)>=k){
//                count+=n-right;
//                map.put(arr[left],map.get(left)-1);
//                left++;
//            }
//            right++;
//        }
//        return count;
//    }
//}

//class Solution {
//    private int[][] SolveRecursive(int N) {
//        if (N == 0) {
//            return new int[][]{{0}};
//        }
//        int[][] baap = SolveRecursive(N - 1);
//        int n = baap.length;
//        int size = n * 2;
//        int[][] ans = new int[size][size];
//
//        int add = n * n;
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                int val = baap[i][j];
//                ans[i][j] = val + 3 * add;
//                ans[i][j + n] = val;
//                ans[i + n][j + n] = val + add;
//                ans[i + n][j] = val + 2 * add;
//            }
//        }
//
//        return ans;
//    }
//
//    public int[][] specialGrid(int n) {
//        return SolveRecursive(n);
//    }
//}

//class Solution {
//    public int numEquivDominoPairs(int[][] list) {
//        int count=0;
//        int[] arr=new int[100];
//        for(int[] x:list){
//            int sum=Math.min(x[0],x[1])+10*Math.max(x[0],x[1]);
//            count+=arr[sum];
//            arr[sum]++;
//        }
//        return count;
//    }
//}

//class Solution {
//    public int minDominoRotations(int[] tops, int[] bottoms) {
//        boolean nhi=false;
//        boolean na=false;
//        int count=Integer.MAX_VALUE;
//        int count2=Integer.MAX_VALUE;
//        for(int i=0; i< tops.length-1; i++){
//            if(tops[i]!=tops[i+1]) {
//                nhi = true;
//                break;
//            }
//        }
//        for(int i=0; i< bottoms.length-1; i++){
//            if(bottoms[i]!=bottoms[i+1]) {
//                na=true;
//                break;
//            }
//        }
//        for(int i=1; i<=6; i++){
//            int minCount=0;
//            for(int j=0; j< tops.length; j++){
//                if(tops[j]!=i) {
//                    if(tops[j]==bottoms[j]) {
//                        minCount++;
//                    } else {
//                        minCount=0;
//                        break;
//                    }
//                }
//            }
//            count=Math.min(count,minCount);
//        }
//        for(int i=1; i<=6; i++){
//            int minCount2=0;
//            for(int j=0; j< bottoms.length; j++){
//                if(bottoms[j]!=i) {
//                    if(tops[j]==bottoms[j]) {
//                        minCount2++;
//                    } else {
//                        minCount2=0;
//                        break;
//                    }
//                }
//            }
//            count=Math.min(count2,minCount2);
//        }
//        return Math.min(count2,count);
//    }
//}


//class Solution {
//    public long minSum(int[] nums1, int[] nums2) {
//        long a=0,b=0;
//        int counta=0,countb=0;
//        int n=nums1.length,m= nums2.length;
//
//        for(int i=0; i<n; i++){
//            if(nums1[i]==0) counta++;
//            a+=nums1[i];
//        }
//        for(int i=0; i<m; i++){
//            if(nums2[i]==0) countb++;
//            b+=nums2[i];
//        }
//        if(a>b){
//            if(countb==0 || counta+a<countb+b) return -1;
//            if(countb+b<=a+counta) return a+counta;
//            else return -1;
//        }
//        else if(b>a){
//            if(counta==0 || counta+a>countb+b) return -1;
//            if(counta+a<=countb+b) {
//                return countb+b;
//            } else return counta+a;
//        } else{
//            if(countb==0 && counta==0){
//                return a;
//            } else if(countb==0 || counta==0){
//                return -1;
//            } else {
//                return Math.max(counta,countb)+a;
//            }
//        }
//
//    }
//}
//
//class Solution {
//    public boolean isVowel(char c){
//        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
//            return true;
//        }
//        return false;
//    }
//    public int maxFreqSum(String s) {
//        int n=s.length();
//        Map<Character,Integer> vowel=new HashMap<>();
//        Map<Character,Integer> conso=new HashMap<>();
//        for(char c:s.toCharArray()){
//            if(isVowel(c)){
//                vowel.put(c,vowel.getOrDefault(c,0)+1);
//            } else {
//                conso.put(c,conso.getOrDefault(c,0)+1);
//            }
//        }
//        int count1=0;
//        for(int x: vowel.values()){
//            count1=Math.max(count1,x);
//        }
//        int count2=0;
//        for(int x: conso.values()){
//            count2=Math.max(count2,x);
//        }
//        return count1+count2;
//    }
//}

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static boolean solve(int[] arr) {
        boolean[] dp = new boolean[3];
        for (int x : arr) {
            int mod = x % 3;
            if (mod == 0) return true;
            boolean[] np = dp.clone();
            np[mod] = true;
            for (int rem = 0; rem < 3; rem++) {
                if (dp[rem]) {
                    np[(rem + mod) % 3] = true;
                }
            }
            dp = np;
            if (dp[0]) return true;
        }

        return false;
    }

    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) {
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0; i<n; i++) arr[i]=sc.nextInt();
            Arrays.sort(arr);

            long ans=n;
            for(int i=0; i<n; i++){
                if(i+1<n && arr[i]==arr[i+1]) continue;
                long halwai=n-i+1;
                long Monster=arr[i]+halwai;
                ans=Math.max(ans,Monster);
                System.out.println(ans);
            }
        }

    }
}
