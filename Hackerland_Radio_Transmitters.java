package HackerRank;

import java.util.Arrays;
import java.util.Scanner;

public class Hackerland_Radio_Transmitters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int count = 0,val=arr[0];
        for (int i = 1; i < n; i++) {
            if (val-arr[i-1]>=k){
                count++;
                val=arr[i];
            }
        }
    }
}
