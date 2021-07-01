package HackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Maximizing_XOR {
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
        int l, r;
        l = sc.nextInt();
        r = sc.nextInt();
        List<Integer> per = new ArrayList<>();
        for (int i = l; i <= r; i++) {
            for (int j = i + 1; j <= r; j++) {
                per.add(i ^ j);
            }
        }
        if (Collections.max(per) > 0) {
            System.out.println(Collections.max(per));
        } else
            System.out.println(0);
    }
}
