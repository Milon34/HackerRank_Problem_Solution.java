package HackerRank;

import java.util.Scanner;

public class Counting_Valleys {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        char ch[]=s.toCharArray();
        int count=0,m=0;
        for (int i=0;i<s.length();i++){
            if (ch[i]=='U'){
                count++;
            }
            if (ch[i]=='D'){
                count--;
            }
            if (count==0&&ch[i]=='U'){
                m++;
            }
        }
        System.out.println(m);
    }
}
