package HackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Jumping_on_the_Clouds2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer> l=new ArrayList<>();
        for (int i=0;i<n;i++){
            l.add(sc.nextInt());
        }
        int count = -1;
        for (int i = 0; i < n; i++, count++) {
            if (i<n-2 && l.get(i+2)==0) {
                i++;
            }
        }
        System.out.println(count);
    }
}
