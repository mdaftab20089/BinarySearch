////import java.util.*;
////import java.io.*;
////
////class Codechef
////{
////    public static void main (String[] args) throws java.lang.Exception
////    {
////        Scanner sc = new Scanner(System.in);
////        int t = sc.nextInt();
////        while (t-- > 0) {
////            int n = sc.nextInt();
////            String s = sc.next();
////            Deque<Character> dq = new ArrayDeque<>();
////            int countV = 0;
////
////            // Count vowels from index 1 to n-1
////            for (int i = 1; i < n; i++) {
////                if (isVowel(s.charAt(i))) {
////                    countV++;
////                }
////            }
////
////            // Process characters and insert into deque
////            for (int i = 0; i < n; i++) {
////                char ch = s.charAt(i);
////
////                if (i != 0) {  // Decrement count only if i != 0
////                    if (isVowel(ch)) {
////                        countV--;
////                    }
////                    if (countV % 2 == 0) {
////                        dq.offerLast(ch);
////                    } else {
////                        dq.offerFirst(ch);
////                    }
////                } else {
////                    // For i == 0, handle separately (same as C++ logic)
////                    if (countV % 2 == 0) {
////                        dq.offerLast(ch);
////                    } else {
////                        dq.offerFirst(ch);
////                    }
////                }
////            }
////
////            // Print deque content
////            while (!dq.isEmpty()) {
////                System.out.print(dq.pollFirst());
////            }
////            System.out.println();
////        }
////        sc.close();
////    }
////
////    // Helper method to check if a character is a vowel
////    private static boolean isVowel(char ch) {
////        return "aeiou".indexOf(ch) != -1;
////    }
////}
//
//
////import java.util.HashMap;
////import java.util.Map;
////import java.util.Scanner;
////
////public class Main {
////
////    public static long countSubarrays(long[] arr) {
////        // Write your code here
////        long n=arr.length;
////        HashMap<Long,Long> mp=new HashMap<>();
////        long i=0;
////        long j=0,count=0;
////
////        while(i<n) {
////            mp.put(arr[(int) i], mp.getOrDefault(arr[(int) i],0L)+1);
////            while(mp.size()==3){
////                count+=(n-i);
////                mp.put(arr[(int)j],mp.get(arr[(int) j])-1);
////                if(mp.get((int) j)<=0){
////                    mp.remove(j);
////                }
////            }
////        }
////
////        return count;
////
////    }
////    public static void main(String[] args) {
////        Scanner scanner = new Scanner(System.in);
////        long n = scanner.nextLong();
////
////        long[] arr = new long[(int)n];
////        for (long i = 0; i < n; i++) {
////            arr[(int)i] = scanner.nextLong();
////        }
////
////        System.out.println(countSubarrays(arr));
////
////        scanner.close();
////    }
////}
//
////import java.util.*;
////
////public class Main {
////
////    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////
////        int t = sc.nextInt(); // Number of test cases
////
////        for (int i = 0; i < t; i++) {
////            int n = sc.nextInt();
////            int k = sc.nextInt();
////
////            AftabRahi res = helper(1, n, k);
////
////            System.out.println(res.value);
////        }
////
////        sc.close();
////    }
////
////    static class AftabRahi {
////        long value;
////        long siski;
////
////        AftabRahi(long value, long siski) {
////            this.value = value;
////            this.siski = siski;
////        }
////    }
////
////    public static AftabRahi helper(int l, int r, int d) {
////        if (r - l + 1 < d) {
////            return new AftabRahi(0, 0);
////        }
////        if (r - l + 1 == 1) {
////            return new AftabRahi(l, 1);
////        }
////
////        int mid = l + (r - l) / 2;
////
////        if ((r - l + 1) % 2 != 0) {
////            AftabRahi lres = helper(l, mid - 1, d);
////            long res = mid + 2 * lres.value + mid * lres.siski;
////            long siski = 2 * lres.siski + 1;
////
////            return new AftabRahi(res, siski);
////        } else {
////            AftabRahi lres = helper(l, mid, d);
////            long res = 2 * lres.value + mid * lres.siski;
////            long siski = 2 * lres.siski;
////
////            return new AftabRahi(res, siski);
////        }
////    }
////}
//
//
//
//
//
////import java.util.*;
////import java.lang.*;
////import java.io.*;
//
////class Codechef
////{
////    public static void main (String[] args) throws java.lang.Exception
////    {
////        // your code goes here
////        Scanner sc = new Scanner(System.in);
////        int t = sc.nextInt();
////        while(t-->0)
////        {
////            int n = sc.nextInt();
////            int[] arr = new int[n];
////            for (int i=0;i<n;i++)
////                arr[i]=sc.nextInt();
////
////            int []res = new int[2];
////            res = helper(arr, arr[0]);
////            int end = (res[0] + arr[0]) / 2;
////            int start = (res[1] + 1 + arr[0]) / 2;
////            if(res[0] == 1000000)
////                System.out.println(1000000 - start + 1);
////            else if(res[1] == 0)
////                System.out.println(end);
////            else
////                System.out.println(end - start + 1);
////
////        }
////
////    }
////    public static int[] helper(int[] arr, int firstElement) {
////        Integer ML = 1000000;
////        Integer NL = 0;
////
////        for (int i = 1; i < arr.length; i++) {
////            if (arr[i] > firstElement) {
////                if (arr[i] < ML) {
////                    ML = arr[i];
////                }
////            } else if (arr[i] < firstElement) {
////                if (arr[i] > NL) {
////                    NL = arr[i];
////                }
////            }
////        }
////
////        return new int[] { ML, NL };
////    }
////}
//
//
////class Solution {
////    public int[] vowelStrings(String[] w, int[][] q) {
////        int n=w.length;
////        int m=q.length;
////        Set<Character> set=new HashSet<>();
////        set.add('a');
////        set.add('e');
////        set.add('i');
////        set.add('o');
////        set.add('u');
////        int[] arr=new int[n];
////        int[] brr=new int[m];
////        int count=0;
////        int ind=0;
////        for(String x:w){
////            char first=x.charAt(0);
////            char last=x.charAt(x.length()-1);
////            if(set.contains(first) && set.contains(last)) {
////                arr[count++]=1;
////            }
////        }
////        int[] prefix = new int[arr.length];
////        prefix[0] = arr[0];
////        for (int i = 1; i < arr.length; i++) {
////            prefix[i] = prefix[i - 1] + arr[i];
////        }
////        for(int[] query:q) {
////            int left=query[0];
////            int right=query[1];
////            brr[ind++]=prefix[right]-prefix[left];
////        }
////
////        return brr;
////
////    }
////}
//
////import java.util.*;
////import java.lang.*;
////import java.io.*;
////public class Main{
////    public static void main(String[] args) {
////           Scanner sc=new Scanner(System.in);
////           int t=sc.nextInt();
////           while(t-->0){
////               int n=sc.nextInt();
////               int k=sc.nextInt();
////              int[] arr=new int[n];
////              for(int i=0; i<n; i++){
////                  arr[i]=sc.nextInt();
////              }
////
////
////           }
////    }
////}
//
//
////import java.util.*;
////
////public class Main {
////
////    static void fun(int left, int right) {
////        int ind = 0;
////        int nas = 0;
////
////        // Loop through bits from 29 down to 0
////        for (int i = 29; i >= 0; i--) {
////            if ((right & (1 << i)) != (left & (1 << i))) {
////                nas += (1 << i);
////                ind = i;
////                break;
////            } else {
////                if ((left & (1 << i)) != 0) {
////                    nas += (1 << i);
////                }
////            }
////        }
////
////        int sv = nas - 1;
////        int tv = (nas == right) ? right - 2 : right;
////
////        System.out.println(nas + " " + sv + " " + tv);
////    }
////    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        int t = sc.nextInt();
////
////        while (t-- > 0) {
////            int l = sc.nextInt();
////            int r = sc.nextInt();
////            //System.out.println(calculateMaxXor(l, r));
////            fun(l,r);
////        }
////
////        sc.close();
////    }
////}
//
////import java.util.*;
////class Main {
////    public List<String> stringMatching(String[] s) {
////        int n=s.length;
////        Set<String> list=new HashSet<>();
////        List<String> ls=new ArrayList<>();
////        for(int i=0; i<n; i++){
////            String str=s[i];
////            for(int j=i+1; j<n; j++){
////               if(s[j].contains(str)) {
////                   list.add(str);
////               }
////            }
////        }
////        return new ArrayList<>(list);
////
////    }
////}
//
//
////class Solution {
////    public boolean helper(String a,String b){
////        int n=a.length();
////        int m=b.length();
////        if(n>m){
////            return false;
////        }
////        if(a.charAt(0)!=b.charAt(0)) return false;
////        if(a.charAt(n-1)!=b.charAt(m-1)) return false;
////        if(!b.contains(a)) return false;
////        return true;
////    }
////    public int countPrefixSuffixPairs(String[] words) {
////        int n= words.length;
////        int count=0;
////        for(int i=0; i<n; i++){
////            for(int j=i+1; j<n; j++){
////                if(helper(words[i],words[j])){
////                    count++;
////                }
////            }
////        }
////
////        return count;
////    }
////}
//
//
////}
//
////import java.util.*;
////import java.lang.*;
////import java.io.*;
////
////class Codechef {
////    public static void main(String[] args) throws java.lang.Exception {
////        Scanner sc = new Scanner(System.in);
////        int t = sc.nextInt();
////        while (t-- > 0) {
////            int n = sc.nextInt();
////            int k = sc.nextInt();
////            int a[] = new int[n];
////            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
////            int freq[] = new int[21];
////            int m = 0;
////            for (int ele : a) {
////                freq[ele]++;
////                m = Math.max(m, freq[ele]);
////            }
////            if (freq[k] == m) {
////                System.out.println(0);
////            } else {
////                boolean aftab = false;
////                for (int i = 0; i < n - 1; i++) {
////                    freq[a[i]]--;
////                    int max = 0;
////                    for (int j = 0; j < 21; j++) max = Math.max(max, freq[j]);
////                    if (freq[k] == max) {
////                        aftab = true;
////                        break;
////                    }
////                }
////                if (aftab) {
////                    System.out.println(1);
////                } else {
////                    Arrays.fill(freq, 0);
////                    for (int ele : a) freq[ele]++;
////                    boolean ans = false;
////                    for (int i = n - 1; i > 0; i--) {
////                        freq[a[i]]--;
////                        int max = 0;
////                        for (int j = 0; j < 21; j++) max = Math.max(max, freq[j]);
////                        if (freq[k] == max) {
////                            ans = true;
////                            break;
////                        }
////                    }
////                    if (ans) System.out.println(1;
////                    else System.out.println(2);
////                }
////            }
////        }
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
////
////
//////    public static int checkFun(int[] arr,int k,int n){
//////        int j=n-1;
//////        int count=1;
//////        int MaxFreq=0;
//////        Map<Integer,Integer> hm=new HashMap<>();
//////        while(j>=0){
//////             hm.put(arr[j], hm.getOrDefault(count++,0));
//////             MaxFreq=Math.max(MaxFreq)
//////        }
//////    }
////    public static void main (String[] args) throws java.lang.Exception
////    {
////        // your code goes here
////        Scanner sc=new Scanner(System.in);
////        int t=sc.nextInt();
////        while(t-->0) {
////            int n = sc.nextInt();
////            int k = sc.nextInt();
////            int arr[] = new int[n];
////            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
////            int freq[] = new int[21];
////            int maxFreq=0;
////            int res=2;
////            for(int i=0; i<n; i++){
////                freq[arr[i]]++;
////                maxFreq=Math.max(maxFreq,freq[arr[i]]);
////            }
////            if(maxFreq==freq[k]){
////                System.out.println("0");
////                continue;
////            }
////            int count=0;
////            boolean flag=false;
////            for(int i=n-1; i>=0; i--){
////                if(arr[i]==k){
////                    if(freq[k]>=count){
////                        System.out.println("1");
////                        flag=true;
////                        break;
////                    }
////                }
////               int arrFreq=freq[arr[i]];
////               count=Math.max(arrFreq,count);
////            }
////            if(flag==false){
////                System.out.println(2);
////            }
////
////        }
////    }
////}
//
//
//import java.net.Inet4Address;
//import java.util.*;
//
////class Solution {
////    public void helper(Map<Character,String> hm,List<String> list,String s,int idx,StringBuilder sb){
////        if(idx==s.length()){
////            list.add(sb.toString());
////            return;
////        }
////        String letters=hm.get(s.charAt(idx));
////        for(char x:letters.toCharArray()){
////           sb.append((x));
////           helper(hm, list, s, idx+1, sb);
////           sb.deleteCharAt(sb.length()-1);
////        }
////
////    }
////    public List<String> letterCombinations(String s) {
////           List<String> list=new ArrayList<>();
////           int n=s.length();
////        Map<Character,String> hm=new HashMap<>();
////        hm.put('2', "abc");
////        hm.put('3', "def");
////        hm.put('4', "ghi");
////        hm.put('5', "jkl");
////        hm.put('6', "mno");
////        hm.put('7', "pqrs");
////        hm.put('8', "tuv");
////        hm.put('9', "wxyz");
////        if(s.length()==0){
////            return list;
////        }
////        helper(hm, list, s, 0, new StringBuilder());
////        return list;
////    }
////}
////}
//
////import java.util.*;
////class Solution {
////    public void helper(List<List<Integer>> ans,int[] arr,int target,int idx ,List<Integer> list){
////        if(idx==arr.length){
////            if(target==0){
////                ans.add(new ArrayList<>(list));
////            }
////        }
////        if(target>=arr[idx]) {
////            list.add(arr[idx]);
////            helper(ans, arr, target-arr[idx], idx, list);
////            list.remove(list.size()-1);
////        }
////        helper(ans, arr, target, idx+1, list);
////
////    }
////    public List<List<Integer>> combinationSum(int[] arr, int target) {
////        List<List<Integer>> ans=new ArrayList<>();
////        helper(ans,arr,target,0,new ArrayList<>());
////        return ans;
////    }
////}
//
//import java.util.*;
//
////public class Main {
////    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        int t = sc.nextInt();
////        while (t-- > 0) {
////            int n=sc.nextInt();
////            int m=sc.nextInt();
////            List<List<Integer>> ans=new ArrayList<>();
////            List<Integer> list=new ArrayList<>();
////            for(int i=0; i<n; i++){
////                for(int j=0; j<m; j++){
////                    int num=sc.nextInt();
////                    list.add(num);
////                }
////                Collections.sort(list);
////                ans.add(new ArrayList<>(list));
////                list.remove(list.size()-1);
////            }
////            List<Integer> sol=new ArrayList<>();
////
////
////
////
////
////
////        }
////
////        sc.close();
////    }
////}
//
//
//import java.util.*;
//
////public class Main {
////
////    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        int t = sc.nextInt();
////        while (t-- > 0) {
////            int n=sc.nextInt();
////            int[] arr=new int[n];
////            for(int i=0; i<n; i++){
////                arr[i]=sc.nextInt();
////            }
////            int ele=Integer.MIN_VALUE;
////            for(int X:arr){
////                if(X>ele) ele=X;
////            }
////            if(ele==arr[0]){
////                System.out.println("No");
////            } else {
////                System.out.println("Yes");
////            }
////        }
////
////    }
////
////}
//
//
//
////class Solution {
////    public static int countSingleOnes(int[][] grid) {
////        int m = grid.length;
////        int n = grid[0].length;
////
////        int totalSingleOnes = 0;
////
////        // Create arrays to store the frequency of 1s in each row and column
////        int[] rowCount = new int[m];
////        int[] colCount = new int[n];
////
////        // Calculate frequency of 1s in each row and column
////        for (int i = 0; i < m; i++) {
////            for (int j = 0; j < n; j++) {
////                if (grid[i][j] == 1) {
////                    rowCount[i]++;
////                    colCount[j]++;
////                }
////            }
////        }
////
////        // Count 1s that are unique in their row and column
////        for (int i = 0; i < m; i++) {
////            for (int j = 0; j < n; j++) {
////                if (grid[i][j] == 1 && rowCount[i] == 1 && colCount[j] == 1) {
////                    totalSingleOnes++;
////                }
////            }
////        }
////
////        return totalSingleOnes;
////    }
////    public int countServers(int[][] arr) {
////        // brute force Approach
////        int n = arr.length;
////        int m = arr[0].length;
////        int freq[] = new int[m];
////        int ans = 0;
////        int col = 0;
////        int countZero = 0;
////        int countOne = 0;
////        for (int i = 0; i < m; i++) {
////            for (int j = 0; j < n; j++) {
////                if (arr[i][j] == 0) {
////                    countZero++;
////                } else {
////                    countOne++;
////                }
////            }
////        }
////        return countOne-countSingleOnes(arr);
////    }
////}
//
////class Solution {
////    public void BackTrack(List<List<Integer>> ans,List<Integer> list,int[] arr,int ind)  {
////        if(ind==arr.length){
////            ans.add(new ArrayList<>(list));
////            return;
////        }
////        for(int i=0; i<arr.length; i++){
////            if(list.contains(arr[i])) continue;
////            list.add(arr[i]);
////            BackTrack(ans,list,arr,ind+1);
////            list.remove(list.size()-1);
////
////        }
////    }
////    public List<List<Integer>> permute(int[] nums) {
////        List<List<Integer>> ans=new ArrayList<>();
////        BackTrack(ans,new ArrayList<>(),nums,0);
////        return ans;
////    }
////}
//
//
////import java.util.Scanner;
////
////public class Main {
////    public static int[] helperFun(int n){
////        int[] arr={1 ,1,2, 3, 1, 2};
////        int[] brr={1 ,1,2, 3, 1, 2,2};
////        List<Integer> list=new ArrayList<>();
////        if(n==6) {
////           return arr;
////        }
////        if(n==7) return brr;
////        int count=1;
////        int[] ans=new int[n+1];
////        for(int i=1; i<=n/2; i++){
////            ans[i]=i;
////        }
////        for(int i=n/2+1; i<=n; i++){
////            ans[i]=count++;
////        }
////        if(n%2!=0) {
////            arr[n]=n;
////        }
////        return arr;
////    }
////    public static void main(String[] args) {
////           Scanner sc=new Scanner(System.in);
////           int t=sc.nextInt();
////           while(t-->0){
////               int n=sc.nextInt();
////               int[] ans=new int[n+1];
////               ans=helperFun(n);
////               for(int x:ans){
////                   System.out.print(x);
////               }
////               System.out.println();
////           }
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
////    public static void main (String[] args) throws java.lang.Exception
////    {
////        // your code goes here
////        Scanner scanner = new Scanner(System.in);
////        int t = scanner.nextInt(); // Number of test cases
////
////        while (t-- > 0) {
////            int n = scanner.nextInt();
////            long x = scanner.nextInt();
////            List<Long> list=new ArrayList<>();
////            for(int i=0; i<n; i++){
////                long num=scanner.nextInt();
////                list.add(num);
////            }
////            Collections.sort(list, Collections.reverseOrder());
////            long ans=list.get(0);
////            for(int i=1; i<n; i++){
////                long curr=list.get(i);
////                ans=Math.max(ans,curr+(i*x));
////            }
////            System.out.println(ans);
////
////
////
////        }
////
////    }
////}
//
//
////import java.util.*;
////
////public class Main {
////    public static long gcd(long a,long b){
////        if(b==0) return a;
////        return gcd(b, a%b);
////    }
////
////    public static void main(String[] args) {
////        Scanner sc=new Scanner(System.in);
////        long n=sc.nextLong();
////        long m=sc.nextLong();
////        long[] a=new long[(int) n];
////        long[] b=new long[(int) m];
////        for(int i=0; i<n; i++){
////            a[i]=sc.nextLong();
////        }in
////        for(int i=0; i<m; i++){
////            b[i]=sc.nextLong();
////        }
////        long cal=0;
////        for(int i=1; i<n-1; i++){
////            cal=gcd(a[i],a[i+1]);
////        }
////        for(int i=0; i<m; i++){
////            long ans=gcd(a[0]+b[i],cal);
////            System.out.println(ans);
////        }
////
////
////    }
////}
//
////import java.util.*;
////public class Main {
////    public static boolean isPrime(long n) {
////        // Handle edge cases for n <= 1
////        if (n <= 1) {
////            return false;
////        }
////
////        // Create a boolean array to mark the prime numbers
////        boolean[] sieve = new boolean[(int) (n + 1)];
////
////        // Initialize all numbers as prime (true)
////        for (int i = 2; i <= n; i++) {
////            sieve[i] = true;
////        }
////
////        // Sieve of Eratosthenes algorithm to mark non-prime numbers
////        for (int i = 2; i * i <= n; i++) {
////            if (sieve[i]) {
////                for (int j = i * i; j <= n; j += i) {
////                    sieve[j] = false;  // Mark multiples of i as non-prime
////                }
////            }
////        }
////
////        // Return the value for n, if it's true then it's prime
////        return sieve[(int) n];
////    }
////
////    public static void main(String[] args) {
////        Scanner sc=new Scanner(System.in);
////        int t=sc.nextInt();
////        int[] arr=new int[t];
////        for(int i=0; i<t; i++){
////            arr[i]=sc.nextInt();
////            int x= (int) Math.sqrt(arr[i]);
////            if(isPrime(x) && x*x==arr[i]){
////                System.out.println("YES");
////            } else System.out.println("NO");
////        }
////
////    }
////}
//
//
////class Solution {
////    int l,m,n;
////    int[][] visited={{0,1},{0,-1},{1,0},{-1,0}};
////    public boolean find(char[][] board,int i,int j,int idx,String word){
////        if(idx==word.length()) {
////            return true;
////        }
////        if(idx>=l) return true;
////        if(i<0 || j<0 || i>=m || j>=n || board[i][j]!=word.charAt(idx)){
////            return false;
////        }
////        char temp=board[i][j];
////        board[i][j]='$';
////        for(int[] dir:visited){
////            int i_=i+dir[0];
////            int j_=j+dir[1];
////            if (find(board,i_,j_,idx+1,word)){
////                return true;
////            }
////        }
////        board[i][j]=temp;
////        return false;
////
////    }
////    public boolean exist(char[][] board, String word) {
////        m=board.length;
////        n =board[0].length;
////        l=word.length();
////        for (int i=0; i<m; i++){
////            for(int j=0; j<n; j++){
////                if(word.charAt(0)==board[i][j] && find(board,i,j,0,word)){
////                    return true;
////                }
////            }
////        }
////        return false;
////    }
////}
//
//
////import java.util.*;
////
////public class Main {
////
////    public static int count(int[] arr) {
////        HashSet<Integer> hq = new HashSet<>();
////        for (int num : arr) {
////            hq.add(num);
////        }
////        return hq.size();
////    }
////    public static void main(String[] args) {
////        Scanner sc=new Scanner(System.in);
////        int t=sc.nextInt();
////        while (t-->0) {
////            int n=sc.nextInt();
////            int[] arr=new int[n];
////            int[] brr=new int[n];
////            for(int i=0; i<n; i++){
////                arr[i]=sc.nextInt();
////            }
////            for(int i=0; i<n; i++){
////                brr[i]=sc.nextInt();
////            }
////            int count1=count(arr);
////            int count2=count(brr);
////            if(count2>=3 || count1>=3){
////                System.out.println("YES");
////                continue;
////            }
////            if(count1>=2 && count2>=2){
////                System.out.println("YES");
////                continue;
////            }
////            else {
////                System.out.println("NO");
////            }
////        }
////    }
////}
//
//
////import java.util.*;
////
////public class Main {
////
////    public static void solver(int[] arr,int n){
////        Arrays.sort(arr);
////        List<Integer> list=new ArrayList<>();
////        for(int X:arr){
////            list.add(X);
////        }
////        int ans=-1;
////        for(int i=1; i<n; i++){
////            if(list.get(i).equals(list.get(i-1))) ans=i;
////        }
////        if(ans==-1){
////            System.out.println(-1);
////            return;
////        }
////        int x=list.get(ans);
////        list.remove(ans);
////        list.remove(ans-1);
////        for(int i=1; i<n; i++){
////            if(list.get(i)<list.get(i-1)+2*x){
////                System.out.println(x + " " + x + " " + list.get(i - 1) + " " + list.get(i));
////                return;
////            }
////        }
////    }
////    public static void main(String[] args) {
////        Scanner sc=new Scanner(System.in);
////        int t=sc.nextInt();
////        while (t-->0) {
////            int x=sc.nextInt();
////            int y=sc.nextInt();
////            if(x>0 && y==0){
////                String s="";
////                for(int i=0; i<x; i++)
////                    s+="1";
////                System.out.println(s);
////
////            } else if(x==0 && y>0){
////                String s="";
////                for(int i=0; i<x; i++)
////                    s+="2";
////                System.out.println(s);
////            } else {
////                String s="";
////                for(int i=0; i<x/2; i++){
////                    s+=1;
////                }
////                for(int i=0; i<y; i++){
////                    s+=2;
////                }
////                for(int i=0; i<x/2; i++){
////                    s+=1;
////                }
////                System.out.println(s);
////            }
////
////
////        }
////    }
////}
//
//
//import java.util.*;
//
//class Main {
//
//    public static void dfs(List<List<Integer>> adjList,boolean[] visited,int node,List<Integer> ans){
//        visited[node]=true;
//        ans.add(node);
//        for(int neighbour:adjList.get(node)){
//            if(!visited[neighbour]){
//                dfs(adjList, visited, neighbour, ans);
//            }
//        }
//    }
//    public static void performDFS(List<List<Integer>> adjList,int numNodes){
//        boolean[] visited=new boolean[numNodes+1];
//        for(int i=1; i<=numNodes; i++){
//            if(!visited[i]){
//                dfs(adjList,visited,i,new ArrayList<>());
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int m=sc.nextInt();
//        List<List<Integer>> adjList=new ArrayList<>();
//
//        for (int i=0; i<=n; i++){
//            adjList.add(new ArrayList<>());
//        }
//        for(int i=1; i<=m; i++){
//            int u= sc.nextInt();
//            int v=sc.nextInt();
//            adjList.get(u).add(v);
//        }
//        List<Integer> ans=new ArrayList<>();
//        boolean[] visited=new boolean[n+1];
//        dfs(adjList,visited,1,ans);
//        Collections.sort(ans);
//        for(int X:ans){
//            System.out.print(X+" ");
//        }
//        System.out.println();
//    }
//}
//
//
//
//
//import java.util.*;
//
//class Solution {
//    public static boolean bfs(List<List<Integer>> adjList, int start, int[] color) {
//        Queue<Integer> q = new LinkedList<>();
//        q.add(start);
//        color[start] = 0; // Start coloring with 0
//
//        while (!q.isEmpty()) {
//            int node = q.poll();
//
//            for (int neighbour : adjList.get(node)) {
//                if (color[neighbour] == -1) { // Not colored yet
//                    color[neighbour] = 1 - color[node]; // Assign opposite color
//                    q.add(neighbour);
//                } else if (color[neighbour] == color[node]) {
//                    return false; // Conflict detected
//                }
//            }
//        }
//        return true;
//    }
//
//    public boolean isBipartite(int[][] graph) {
//        int n = graph.length;
//        List<List<Integer>> adjList = new ArrayList<>();
//        for (int i = 0; i < n; i++) {
//            adjList.add(new ArrayList<>());
//        }
//
//        // Build adjacency list
//        for (int i = 0; i < n; i++) {
//            for (int v : graph[i]) {
//                adjList.get(i).add(v);
//                adjList.get(v).add(i); // Undirected graph
//            }
//        }
//
//        // Use color array instead of map for efficiency
//        int[] color = new int[n];
//        Arrays.fill(color, -1); // -1 means not colored
//
//        // Handle disconnected graph by checking all components
//        for (int i = 0; i < n; i++) {
//            if (color[i] == -1) { // If unvisited, start BFS
//                if (!bfs(adjList, i, color)) return false;
//            }
//        }
//        return true;
//    }
//}
//import java.util.*;
//class Solution {
//    public boolean dfs(ArrayList<ArrayList<Integer>> adjList,int[] colors,int start,int color){
//        colors[start]=color;
//        for(int node:adjList.get(start)){
//            if(colors[node]==-1) {
//                if (dfs(adjList, colors, node, color == 0 ? 1 : 0) == false) return false;
//            }
//            else if(colors[node]==color){
//                return false;
//            }
//        }
//
//        return true;
//    }
//    public boolean isBipartite(ArrayList<ArrayList<Integer>> adj) {
//        // Code here
//        int n=adj.size();
//        int[] colors=new int[n+1];
//        Arrays.fill(colors,-1);
//        for(int i=0; i<n; i++){
//            if(colors[i]==-1){
//            if(!dfs(adj,colors,i,0)) return false;
//            }
//        }
//        return true;
//    }
//}
//import java.util.*;
//class Solution {
//    public static boolean DetectCycle(List<List<Integer>> adjList,int node,int n) {
//        int[] color=new int[n];
//        boolean hasCycle=false;
//        Arrays.fill(color,0);
//        for(int i=0; i<n; i++){
//            if(color[i]==0 && dfs(adjList,i,color)) {
//                hasCycle=true;
//                break;
//            }
//        }
//        return hasCycle;
//    }
//    public static boolean dfs(List<List<Integer>> adjList,int node,int[] color){
//        if(color[node]==1) {
//            return true;
//        }
//        if(color[node]==0) {
//            color[node] = 1;
//            for (int neighbour : adjList.get(node)) {
//                if (dfs(adjList, neighbour, color)) return true;
//            }
//            color[node] = 2;
//        }
//        return false;
//    }
//
//    public List<Integer> eventualSafeNodes(int[][] graph) {
//        int n = graph.length;
//        List<List<Integer>> adjList = new ArrayList<>();
//        for (int i = 0; i < n; i++) {
//            adjList.add(new ArrayList<>());
//        }
//
//        // Build adjacency list
//        for (int i = 0; i < n; i++) {
//            for (int v : graph[i]) {
//                adjList.get(i).add(v);
//            }
//        }
//        int[] color=new int[n];
//        List<Integer> safeNode=new ArrayList<>();
//        for (int i=0; i<n; i++){
//            if(dfs(adjList,i,color)==false) safeNode.add(i);
//        }
//        return safeNode;
//    }
//}
//import java.util.*;
//class Solution {
//    public static void dfs(List<List<Integer>> rooms,boolean[] visited,int node){
//        visited[node]=true;
//        for(int room:rooms.get(node)){
//            if(!visited[room]){
//                dfs(rooms,visited,room);
//            }
//        }
//    }
//    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
//        int n=rooms.size();
//        boolean[] visited=new boolean[n];
//        dfs(rooms,visited,0);
//        for(int i=0; i<n; i++){
//            if(!visited[i]){
//                return false;
//            }
//        }
//        return true;
//    }
//}

