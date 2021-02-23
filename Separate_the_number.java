package HackerRank;

import java.util.Scanner;

public class Separate_the_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int m = 0; m < q; m++) {
            String s = in.next();
            boolean valid = false;
            long firstx = -1;
            for (int i=1; i<=s.length()/2; ++i) {
                long x = Long.parseLong(s.substring(0,i));
                firstx = x;
                String test = Long.toString(x);
                while (test.length() < s.length()) {
                    test += Long.toString(++x);
                }
                if (test.equals(s)) {
                    valid = true;
                    break;
                }
            }
            if (valid){
                System.out.println("YES "+firstx);
            }else {
                System.out.println("NO");
            }
        }
    }
}
