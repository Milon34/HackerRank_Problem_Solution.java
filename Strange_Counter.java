package HackerRank;

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
