package HackerRank;

import java.util.Scanner;

public class Cats_and_a_Mouse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=0;i<n;i++){
            int a,b,x;
            a=sc.nextInt();
            b=sc.nextInt();
            x=sc.nextInt();
            int value1=Math.abs(x-a);
            int value2=Math.abs(x-b);
            if (value1==value2){
                System.out.println("Mouse C");
            }else if (value1>value2){
                System.out.println("Cat B");
            }else{
                System.out.println("Cat A");
            }
        }
    }
}
