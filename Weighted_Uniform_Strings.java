package HackerRank;

import java.util.*;

public class Weighted_Uniform_Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int t = sc.nextInt();
//        while (t-- > 0) {
//            int n = sc.nextInt();
//            l.add(n);
//        }
        char [] charArray = s.toCharArray();
        int myStr= 1;
        int lastAlphaNum = 0;
        Set<Integer> list = new HashSet<Integer>();
        for(int i=0 ;i< charArray.length; i ++){
            int alphaNum = charArray[i] -96;
            if(alphaNum == lastAlphaNum){
                myStr++;
            }
            else{
                myStr = 1;
                lastAlphaNum = alphaNum;
            }
            int num = (alphaNum) * myStr;
            list.add(num);
        }
        //System.out.println(list);
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            if (list.contains(n)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
        //System.out.println(l);
    }
}
