package HackerRank;

import java.util.Scanner;

public class Almost_Sorted {

    public static void swap(int[] d, int i, int j) {
        int tmp = d[i];
        d[i] = d[j];
        d[j] = tmp;
    }
    public static boolean isAsc(int[] d) {
        for (int i = 0; i < d.length - 1; ++i) {
            if (d[i] > d[i + 1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if (n < 2){
            System.out.println("yes");
        }
        int[] arr = new int[n];
        for (int i = 0; i < n;i++){
            arr[i] = s.nextInt();
        }

        if (isAsc(arr)) {
            System.out.println("yes");
            return;
        }
        int i, j;
        for (i = 0; i < n - 1 && arr[i] < arr[i + 1];i++){

        }
        for (j = n - 1; j > 0 && arr[j - 1] < arr[j]; --j){

        }
        // try swap
        //i==2
        //j==3
        //System.out.println(i);
        //System.out.println(j);
        swap(arr, i, j);
        if (isAsc(arr)) {
            System.out.println("yes\nswap " + (i + 1) + " " + (j + 1));
            return;
        }
        // try reverse (continue reversing inner pairs)
        int k = i + 1, l = j - 1;
        while (k < l) {
            swap(arr, k++, l--);
        }
        if (isAsc(arr)) {
            System.out.println("yes\nreverse " + (i + 1) + " " + (j + 1));
            return;
        }
        System.out.println("no");
    }
}