//class Solution {
//    public boolean hasSameDigits(String s) {
//        int n=s.length();
//        if(n<=2) {
//            return s.charAt(0)==s.charAt(1);
//        }
//        while(n>2) {
//            StringBuilder sb = new StringBuilder();
//            for (int i = 0; i < s.length() - 1; i++) {
//                sb.append(String.valueOf((sb.charAt(i) - '0' + sb.charAt(i + 1) - '0') % 10));
//            }
//            s=sb.toString();
//        }
//        return s.charAt(0)==s.charAt(1);
//    }
//}

//import java.util.*;
//
//public class Main{
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int t=sc.nextInt();
//        while(t-->0){
//            int n=sc.nextInt();
////            int[] arr=new int[n];
////            for(int i=0; i<n; i++){
////                arr[i]=sc.nextInt();
////            }
//            String s=sc.next();
//            if(n<3) {
//                System.out.println(0);
//                continue;
//            }
//            int upper=0;
//            int lower=0;
//            for(char c:s.toCharArray()){
//                if (c=='-') upper++;
//                else lower++;
//            }
//            if(upper<2 || lower<1) {
//                System.out.println(0);
//                continue;
//            }
//            int ans=upper/2,res=upper-ans;
//            long aftab=lower*ans*res;
//            System.out.println(aftab);
//        }
//    }
//}

