package HackerRank;

import java.util.Arrays;
import java.util.Scanner;

public class Closest_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int d = a[1] - a[0], id = 0;
        for (int i = 1; i < n; i++) {
            if (d > Math.abs(a[i] - a[i - 1])) {
                d = Math.abs(a[i] - a[i - 1]);
                id = i - 1;
            }
        }
        for (int i = id; i < n - 1; i++) {
            if (d == Math.abs(a[i] - a[i + 1])) {
                System.out.print(a[i] + " " + a[i + 1]+" ");
            }
        }
    }
}
