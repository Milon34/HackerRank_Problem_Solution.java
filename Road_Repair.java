package HackerRank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Road_Repair {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n1=sc.nextLong();
        List<Long> l=new ArrayList<>();
        for (long i=0;i<n1;i++){
            l.add(sc.nextLong());
        }

        long n2=sc.nextLong();
        List<Integer> l2=new ArrayList<>();
        for (int i=0;i<n2;i++){
            l2.add(sc.nextInt());
        }
        //System.out.println(l2);
        Collections.sort(l);
        Collections.sort(l2);
        long sum=0;
        for (long i=0;i<l.size();i++){
           sum+=Math.abs(l2.get((int) i)-l.get((int) i));
        }
        System.out.println(Math.abs(sum));
    }
}
