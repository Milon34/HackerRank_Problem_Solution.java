package HackerRank;

import java.util.Scanner;

public class Caesar_Cipher {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        int k=sc.nextInt();
        String myS="abcdefghijklmnopqrstuvwxyz";
        String myC="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String res="";
        for (int i=0;i<s.length();i++){
            if (Character.isLowerCase(s.charAt(i))){
                int val=(char)((s.charAt(i)-97)+k)%26;
                res+=myS.charAt(val);
            }else if (Character.isUpperCase(s.charAt(i))){
                int val=(char)((s.charAt(i)-65)+k)%26;
                res+=myC.charAt(val);
            }else {
                res+=s.charAt(i);
            }
        }
        System.out.println(res);
    }
}
