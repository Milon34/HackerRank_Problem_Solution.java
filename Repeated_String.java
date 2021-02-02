package HackerRank;

import java.util.Scanner;

public class Repeated_String {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s = sc.next();
        long n = sc.nextLong();
        long count =0;
        for(char c : s.toCharArray())
            if(c == 'a')
                count++;

        long factor = (n/s.length());
        long rem = (n%s.length());
        count =  factor*count ;
        for(int i=0;i<rem;i++)
            if(s.charAt(i)=='a')
                count++;
        System.out.println(count);
//        if (count==0){
//            System.out.println(s);
//        }else {
//            System.out.println(count);
//        }
    }
}
