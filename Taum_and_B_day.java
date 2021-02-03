package HackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Taum_and_B_day {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- >0){
            long b,w,bc,wc,z;
            b=sc.nextLong();
            w=sc.nextLong();
            bc=sc.nextLong();
            wc=sc.nextLong();
            z=sc.nextLong();
            System.out.println(b*Math.min(bc, wc+z) + w*Math.min(wc,bc+z));

        }
    }
}
//testString....
class test{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        String s=sc.next();
        char ch[]=s.toCharArray();
        List<Character> l=new ArrayList<>();
        //char ch1[]=new char[];
        //l.add('0');
        for (int i=0;i<s.length()-1;i++){
            if (ch[i]=='1'&&ch[i+1]=='0'){
                l.add('0');
            }else if (ch[i]=='0'&&ch[i+1]=='1'){
                l.add('1');
            } else {
                if (ch[i]=='0'){
                    l.add('1');
                }else {
                    l.add('0');
                }//l.add(ch[i]);
            }
        }
       // if ()
        if (ch[s.length()-1]!=ch[ch.length-2]){
            if (ch[ch.length-1]=='1'){
                l.add('0');
            }else {
                l.add('1');
            }
        }else {
            if (ch[ch.length-1]=='1'){
                l.add('0');
            }else {
                l.add('1');
            }
        }
       for (char chF:l){
           System.out.print(chF);
       }
    }
}
class testHH{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        String s="";
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            s+=arr[i];
        }

        //char ch[]=s.toCharArray();
        int a= Integer.parseInt(s);
        int value=a+1;
        //System.out.println(value);
        String s2= String.valueOf(value);
        char ch1[]=s2.toCharArray();
        for (char chj:ch1){
            System.out.print(chj+" ");
        }
    }
}