package HackerRank;

import java.util.Scanner;

public class Angry_Professor {
    public static void main(String[] args) {
        //1 2 3 4
        //0 1 2 3
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- >0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int arr[]=new int[n];
            for (int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int count=0;
            for (int i=0;i<arr.length;i++){
                if (arr[i]<=0){
                    count++;
                }
            }
            if (count<k){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}
