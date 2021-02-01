package HackerRank;

import java.util.Scanner;

public class Jumping_on_the_Clouds {
    public  static  final int VAL=100;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,k;
        n=sc.nextInt();
        k=sc.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int v=VAL;

        for (int i=0;i<Integer.MAX_VALUE;i+=k){
                if (arr[i%n] == 0) {
                    v = v - 1;
                } else {
                    v = v - 3;
                }
            if ((i+k)%n==0){
                break;
            }
        }
        System.out.println(v);
    }
}
