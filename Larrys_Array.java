package HackerRank;

import java.util.Scanner;

public class Larrys_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for (int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            boolean check=true;
            for (int i=0;i<n;i++){
                for (int j=i+1;j<n;j++){
                    check^=arr[i]>arr[j];
                }
            }
            if (check){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}
