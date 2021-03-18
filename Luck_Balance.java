package HackerRank;

import java.util.*;

public class Luck_Balance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, k;
        n = sc.nextInt();
        k = sc.nextInt();
        int sum=0;
        List<Integer> l=new ArrayList<>();
        for (int i=0;i<n;i++){
            int a,b;
            a=sc.nextInt();
            b=sc.nextInt();
            sum+=a;
            if (b==1){
                l.add(a);
            }
        }
        Collections.sort(l);
        //System.out.println(l);
        int res=0;
        for (int i=0;i<l.size()-k;i++){
            res+=l.get(i);
        }
        System.out.println(sum-2*res);

    }
}
