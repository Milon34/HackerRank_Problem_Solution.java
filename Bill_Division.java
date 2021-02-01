package HackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bill_Division {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,k;
        n=sc.nextInt();
        k=sc.nextInt();
        List<Integer> l=new ArrayList<>();
        for (int i=0;i<n;i++){
            l.add(sc.nextInt());
        }
        int s=sc.nextInt();
        l.remove(l.get(k));
        int sum=0;
        for (int i=0;i<l.size();i++){
            sum+=l.get(i);
        }
        int val=sum/2;
        //System.out.println("va"+val);
        if (val!=s) {
            System.out.println(Math.abs(val - s));
        }else {
            System.out.println("Bon Appetit");
        }
    }
}
