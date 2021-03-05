package HackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Sorted_Sum {
    public static long solve(long[] a) {
        long count = 0, n = a.length, sum =0;
//        long myArr[]=new long[a.length];
//        for (int i=0;i<a.length;i++){
//            long val=a.elementAt(i);
//            myArr[i]=val;
//        }
        for (long i = 0; i < n; i++) {
            Arrays.sort(a,0, (int) (count+1));
           // Arrays.sort(myArr);
            count++;
            for (long j = 0; j < count; j++)
                sum+=a[(int) (j)]*(j+1);
                //sum += a.elementAt((int) j) * (j + 1);
        }
        return sum%10000000007L;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       long arr[]=new long[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextLong();
        }
        System.out.println((int) solve(arr));

    }
    static class RealScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        String next() {
            while (!st.hasMoreTokens())
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        int[] readArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = nextInt();
            return a;
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }
}

class te {
    public static boolean check(long x) {
        return x != 0 && ((x & (x - 1)) == 0);
    }

    public static Long count(long arr[], long n) {
        long cnt = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (check(arr[i] & arr[j]))
                    cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        RealScanner sc = new RealScanner();
        long n = sc.nextLong();
        long arr[] = new long[(int) n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }
        System.out.print(count(arr, n));
    }

    static class RealScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        String next() {
            while (!st.hasMoreTokens())
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        int[] readArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = nextInt();
            return a;
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }
}
class tes{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long arr[]=new long[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextLong();
        }
        long sum=0;
        for (int i=0;i<n;i++){
            sum+=arr[i]*(i+1)*(n-i);
        }
        System.out.println(sum);
    }
}