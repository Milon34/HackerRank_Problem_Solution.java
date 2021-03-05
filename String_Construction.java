package HackerRank;

import java.util.HashSet;
import java.util.Scanner;

public class String_Construction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=0;i<n;i++){
            String s=sc.next();
           // String s2=sc.next();
//            int k=0,f=0;
//            int count=0;
            HashSet<Character> hash=new HashSet<>();
            for (int m=0;m<s.length();m++){
                hash.add(s.charAt(m));
            }
//            for (int m=1;m<=s1.length();m++){
//                String sub=s1.substring(k,m-1);
//                String mys= String.valueOf(s1.charAt(f));
//                if (sub.contains(mys)){
//                }else {
//                    count++;
//                }
//                f++;
//            }
            System.out.println(hash.size());
        }
    }
}
