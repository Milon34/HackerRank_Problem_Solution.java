package HackerRank;

import java.util.Scanner;

public class Beautiful_Binary_String {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        String s=sc.next();
        System.out.println((s.length() - s.replaceAll("010", "").length())/3);
    }
}
