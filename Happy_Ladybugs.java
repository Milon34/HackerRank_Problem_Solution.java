package HackerRank;

import java.util.Arrays;
import java.util.Scanner;

public class Happy_Ladybugs {
    public static boolean isHappy(String s) {
        if (hasUnique(s)) {
            return false;
        }
        if (alreadyHappy(s)) {
            return true;
        }
        if (hasSpace(s)) {
            return true;
        }
        return false;
    }
    public static boolean hasUnique(String s) {
        int[] ascii = new int[26];
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '_') {
                ascii[(int) s.charAt(i) - 65]++;
            }
        }
        for (int i = 0; i < 26; i++) {
            if (ascii[i] == 1) {
                return true;
            }
        }
        return false;
    }
    public static boolean alreadyHappy(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            if (i == 0 && s.charAt(i) != s.charAt(i + 1)) {
                return false;
            } else if (s.charAt(i) != s.charAt(i + 1) && s.charAt(i) != s.charAt(i - 1)) {
                return false;
            }
        }
        return true;
    }
    public static boolean hasSpace(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '_') {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            if (isHappy(s)){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}
