package HackerRank;

import java.util.Scanner;

public class The_Love_Letter_Mystery {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=0;i<n;i++){
            String s=sc.next();
            int count=0;
            int m = 0, k = s.length() - 1;
            while(m < k){
                count += Math.abs(s.charAt(m) - s.charAt(k));
                m++; k--;
            }
            System.out.println(count);
        }
    }
}
