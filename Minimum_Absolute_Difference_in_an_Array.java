package HackerRank;

import java.util.Arrays;
import java.util.Scanner;

public class Minimum_Absolute_Difference_in_an_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long[] arr=new long[(int) n];
        for (long i=0;i<n;i++){
            arr[(int) i]=sc.nextLong();
        }
        Arrays.sort(arr);
        long min=Long.MAX_VALUE;
        for (long i=0;i<n-1;i++){
            long diff=arr[(int) (i+1)]-arr[(int) i];
            if (diff<min){
                min=diff;
            }
            if (min==0){
                System.out.println(0);
                return;
            }
        }
        System.out.println(min);
    }
}
