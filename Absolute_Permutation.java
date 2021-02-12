package HackerRank;

import java.util.*;

public class Absolute_Permutation {
    public static void absolutePermutation(int n, int k) {
        if (k == 0) {
           for (int i=0;i<n;i++){
               System.out.print((i+1)+" ");
           }
            System.out.println();
        }else if (((n%(2*k))!=0)||(2*k>n)){
            System.out.println(-1);
        }else {
            for (int i=0;i<n;i++){
                if ((i/k)%2==0){
                    System.out.print((i+1+1)+" ");
                }else {
                    System.out.println(k);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n, k;
            n = sc.nextInt();
            k = sc.nextInt();
            boolean flag = false;
            boolean[] b = new boolean[n+1];
            String ans = "";
            for(int i = 1; i <= n; i++){//time limit execute
                int x = i + k;
                int y = i - k;
                if(y > 0 && y <= n && b[y] == false){
                    ans += y + " ";
                    b[y] = true;
                }else if(x > 0 && x <= n && b[x] == false){
                    ans += x + " ";
                    b[x] = true;
                }else{
                    flag = true;
                    break;
                }
            }
            if(!flag){
                System.out.println(ans);
            }else{
                System.out.println(-1);
            }
        }
    }
}
