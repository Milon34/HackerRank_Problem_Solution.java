package HackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Encryption {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int value = s.length();
        List<String> l = new ArrayList<>();
        int m = 0;
        int mySeq= (int) Math.floor(Math.sqrt(value));
        int mySeq1= (int) Math.ceil(Math.sqrt(value));
        int nano=mySeq*mySeq1;
        if (nano>=s.length()) {
            for (int i = 0; i < Math.floor(Math.sqrt(value)); i++) {
                String fd = "";
                for (int j = 0; j < Math.ceil(Math.sqrt(value)); j++) {
                    try {
                        fd += s.charAt(m);
                    } catch (Exception e) {
                        //fd+=s.charAt(m+1);
                    }
                    m++;
                }
                l.add(fd);
            }
        }else {
            for (int i = 0; i < Math.floor(Math.sqrt(value))+1; i++) {
                String fd = "";
                for (int j = 0; j < Math.ceil(Math.sqrt(value)); j++) {
                    try {
                        fd += s.charAt(m);
                    } catch (Exception e) {
                        //fd+=s.charAt(m+1);
                    }
                    m++;
                }
                l.add(fd);
            }
        }
       // System.out.println(l);
        List<String> myList = new ArrayList<>();
        int ms = 0;
        for (int i = 0; i < Math.ceil(Math.sqrt(value)); i++) {
            String mySF = "";
            for (int j = 0; j < l.size(); j++) {
                String myS = l.get(j);
                try {
                    mySF += myS.charAt(ms);
                }catch (Exception e){

                }
            }
            myList.add(mySF);
            ms++;
        }
        for (String sm:myList){
            System.out.print(sm+" ");
        }
        System.out.println();
//        System.out.println(myList);
    }
}
