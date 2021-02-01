package HackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Viral_Advertising {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer> l=new ArrayList<>();
        l.add(5);
        int div= (int) Math.floor((double) 5/2);
        int value=5-div;
        for (int i=1;i<50;i++){
            int controlDiv= (int) Math.floor((double)l.get(i-1)/2);
            l.add(value*controlDiv);
        }
        for (int i=0;i<l.size();i++){
            l.set(i, (int) Math.floor((double)l.get(i)/2));
        }
        //System.out.println(l);
        //System.out.println(l.size());
        int sum=0;
        for (int i=0;i<n;i++){
            sum+=l.get(i);
        }
        System.out.println(sum);


    }
}