//import java.util.*;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        while (t-- > 0) {
//            int n = sc.nextInt();
//            int[] arr=new int[n];
//            int ans=0;
//            int aftab1=0,aftab2=0;
//            for(int i=0; i<n; i++){
//               int  cn1=0,cn2=0;
//                for (int j=i+1;j<n; j++){
//                    if(arr[i]>arr[j]) cn1++;
//                    else if(arr[i]<arr[j]) cn2++; // count of greater
//                    int res=cn2-cn1;
//                    if(res<ans){
//                        ans=res;
//                        aftab1=i;
//                        aftab2=j;
//                    }
//                }
//            }
//            System.out.println(aftab1+" "+aftab2);
//        }
//        sc.close();
//    }
//}


import java.math.BigInteger;
import java.util.*;

//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        while (t-- > 0) {
//            int n = sc.nextInt();
//            int x=sc.nextInt();
//            int ans=0;
//            for(int i=0; i<n; i++){
//                ans|=i;
//            }
//            if(ans==x){
//                for(int i=0; i<n; i++)
//                System.out.print(i+" ");
//                System.out.println();
//            } else {
//                for(int i=0; i<n-1; i++) System.out.print(i+" ");
//                System.out.println(x);
//            }
//        }
//        sc.close();
//    }
//}


