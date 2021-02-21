package HackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mars_Exploration {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        List<String> l=new ArrayList<>();
        for (int i=0;i<s.length();i+=3){
            l.add(s.substring(i,i+3));
        }
        int count=0;
        for (int i=0;i<l.size();i++){
            String myS=l.get(i);
            if (myS.charAt(0)=='S'){

            }else {
                count++;
            }
            if (myS.charAt(1)=='O'){

            }else {
                count++;
            }
            if (myS.charAt(2)=='S'){

            }else {
                count++;
            }

        }
        System.out.println(count);
    }
}
