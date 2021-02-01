package HackerRank;

import java.util.Arrays;
import java.util.Scanner;

public class The_Hurdle_Race {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,k;
        n=sc.nextInt();
        k=sc.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int value=arr[arr.length-1];
        if (k>value){
            System.out.println(0);
        }else {
            System.out.println(value-k);
        }
    }
}
