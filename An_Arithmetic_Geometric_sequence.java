package HackerRank;

import java.util.Scanner;

public class An_Arithmetic_Geometric_sequence {
    static double sum(int a, int d, int n, float r) {
        double s = 0, x = 1;
        for (int k = 1; k <= n; k++) {
            s += (a - (d * k)) * x;
            x *= r;
        }
        return s;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int q, a, d, n;

        double x, X0, X1;
        double p, x0 = 1.001, x1 = 1.5;
        q = sc.nextInt();
        while (q-- > 0) {
            a = sc.nextInt();
            d = sc.nextInt();
            n = sc.nextInt();
            x = sc.nextInt();
            while ((x1 - x0) > 0.00000000000001) {
                X0 = (sum(a, d, n, (float) x0)) + x;

                X1 = (sum(a, d, n, (float) x1)) + x;

                p = x1 - (X1 * ((x1 - x0) / (X1 - X0)));
                x0 = x1;
                x1 = p;
            }
            q--;
        }
        System.out.printf("%.12f", x1);
    }
}
