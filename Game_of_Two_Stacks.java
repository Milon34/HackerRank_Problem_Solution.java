package HackerRank;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;


public class Game_of_Two_Stacks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n, m;
            n = sc.nextInt();
            m = sc.nextInt();
            int k = sc.nextInt();
            LinkedList<Integer> st1 = new LinkedList<>();
            LinkedList<Integer> st2 = new LinkedList<>();
            for (int i = 0; i < n; i++) {
                st1.add(sc.nextInt());
            }
            for (int i = 0; i < m; i++) {
                st2.add(sc.nextInt());
            }
            Collections.sort(st1);
            Collections.sort(st2);
            int sum = 0;
            int count=0;
            for (int i=0;i<Math.min(st1.size(),st2.size());i++){
                sum+=Math.min(st1.get(i),st2.get(i));
                if (sum>k){
                    break;
                }
                count++;
            }
            System.out.println(count);

        }
    }
}
