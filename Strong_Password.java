package HackerRank;

import java.util.Scanner;

public class Strong_Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        char ch[] = s.toCharArray();
        int isDigit = 0, isUpper = 0, isLower = 0, isSpecial = 0;
            for (int i = 0; i < s.length(); i++) {
                if (Character.isLowerCase(ch[i])) {
                    isLower++;
                } else if (Character.isDigit(ch[i])) {
                    isDigit++;
                } else if (Character.isUpperCase(ch[i])) {
                    isUpper++;
                } else {
                    isSpecial++;
                }
            }
             //System.out.println(isDigit+" "+isUpper+" "+isLower+" "+isSpecial);
            int count = 0;
            if (isLower == 0) {
                count = count + 1;
            }
            if (isDigit == 0) {
                count = count + 1;
            }
            if (isUpper == 0) {
                count = count + 1;
            }
            if (isSpecial == 0) {
                count = count + 1;
            }
            System.out.println(Math.max(count,6-n));
        }
    }

