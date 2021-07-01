package HackerRank;

import java.util.Scanner;

public class Balanced_Brackets {
    public static int s1(String s) {
        int leftCount = 0, rightCount = 0;
        int imbalance = 0, count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                leftCount++;
                if (imbalance > 0) {
                    count++;
                    imbalance--;
                }
            } else if (s.charAt(i) == ')') {
                rightCount++;
                imbalance = rightCount - leftCount;
            }
        }
        return count;
    }

    public static int s2(String s) {
        int leftCount = 0, rightCount = 0;
        int imbalance = 0, count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '{') {
                leftCount++;
                if (imbalance > 0) {
                    count++;
                    imbalance--;
                }
            } else if (s.charAt(i) == '}') {
                rightCount++;
                imbalance = rightCount - leftCount;
            }
        }
        return count;
    }

    public static int s3(String s) {
        int leftCount = 0, rightCount = 0;
        int imbalance = 0, count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '[') {
                leftCount++;
                if (imbalance > 0) {
                    count++;
                    imbalance--;
                }
            } else if (s.charAt(i) == ']') {
                rightCount++;
                imbalance = rightCount - leftCount;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            String s = sc.next();
            if (s.length() % 2 != 0) {
                System.out.println("NO");
                continue;
            }
            int per=-1;
            while (s.length()!=per) {
                per = s.length();
                s = s.replace("()", "");
                s = s.replace("{}", "");
                s = s.replace("[]", "");
            }
            if (s.length() == 0) {
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}
