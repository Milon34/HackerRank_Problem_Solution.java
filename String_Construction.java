package HackerRank;

import java.util.Scanner;

public class String_Construction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=0;i<n;i++){
            String s1=sc.next();
           // String s2=sc.next();
            int k=0,f=0;
            int count=0;
            for (int m=1;m<=s1.length();m++){
                String sub=s1.substring(k,m-1);
                //System.out.println(sub);
                String mys= String.valueOf(s1.charAt(f));
               // System.out.println("co:"+mys);
                if (sub.contains(mys)){

                }else {
                    count++;
                }
                f++;
            }
            System.out.println(count);
//            for (int m=1;m<=s2.length();m++){
//                String sub=s2.substring(k,m);
//                String myS=String.valueOf(s2.charAt(f));
//                if (sub.contains(myS)){
//
//                }else {
//                    count++;
//                }
//            }
//            System.out.println(count);
        }
    }
}
