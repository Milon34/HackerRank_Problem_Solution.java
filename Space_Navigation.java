package HackerRank;

import java.util.Scanner;

public class Space_Navigation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long px, py;
            px = sc.nextLong();
            py = sc.nextLong();
           int l=0,r=0,u=0,d=0;
            String s;
             s=sc.next();
            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i)=='L')
                    l++;
                if(s.charAt(i)=='R')
                    r++;
                if(s.charAt(i)=='U')
                    u++;
                if(s.charAt(i)=='D')
                    d++;
            }
            if(px>=0&&py>=0)
            {
                if(r>=px&&u>=py)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
            else if(px<=0&&py<=0)
            {
                if(l>=-1*px&&d>=-1*py)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
            else if(px>=0&&py<=0)
            {
                if(r>=px&&d>=-1*py)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
            else if(px<=0&&py>=0)
            {
                if(l>=-1*px&&u>=py)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
        }
//            String s = sc.next();
//            char ch[] = s.toCharArray();
//            int x = 0, y = 0;
//            if (px > 0 && py > 0) {
//                for (long i = 0; i < s.length(); i++) {
//                    if (ch[(int) i] == 'R') {
//                        x++;
//                    } else if (ch[(int) i] == 'U') {
//                        y++;
//                    }
//                }
//
//            } else if (px > 0 && py <0) {
//                for (long i = 0; i < s.length(); i++) {
//                    if (ch[(int) i] == 'R') {
//                        x++;
//                    } else if (ch[(int) i] == 'D') {
//                        y--;
//                    }
//                }
//            } else if (px < 0 && py < 0) {
//                for (long i = 0; i < s.length(); i++) {
//                    if (ch[(int) i] == 'L') {
//                        x--;
//                    } else if (ch[(int) i] == 'D') {
//                        y--;
//                    }
//                }
//            } else if (px < 0 && py > 0) {
//                for (long i = 0; i < s.length(); i++) {
//                    if (ch[(int) i] == 'L') {
//                        x--;
//                    } else if (ch[(int) i] == 'U') {
//                        y++;
//                    }
//                }
//            }else if (px==0&&py>0){
//                for (int i=0;i<s.length();i++){
//                    if (ch[i]=='U'){
//                        y++;
//                    }
//                }
//            }else if (px>0&&py==0){
//                for (int i=0;i<s.length();i++){
//                    if (ch[i]=='R'){
//                        x++;
//                    }
//                }
//            }else if (px==0&&py<0){
//                for (int i=0;i<s.length();i++){
//                    if (ch[i]=='D'){
//                        y--;
//                    }
//                }
//            }else if (px<0&&py==0){
//                for (int i=0;i<s.length();i++){
//                    if (ch[i]=='L'){
//                        x--;
//                    }
//                }
//            }
//            if (x==px&&y==py){
//                System.out.println("YES");
//            }else {
//                System.out.println("NO");
//            }
//
//        }
    }
}
