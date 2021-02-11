package HackerRank;

import java.util.Scanner;

public class The_Grid_Search {
    static String gridSearch(String[] g, String[] p) {
        for (int i = 0; i <= (g.length - p.length); i++) {
            for (int j = 0; j <= (g[0].length() - p[0].length()); j++) {
                int a = i;
                int c = 0;
                if (g[i].substring(j, j + p[0].length()).equals(p[0])) {
                    c++;
                    for (int k = 1; k < p.length; k++) {
                        i++;
                        if (g[i].substring(j, j + p[0].length()).equals(p[k])) {
                            c++;
                        } else {
                            break;
                        }
                    }
                    if (c == p.length) {
                        return "YES";
                    }
                }
                i = a;
            }
        }
        return "NO";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n, k;
            n = sc.nextInt();
            k = sc.nextInt();
            String g[] = new String[n];
            for (int i = 0; i < n; i++) {
                g[i] = sc.next();
            }
            int m, s;
            m = sc.nextInt();
            s = sc.nextInt();
            String p[] = new String[m];
            for (int i = 0; i < m; i++) {
                p[i] = sc.next();
            }
            System.out.println(gridSearch(g, p));
        }
    }
}
