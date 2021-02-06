package HackerRank;

import java.util.Scanner;

public class Halloween_Sale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p, d, m, s;
        p = sc.nextInt();
        d = sc.nextInt();
        m = sc.nextInt();
        s = sc.nextInt();
        int sum = 0;
        int count = 0;
        int checkValue = p;
        while (sum<=s) {
            if (checkValue>m){
                count++;
                sum+=checkValue;
                checkValue=checkValue-d;
            }else{
                count++;
                sum+=m;
            }
            if (sum>s){
                break;
            }
        }
        //System.out.println(sum);
        System.out.println(count-1);
    }
}
