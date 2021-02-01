package HackerRank;

import java.util.Scanner;

public class Beautiful_Days_at_the_Movies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j, k;
        i = sc.nextInt();
        j = sc.nextInt();
        k = sc.nextInt();
        int count = 0;
        for (int m = i; m <= j; m++) {
            String s = String.valueOf(m);
            StringBuffer sb = new StringBuffer(s);
            sb.reverse();
            String myReverseStr = String.valueOf(sb);
            int myReverseInt = Integer.parseInt(myReverseStr);
            if ((Math.abs(m-myReverseInt)%k==0)){
                count++;
            }
            //System.out.println(sb.toString());
        }
        System.out.println(count);
    }
}
