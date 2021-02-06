package HackerRank;

import java.util.Scanner;

public class Chocolate_Feast {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- >0){
            int n,c,m;
            n=sc.nextInt();
            c=sc.nextInt();
            m=sc.nextInt();
            int choco=n/c,eat=0,wp=0;
            while(choco>0){
                eat+=choco;
                wp+=choco;
                choco=wp/m;
                wp=wp%m;
            }
            System.out.println(eat);
        }
    }
}
