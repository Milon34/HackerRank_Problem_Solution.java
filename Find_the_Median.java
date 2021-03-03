package HackerRank;

import java.util.Arrays;
import java.util.Scanner;

public class Find_the_Median {
    public static void setMax(int []arr,int n){
        int myArra[]=new int[n+1];
        Arrays.fill(myArra,0);
        int max=myArra[0];
        for (int i=0;i<arr.length;i++){
            if (arr[i]<max){

            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int value=arr.length-1;
        System.out.println(arr[value/2]);
//        int a=arr[0];
//        int b=arr[arr.length-1];


    }
}
