package HackerRank;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class Manasa_Stones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n, a, b;
            n = sc.nextInt();
            a = sc.nextInt();
            b = sc.nextInt();
            Vector<Integer> arr = new Vector<>();
            if (a == b) {
                arr.add((n - 1) * a);
            } else {
                for (int i = 1; i <= n; i++) {
                    arr.add(((n - i) * a) + ((i - 1) * b));
                }
            }
            Collections.sort(arr);
            for (int i = 0; i < arr.size(); i++) {
                System.out.print(arr.get(i) + " ");
            }
            System.out.println();

        }

    }
}

