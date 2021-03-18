package HackerRank;

import java.util.*;

public class Marcs_Cakewalk {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        List<Long> l=new ArrayList<>();
        for (int i=0;i<n;i++){
            l.add(sc.nextLong());
        }
        Collections.sort(l,Collections.reverseOrder());
        long sum=0;
        for (int i=0;i<l.size();i++){
            sum+=(l.get(i)*Math.pow(2,i));
        }
        System.out.println(sum);
    }
}
