package HackerRank;

import java.util.*;

public class Super_Reduced_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i-1)) {
                s = s.substring(0, i-1) + s.substring(i+1);
                System.out.println(s);
                i = 0;
            }
        }
        if (s.length()==0){
            System.out.println("Empty String");
        }else {
            System.out.println(s);
        }
    }
}
