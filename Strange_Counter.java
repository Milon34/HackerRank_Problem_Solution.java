package HackerRank;

import java.util.ArrayList;
import java.util.Scanner;

public class Strange_Counter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long t=sc.nextLong();
        long rem=3;
        while (t > rem) {
            t = t - rem;
            rem *= 2;
        }
        System.out.println((rem-t+1));
    }
}
//testing code
class testD{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        ArrayList<Integer> ar = new ArrayList<>();
        int max=-1;
        for(int i=n-1;i>=0;i--){
            if(a[i]>=max){
                max=a[i];
                ar.add(a[i]);
            }
        }
        for(int i=ar.size()-1;i>=0;i--){
            System.out.print((ar.get(i)+" "));
        }
    }
}