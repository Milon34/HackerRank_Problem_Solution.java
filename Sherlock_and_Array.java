package HackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sherlock_and_Array {
    private static String sol(List<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        }
        int left = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (left == (sum - left - arr.get(i))) {
                return "YES";
            }
            left += arr.get(i);
        }
        return "NO";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            List<Integer> l=new ArrayList<>();
            for (int i = 0; i < n; i++) {
                l.add(sc.nextInt());
            }
            System.out.println(sol(l));

        }
    }
}
