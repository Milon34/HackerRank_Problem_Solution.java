package HackerRank;

import java.util.Scanner;

public class Palindrome_Index {
    static int palindromeIndex(String s) {
        int l = s.length();
        int i, j, a, b;
        for (i = 0, j = l - 1; i < l; i++, j--) {
            if (s.charAt(i) != s.charAt(j))
                break;
        }
        if (i > j){
            return -1;
        }

        for (a = i + 1, b = j; a < j && b > i + 1; a++, b--) {
            if (s.charAt(a) != s.charAt(b)) {
                return j;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            String s = sc.next();
            System.out.println(palindromeIndex(s));
//            int idx = 0;
//            int m = 0;
//            boolean check = false;
//            int count = 0;
//            for (int i = 1; i <= s.length(); i++) {
//                String sub = s.substring(m, i);
//                StringBuffer sb = new StringBuffer(sub);
//                String myS = String.valueOf(sb.reverse());
//                char ch = sub.charAt(sub.length() - 1);
//                if (sub.length() > 1) {
//                    if (myS.equals(sub)) {
//                        check = true;
//                        count++;
//                    } else {
//                        check = false;
//                        for (int k = 0; k < sub.length(); k++) {
//                            if (sub.charAt(k) == ch) {
//                                System.out.println(k + 1);
//                                break;
//                            }
//                        }
//                        //idx = i - count;
//                        break;
//                    }
//                }
//            }
//            if (check) {
//                System.out.println(-1);
//            } else {
//                System.out.println(idx);
//            }
        }
    }
}

