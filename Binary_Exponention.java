//import java.util.Scanner;
//
//public class Binary_Exponention {
//    public static long Exponent(long a,long b) {
//        if(b==0) return 1;
//        if(b%2!=0) return a*Exponent(a,b/2)*Exponent(a,b/2);
//        return Exponent(a,b/2)*Exponent(a,b/2);
//    }
//    public static void solver(Scanner sc){
//        int a=sc.nextInt();
//        int b=sc.nextInt();
//        System.out.println(Exponent(a,b));
//    }
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        solver(sc);
//    }
//}


//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) throws java.lang.Exception {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//
//        while (t-- > 0) {
//            int n = sc.nextInt();
//            List<Integer> list=new ArrayList<>();
//            int size=2*n+1;
//            int[][] arr=new int[n+1][n+1];
//            for(int i=1; i<=n; i++){
//                for(int j=1; j<=n; j++){
//                    arr[i][j]=sc.nextInt();
//                }
//            }
//            int curr=0;
//            for(int i=1; i<=n; i++){
//                list.add(arr[1][i]);
//                curr+=arr[1][i];
//            }
//            for(int i=2; i<=n; i++){
//                list.add(arr[i][n]);
//                curr+=arr[i][n];
//            }
//            int sum=(n*(2*n+1));
//            list.add(0, sum-curr);
//            for(int x:list){
//                System.out.print(x+" ");
//            }
//            System.out.println();
//
//        }
//
//        sc.close();
//    }
//}


//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) throws java.lang.Exception {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//
//        while (t-- > 0) {
//            String maar=sc.next();
//            String awaj=sc.next();
//            int n=maar.length();
//            int m=awaj.length();
//            if(m==0 || n==0 || maar.charAt(0)!=awaj.charAt(0)) {
//                System.out.println("NO");
//                continue;
//            }
//            int i=0,j=0;
//            while (i<n || j<m){
//                int a=i;
//                int b=j;
//                while(i<n || maar.charAt(i)==maar.charAt(a)){
//                    i++;
//                }
//                while(j<m || awaj.charAt(i)==awaj.charAt(b)){
//                    j++;
//                }
//                int lenP=i-a;
//                int lenS=j-b;
//                if(lenP>lenS || lenS>2*lenP) {
//                    System.out.println("No");
//                    break;
//                }
//            }
//
//
//        }
//
//        sc.close();
//    }
//}


//import java.util.Scanner;
//
//public class Main {
//    public static void helepr(Scanner sc){
//        int n=sc.nextInt();
//        int[] arr=new int[n];
//        for(int i=0; i<n; i++){
//            arr[i]=sc.nextInt();
//        }
//        int[] count=new int[30];
//        for(int i=0; i<n; i++){
//            for(int j=0; j<30; j++){
//                if((arr[i]&(i<<j))!=0) count[j]++;
//            }
//        }
//        long ans=0;
//        for(int i=0; i<n; i++){
//            long sum=0;
//            for(int j=0; j<30; j++){
//                if((arr[i]&(i<<j))!=0) {
//                    sum+=(long)(n-count[j])<<j;
//                } else {
//                    sum+=(long)(count[j])<<j;
//                }
//            }
//            ans=Math.max(sum,ans);
//        }
//
//        System.out.println(ans);
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//
//        while (t-- > 0) {
//            helepr(sc);
//            int num=20;
//            int a=Integer.bitCount(num);
//        }
//
//        sc.close();
//    }
//}
