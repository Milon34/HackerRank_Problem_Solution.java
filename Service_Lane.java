package HackerRank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Service_Lane {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, t;
        n = sc.nextInt();
        t = sc.nextInt();
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            l.add(sc.nextInt());
        }
       // System.out.println(l);
        int a, b;
        for (int i = 0; i < t; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            List<Integer> sub = new ArrayList<>();
            for (int j = a; j <= b; j++) {
                sub.add(l.get(j));
            }
           // System.out.println("test"+a+" "+b);
            System.out.println(Collections.min(sub));
        }

    }
}
/*
8 5
2 3 1 2 3 2 3 3
0 3
4 6
6 7
3 5
0 7
*/
