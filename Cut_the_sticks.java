package HackerRank;

import java.util.*;

public class Cut_the_sticks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numSticks = sc.nextInt();
        int [] arr = new int[numSticks];
        for (int i = 0; i < numSticks; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(arr.length);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i-1]) {
                System.out.println(arr.length - i);
            }
        }

    }
}
