package HackerRank;

import java.util.*;

public class Electronics_Shop {
    public static void main(String[] args) {
        Scanner  sc=new Scanner(System.in);
        long b,n,m;
        b=sc.nextLong();
        n=sc.nextLong();
        m=sc.nextLong();
        long arrN[]=new long[(int) n];
        for (long i=0;i<n;i++){
            arrN[(int) i]=sc.nextInt();
        }
        long arrM[]=new long[(int) m];
        for (long i=0;i<m;i++){
            arrM[(int) i]=sc.nextInt();
        }
        //Arrays.sort(arrN);
       // Arrays.sort(arrM);
        List<Long> l=new ArrayList<>();
        for (long i=0;i<arrN.length;i++){
            for (long j=0;j<arrM.length;j++){
               if (arrN[(int) i]+arrM[(int) j]<=b){
                   l.add(arrN[(int) i]+arrM[(int) j]);
               }
            }
        }
        if (l.size()==0){
            System.out.println(-1);
        }else {
           // Collections.sort(l);
            System.out.println(Collections.max(l));
           // System.out.println(l.get(l.size()-1));
        }
//        if (n==1&&m==1){
//            if (arrM[0]+arrN[0]<b){
//                System.out.println(arrM[0]+arrN[0]);
//            }else {
//                System.out.println(-1);
//            }
//        }else {
//
//        }
    }
}
