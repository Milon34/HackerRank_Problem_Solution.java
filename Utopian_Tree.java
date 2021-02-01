package HackerRank;

import java.util.Arrays;
import java.util.Scanner;

public class Utopian_Tree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int arr[]=new int[61];
        arr[0]=1;
        for (int i=1;i<=60;i++){
            if (i%2==0){
                arr[i]=arr[i-1]+1;
            }else {
                arr[i]=2*arr[i-1];
            }
        }
        while (t-- >0) {
            int n = sc.nextInt();
           // System.out.println(Arrays.toString(arr));
            System.out.println(arr[n]);
        }
        }
    }

