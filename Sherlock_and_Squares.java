package HackerRank;

import java.math.BigInteger;
import java.util.Scanner;

public class Sherlock_and_Squares {
    static boolean isPerfectSquare(long x)
    {
        if (x >= 0) {
            long sr = (long) Math.sqrt(x);
            return ((sr * sr) == x);
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n, k;
            n=sc.nextLong();
            k=sc.nextLong();
            //int count=0;

//            for (long i =  n; i<=k; i++){
//                //BigInteger big=new BigInteger(String.valueOf(i));
//                //BigInteger mul=b.multiply(b);
//                //BigInteger ns=big.sqrt();
//                //System.out.println(ns);
//               // System.out.println(b.multiply(b));
//                int ns= (int) Math.sqrt(i);
//                if ((ns*ns)==i){
//                    count++;
//                }
//            }
            System.out.println((int) (Math.floor(Math.sqrt(k)-Math.ceil(Math.sqrt(n)))+1));
        }
    }
}
