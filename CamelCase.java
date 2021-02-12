package HackerRank;

import java.util.Scanner;

public class CamelCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char ch[]=s.toCharArray();
        int count=0;
        if (Character.isLowerCase(ch[0])){
            count=1;
        }
        for (int i=1;i<s.length();i++){
            if (Character.isUpperCase(ch[i])){
                count++;
            }
        }
        System.out.println(count);
    }
}
