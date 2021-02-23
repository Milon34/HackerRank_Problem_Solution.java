package HackerRank;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Funny_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            List<Integer> l1 = new ArrayList<>();
            List<Integer> l2 = new ArrayList<>();
            String s = sc.next();
            StringBuffer sb=new StringBuffer(s);
            String s1= String.valueOf(sb.reverse());
            for (int j=0;j<s.length()-1;j++) {
                l1.add(Math.abs((s.charAt(j) - 97) - (s.charAt(j + 1) - 97)));
                l2.add(Math.abs((s1.charAt(j) - 97) - (s1.charAt(j + 1) - 97)));
            }
            //System.out.println(l1);
            //System.out.println(l2);
            if (l1.equals(l2)){
                System.out.println("Funny");
            }else {
                System.out.println("Not Funny");
            }
        }

    }
}
