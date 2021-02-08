package HackerRank;

import java.util.Arrays;
import java.util.Scanner;

public class Cavity_Map {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i, j;
        n = sc.nextInt();
        int a[][] = new int[n][n];
        String s[] = new String[n];
        for (i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        //System.out.println(Arrays.toString(s));
        for (i = 0; i < n; i++) {
            String sm = s[i];
            for (j = 0; j < n; j++) {
                char ch[] = sm.toCharArray();
                a[i][j] = ch[j]-48;
            }
        }
        //System.out.println(Arrays.toString(a));
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if ((i >= 1) && (i < n - 1) && (j >= 1) && (j < n - 1)) {
                    if ((a[i][j] > a[i - 1][j]) && (a[i][j] > a[i][j + 1]) && (a[i][j] > a[i + 1][j]) && (a[i][j] > a[i][j - 1]))
                        System.out.print("X");
                    else
                        System.out.print(a[i][j]);
                } else
                    System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
}
