package HackerRank;

import java.util.Scanner;

public class Ice_Cream_Parlor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- >0){
            int k=sc.nextInt();
            int n=sc.nextInt();
            int arr[]=new int[n];
            for (int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            for (int i=0;i<n;i++){
                for (int j=i+1;j<n;j++){
                    if (arr[i]+arr[j]==k){
                        System.out.println((i+1)+" "+(j+1));
                        break;
                    }
                }
            }
        }
    }
}
