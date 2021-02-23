package HackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Alternating_Characters {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<String> l=new ArrayList();
        for (int i=0;i<n;i++){
            l.add(sc.next());
        }
        for (int i=0;i<n;i++){
            String s=l.get(i);
            int count=0;
            for (int m=0;m<s.length()-1;m++){
                if (s.charAt(m)==s.charAt(m+1)){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
