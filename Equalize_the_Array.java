package HackerRank;

import java.util.Scanner;

public class Equalize_the_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[101];
        for (int i=0;i<n;i++){
            arr[sc.nextInt()]++;
        }
        int sum=0;
        for (int i=0;i<=100;i++){
           sum=Math.max(sum,arr[i]);
        }
//        int min = 0;
//        System.out.println(sum);
//        for (int i=0;i<=100;i++){
//            if (arr[i]<sum){
//                min+=arr[i];
//            }
//            if (sum==1){
//                System.out.println(n-1);
//                return;
//            }
//        }
        System.out.println(n-sum);
    }
}
