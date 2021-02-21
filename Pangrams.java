package HackerRank;

import java.util.Arrays;
import java.util.Scanner;

public class Pangrams {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int arr[]=new int[26];
        for (int i=0;i<s.length();i++){
            if (Character.isUpperCase(s.charAt(i))) {
                arr[s.charAt(i) - 65]++;
            }
            if (Character.isLowerCase(s.charAt(i))){
                arr[s.charAt(i)-97]++;
            }
        }
        for (int i=0;i<arr.length;i++){
            if (arr[i]==0){
                System.out.println("not pangram");
                return;
            }
        }
        System.out.println("pangram");
    }
}
