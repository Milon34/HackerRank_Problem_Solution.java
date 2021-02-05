package HackerRank;

import java.util.*;

public class Minimum_Distances {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            l.add(arr[i]);
        }
        int length = Collections.max(l);
        int arrIn[] = new int[length + 1];
        for (int i = 0; i < n; i++) {
            arrIn[arr[i]]++;
        }
        int min = Integer.MAX_VALUE;
        int flag = 0;
        for (int i = 0; i < arrIn.length; i++) {
            if (arrIn[i] == 2) {
                flag++;
                int value = i;
                int idx = 0;
                //System.out.println("ch:" + value);
                for (int j = 0; j < n; j++) {
                    if (value == arr[j]) {
                        idx = Math.abs(idx - j);
                        //min=Math.min(idx,min);
                    }
                }
                min = Math.min(idx, min);
//                System.out.println(idx);
            }
        }
        if (flag == 0) {
            System.out.println(-1);
        } else {
            System.out.println(min);
        }
    }
}