//import java.util.*;
//
//public class Main {
//    class Solution {
//
//        public int longestNiceSubarray(int[] arr) {
//            int n=arr.length;
//            if(n==1) {
//                return 1;
//            }
//            int maxWindow=0;
//            int num=0;
//            int start=0;
//
//            for(int end=0; end<n; end++){
//                while((num&arr[end])!=0){
//                    num^=arr[end];
//                    end++;
//                }
//                num|=arr[end];
//                maxWindow=Math.max(maxWindow,end-start+1);
//            }
//
//            return maxWindow;
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//        int t=sc.nextInt();
//        while(t-->0){
//            int n=sc.nextInt();
//            int l= sc.nextInt();
//            int r=sc.nextInt();
//            int[] arr=new int[n];
//            for(int i=0; i<n; i++){
//                arr[i]=sc.nextInt();
//            }
//
//        }
//        sc.close();
//    }
//}


//import java.util.Scanner;
//
//public class Main {
//    public static boolean CheckPrime(long n) {
//        if (n <= 1) return false;
//        if (n <= 3) return true;
//        if (n % 2 == 0 || n % 3 == 0) return false;
//
//        for (long i = 5; i * i <= n; i += 6) {
//            if (n % i == 0 || n % (i + 2) == 0)
//                return false;
//        }
//
//        return true;
//    }
//
//    public static void main(String[] args) throws java.lang.Exception {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        while (t-- > 0) {
//            long n=sc.nextLong();
//            long k=sc.nextLong();
//            long temp=n;
//            long count=0;
//            while(temp>0){
//                count+=temp%10;
//                temp/=10;
//            }
//            if(k==1) {
//                if(!CheckPrime(n)){
//                    System.out.println("No");
//                } else System.out.println("Yes");
//        } else {
//            if(n!=1) {
//                System.out.println("No");
//            } else {
//                long ans=0;
//                for(int i=0; i<k; i++){
//                    ans=ans*10+1;
//                }
//                if(CheckPrime(ans)){
//                    System.out.println("Yes");
//                } else System.out.println("No");
//            }
//        }
//
//    }
//
//        sc.close();
//}
//
//
//}
//
//
//class Solution2 {
//    public String count_freq(int n) {
//        String s = String.valueOf(n);
//        int[] freq = new int[10]; // Only need for digits 0–9
//
//        for (int i = 0; i < s.length(); i++) {
//            freq[s.charAt(i) - '0']++;
//        }
//
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < 10; i++) {
//            if (freq[i] > 0) {
//                sb.append(freq[i]);
//                sb.append(i);
//            }
//        }
//
//        return sb.toString();
//    }
//    public String Helper(int  i,int n,String ans){
//        if(i==n) return ans;
//        ans=count_freq(i);
//        return Helper(i+1,n,ans);
//    }
//    public String countAndSay(int n) {
//        String ans="";
//        if(n==1) return "1";
//        Helper(1,n,ans);
//        return ans;
//    }
//}
//
//
//class Solution {
//    // lets do some optimization;
//    public int findMin(int[] arr){
//        int min=Integer.MIN_VALUE;
//        for(int i=0; i< arr.length; i++){
//            if(arr[i]>min) min=arr[i];
//        }
//        return min;
//    }
//    public int lower_bound(int[] arr,int start,int range){
//        int end=arr.length;
//        while(start<end){
//            int mid=(end+start)>>1;
//            if(arr[mid]>=range){
//                end=mid;
//            } else start=mid+1;
//        }
//        return start;
//    }
//    public long countFairPairs(int[] arr, int lower, int upper) {
//        int n=arr.length;
//        long count=0;
//        int min=findMin(arr);
//        if(min>upper) return 0;
//        Arrays.sort(arr);
//        for(int i=0; i<n; i++){
//            int left = lower_bound(arr, i+1,  lower - arr[i]);
//            int right = lower_bound(arr, i+1,  upper - arr[i]+1);
//            count+=(right-left);
//        }
//        return count;
//    }
//}


//class Solution {
//    public boolean isPalindrome(String s){
//        if(s.length()==0 || s.length()==1) {
//            return true;
//        }
//        int n=s.length();
//        int start=0;
//        int end=s.length()-1;
//        while(start<end){
//            if(s.charAt(start)!=s.charAt(end)){
//                return false;
//            } else {
//                end--;
//                start++;
//            }
//        }
//        return true;
//    }
//    public void helper(String s,List<String> list,List<List<String>> ans){
//        if(s.length()==0){
//            ans.add(list);
//        }
//        for(int i=0; i<s.length(); i++){
//            String part=s.substring(0,i+1);
//            if(isPalindrome(part)){
//                list.add(part);
//                helper(s.substring(i+1),list,ans);
//                list.remove(list.size()-1);
//            }
//
//        }
//
//    }
//    public List<List<String>> partition(String s) {
//        List<List<String>> ans=new ArrayList<>();
//        helper(s,new ArrayList<>(),ans);
//        return ans;
//
//
//    }
//}

//class Solution {
//    public int digitSum(int n){
//        int count=0;
//        while(n>0){
//            count+=n%10;
//            n/=10;
//        }
//        return count;
//    }
//    public int countLargestGroup(int n) {
//        Map<Integer,Integer> map=new HashMap<>();
//        int count=0,maxSize=0;
//        for(int i=1; i<=n; i++){
//            int countD=digitSum(i);
//            map.put(countD,map.getOrDefault(countD,0)+1);
//            int freq=map.get(countD);
//            if(freq==maxSize) count++;
//            else {
//                maxSize++;
//                count=1;
//            }
//
//        }
//        return count;
//    }
//}
//


//class Solution {
//    public int countCompleteSubarrays(int[] arr) {
//        int n = arr.length;
//        int count = 0;
//        Set<Integer> s=new HashSet<>();
//        for(int x:arr) s.add(x);
//        int d=s.size();
//        for (int i = 0; i < n; i++) {
//            Set<Integer> set = new HashSet<>();
//            for (int j = i; j < n; j++) {
//                set.add(arr[j]);
//                if (d == set.size()){
//                    count += n - j;
//                    break;
//                }
//            }
//        }
//        return count;
//    }
//
//}
// same code with optimized way.
//class Solution {
//    public int countCompleteSubarrays(int[] arr) {
//        int n=arr.length;
//        int count=0;
//        Set<Integer> s=new HashSet<>();
//        for(int x:arr) s.add(x);
//       int d=s.size();
//        int left=0,right=0;
//        Map<Integer,Integer> map=new HashMap<>();
//        while(right<n){
//            map.put(arr[right], map.getOrDefault(arr[right],0)+1);
//            while(map.size()==d){
//                count+=n-right;
//                map.put(arr[left],map.get(arr[left])-1);
//                if(map.get(arr[left])==0){
//                    map.remove(arr[left]);
//                }
//                left++;
//            }
//            right++;
//        }
//        return count;
//    }
//}

//import java.util.*;
//class Solution {
//    public List<Integer> eventualSafeNodes(int[][] graph) {
//        // doing the same code with the Topological Sorting.
//
//        int n=graph.length;
//        List<List<Integer>> adjList=new ArrayList<>();
//        int[] indegree=new int[n];
//        List<Integer> list=new ArrayList<>();
//        for(int i=0; i<n; i++){
//            adjList.add(new ArrayList<>());
//        }
//        for(int i=0; i<n; i++){
//            for(int v:graph[i]){
//                // reversing the edge.. from i->v to v->i.
//                adjList.get(v).add(i);
//                indegree[i]++;
//            }
//        }
//        Queue<Integer> safe=new LinkedList<>();
//        for(int i=0; i<n; i++){
//            if (indegree[i]==0) {
//                safe.add(i);
//            }
//        }
//        while(!safe.isEmpty()){
//            int q=safe.peek();
//            safe.remove();
//            list.add(q);
//            for(int neighbour:adjList.get(q)){
//                indegree[neighbour]--;
//                if(indegree[neighbour]==0) safe.add(neighbour);
//            }
//
//        }
//        return list;
//
//    }
//}

//class Solution {
//    int Time=0;
//    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
//        Map<Integer,List<Integer>> adjList=new HashMap<>();
//        for(int i=0; i< manager.length; i++){
//            int emp_i=i;
//            int manager_i=manager[i];
//            if(manager_i!=-1) {
//                adjList.putIfAbsent(manager_i, new ArrayList<>());
//                adjList.get(manager_i).add(emp_i);
//            }
//        }
//        DFS(adjList,headID,manager,informTime,0);
//        return Time;
//    }
//
//    private void DFS(Map<Integer, List<Integer>> adjList, int headID, int[] manager, int[] informTime, int currTime) {
//        Time=Math.max(currTime,Time);
//        if (!adjList.containsKey(headID)) return;
//        for(int node:adjList.keySet()){
//            DFS(adjList, node, manager, informTime, currTime+informTime[headID]);
//        }
//    }
//}

