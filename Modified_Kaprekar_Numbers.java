package HackerRank;

import java.util.Scanner;

public class Modified_Kaprekar_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long  n,m;
        int flag = 0;
        n=sc.nextLong();
        m=sc.nextLong();
        for(long  i=n;i<=m;i++){
            long sum;
           // long a = 0;
            long k = i;
//            while(k>0){
//                k/=10 ;
//                ++a;
//            }
            String s= String.valueOf(k);
            int a=s.length();
            long p = i * i;
            long g = (long) Math.pow(10,a);
            sum = p%g + p/g;
            if(sum == i){
                System.out.print(sum+" ");
                flag++;
            }
        }
        if(flag == 0)
            System.out.println("INVALID RANGE");

    }
}
