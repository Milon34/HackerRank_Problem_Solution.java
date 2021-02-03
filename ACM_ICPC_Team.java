package HackerRank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ACM_ICPC_Team {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n;
        m = sc.nextInt();
        n = sc.nextInt();
        String s[] = new String[m];
        for (int i = 0; i < m; i++) {
            s[i] = sc.next();
        }
        List<Integer> l = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            for (int j = i + 1; j < m; j++) {
                char ch1[] = s[i].toCharArray();
                char ch2[] = s[j].toCharArray();
                int count = 0;
                for (int k = 0; k < ch1.length; k++) {
                    if (ch1[k] == '1' || ch2[k] == '1') {
                        count++;
                    }
                }
                l.add(count);
            }
        }
       int value= Collections.max(l);
        int dupCount=0;
        for (int i=0;i<l.size();i++){
            if (l.get(i)==value){
                dupCount++;
            }
        }
        System.out.println(value);
        System.out.println(dupCount);
    }
}
