package HackerRank;

import java.math.BigInteger;
import java.util.Scanner;

public class Find_Digits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- >0){
            int n=sc.nextInt();
            String s= String.valueOf(n);
            char ch[]=s.toCharArray();
            int count=0;
            for (int i=0;i<s.length();i++){
                int value=ch[i]-48;
                try{
                    if (n%value==0){
                        count++;
                    }
                }catch (Exception e){
                }
            }
            System.out.println(count);
        }
    }
}
