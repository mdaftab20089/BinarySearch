//import java.util.*;
//
//public class GCD {
//
//    public static void HelperFun(int[] a,int[] b, int[] dif,int n) {
//        long def = 0, total = 0;
//        for (int i = 0; i < n; i++) {
//            dif[i] = b[i] - a[i];
//            if (dif[i] > 0) {
//                def += dif[i];
//            } else {
//                total += dif[i];
//            }
//        }
//
//        boolean ok = true;
//        for (int i = 0; i < n; i++) {
//            if (dif[i] > 0) {
//                if (a[i] - def + 2 * dif[i] < b[i]) {
//                    ok = false;
//                } else if (a[i] >= b[i]) {
//                    ok &= true;
//                }
//            } else {
//                if (a[i] - def < b[i]) {
//                    ok = false;
//                } else if (a[i] >= b[i]) {
//                    ok &= true;
//                }
//            }
//        }
//
//        System.out.println(ok ? "YES" : "NO");
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//
//        while (t-- > 0) {
//            int n = sc.nextInt();
//            int arr[]=new int[n];
//            int brr[]=new int[n];
//            for(int i=0; i<n; i++){
//                arr[i]=sc.nextInt();
//            }
//            for(int i=0; i<n; i++){
//                brr[i]=sc.nextInt();
//            }
//
//
//            int[] diff=new int[n];
//            for(int i=0; i<n; i++){
//                diff[i]=arr[i]-brr[i];
//            }
//            System.out.println(Integer.toBinaryString(10));
//
//        }
//
//        sc.close();
//    }
//}


//import java.util.*;
//
//class CodeChef {
//    public static List<Integer> HelperFun(int n, int m, List<Integer> a, List<Integer> b) {
//        int mp = 0;
//        for (int i = 1; i < m; i++) {
//            if (b.get(i) < b.get(mp)) {
//                mp = i;
//            }
//        }
//
//        List<Integer> best = new ArrayList<>(a);
//
//        for (int i = 0; i <= n - m; i++) {
//            boolean improve = false;
//
//            for (int j = 0; j < m; j++) {
//                if (best.get(i + j) < b.get((j + mp) % m)) break;
//                if (best.get(i + j) > b.get((j + mp) % m)) {
//                    improve = true;
//                    break;
//                }
//            }
//
//            if (improve) {
//                for (int j = 0; j < m; j++) {
//                    best.set(i + j, b.get((j + mp) % m));
//                }
//            }
//        }
//
//        return best;
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int T = scanner.nextInt();
//        while (T-- > 0) {
//            int Nana = scanner.nextInt();
//            int Mama = scanner.nextInt();
//
//            List<Integer> A = new ArrayList<>();
//            List<Integer> B = new ArrayList<>();
//
//            for (int i = 0; i < Nana; i++) {
//                A.add(scanner.nextInt());
//            }
//            for (int i = 0; i < Mama; i++) {
//                B.add(scanner.nextInt());
//            }
//
//            List<Integer> result = HelperFun(Nana, Mama, A, B);
//            for (int num : result) {
//                System.out.print(num + " ");
//            }
//            System.out.println();
//        }
//        scanner.close();
//    }
//}

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {

    static int Helper(int n, int k) {
        if (k <= 0) return 1;

        int low = 1;
        int high = n;
        int ans = n;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (mid == 0) {
                low = 1;
                continue;
            }
            int val = mid * (mid - 1);
            if (val >= k) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    static void SolveMinSPT(BufferedReader br) throws IOException {
        String[] line = br.readLine().split(" ");
        int n = Integer.parseInt(line[0]);
        int m = Integer.parseInt(line[1]);

        if (n <= 1) {
            System.out.println(0);
            return;
        }

        int tot = n * (n - 1) / 2;
        int v = tot - m;
        int t_w = n - 1 - v;
        int w_min = Math.max(0, t_w);

        int k = 2 * v;
        int k_min = Helper(n, k);
        int w_max = n - k_min;

        int sum_w = 0;
        int n_term = w_max - w_min + 1;
        if (n_term > 0) {
            sum_w = (w_min + w_max) * n_term / 2;
        }
        System.out.println(sum_w);
    }

    public static void main (String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            SolveMinSPT(br);
        }
    }
}
