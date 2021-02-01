package HackerRank;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Save_the_Prisoner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n, m, s;
            n = sc.nextInt();
            m = sc.nextInt();
            s = sc.nextInt();
//            List<Integer> l = new ArrayList<>();
//            for (int i = 1; i <= n; i++) {
//                l.add(i);
//            }
//            int idx=l.indexOf(s);
//            int count=0;
//            int myIdx=0;
            int last = ((m - 1) + (s - 1)) % n + 1;
            System.out.println(last);
//            for (int i=0;i<m;i++){
//                Iterator<Integer> itr=l.iterator();
//                while (itr.hasNext()){
//
//                }
////                count++;
////                if (i>l.size()-1){
////                    i=0;
////                }
////                if (count==m){
////                    myIdx=i;
////                    break;
////                }
//            }
//            System.out.println(l.get(Math.abs(idx+myIdx)));
//            int count=0;
//             for (int i=l.indexOf(s);i<=l.indexOf(s)+m;i++){
//                 count++;
//               if (i>l.size()-1){
//                   i=0;
//               }
//               if (count==m){
//                   System.out.println(l.get(i));
//                   break;
//               }
//             }
           // System.out.println(l.indexOf(s));
        }
    }
}
