package HackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Missing_Numbers {
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

    public static void main(String[] args) {
        RealScanner sc = new RealScanner();
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        List<Integer> l=new ArrayList<>();
        for (int i = 0; i < m; i++) {
            l.add(sc.nextInt());
        }
       for (int i=0;i<arr1.length;i++){
           int idx=l.lastIndexOf(arr1[i]);
           l.remove(idx);
       }
       Collections.sort(l);
       LinkedHashSet<Integer> h=new LinkedHashSet<>();
       for (int i=0;i<l.size();i++){
           h.add(l.get(i));
       }
        for (int i:h){
            System.out.print(i+" ");
        }
    }
}