package HackerRank;

import java.util.Scanner;

public class Lisa_Workbook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, k;
        n = sc.nextInt();
        k = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int result = 0;
        int page = 1;
        for (int i = 0; i < arr.length; i++) {
            int problems = arr[i];
            for (int problem = 1; problem <= problems; problem++) {

                if (problem == page) {
                    result++;
                }
                if ((problem % k == 0) || problem == problems) {
                    page++;
                }
            }
        }
        System.out.println(result);
    }
}
