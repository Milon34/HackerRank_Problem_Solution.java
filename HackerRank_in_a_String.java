package HackerRank;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class HackerRank_in_a_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            String str = "hackerrank";
            if (s.length()<str.length()){
                System.out.println("NO");
            }else {
                int j=0;
                for (int i=0;i<s.length();i++){
                    if (j<str.length()&&s.charAt(i)==str.charAt(j)){
                        j++;
                    }
                }
                if (j==str.length()){
                    System.out.println("YES");
                }else {
                    System.out.println("NO");
                }
            }
        }
    }
}
