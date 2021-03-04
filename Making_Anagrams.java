package HackerRank;

import java.util.Scanner;

public class Making_Anagrams {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        char ch1[]=new char[26];
        char ch2[]=new char[26];
        for(int i=0;i<s1.length();i++){
            ch1[s1.charAt(i)-97]++;
        }
        for(int i=0;i<s2.length();i++){
            ch2[s2.charAt(i)-97]++;
        }
        int count=0;
        for(int i=0;i<26;i++){
            count+=Math.abs(ch1[i]-ch2[i]);
        }
        System.out.println(count);
    }
}
