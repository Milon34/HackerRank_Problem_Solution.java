package HackerRank;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Append_and_Delete {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String t=sc.next();
        int k=sc.nextInt();
        List<Character> l1=new ArrayList<>();
        HashSet<Character> h1=new HashSet<>();
        for (int i=0;i<s.length();i++){
            l1.add(s.charAt(i));
            h1.add(s.charAt(i));
        }

        List<Character> l2=new ArrayList<>();
        HashSet<Character> h2=new HashSet<>();
        for (int i=0;i<t.length();i++){
            l2.add(t.charAt(i));
            h2.add(t.charAt(i));
        }
        if (h1.size()==1&&h2.size()==1){
            System.out.println("Yes");
            //return;
        }else {
            //System.out.println("No");

            String myS = "";
            //String fNonMAtch="";

            if (l1.size() >= l2.size()) {
                for (int i = 0; i < l2.size(); i++) {
                    if (l1.get(i) == l2.get(i)) {
                        myS += l1.get(i);
                    } else {
                        // fNonMAtch += l1.get(i);
                        break;
                    }
                }
            } else {
                for (int i = 0; i < l1.size(); i++) {
                    if (l1.get(i) == l2.get(i)) {
                        myS += l1.get(i);
                    } else {
                        // fNonMAtch += l1.get(i);
                        break;
                    }
                }
            }
            if (l2.size() > l1.size()) {
                System.out.println("No");
                return;
            }
            // System.out.println(myS);
            if ((s.length() - myS.length()) + (t.length() - myS.length()) <= k) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
       // System.out.println(myS);
    }
}
