package HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class New_Colony {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- >0){
            int n,k;
            n=sc.nextInt();
            k=sc.nextInt();
            int arr[]=new int[n];
            for (int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            List<Integer> l=new ArrayList<>();
            if (n==2){
                if (arr[1]-arr[0]==k){
                    System.out.println(1);
                }
            }else {
            for (int i=0;i<n-1;i++){
                if (arr[i]<arr[i+1]){
                    l.add(i+1);
                }
                if (arr[i]<arr[i+1]){
                    arr[i]=arr[i]+1;
                    //System.out.println(Arrays.toString(arr));
//                    for (int j=0;j<n-1;j++){
//                        if (arr[j]<arr[j+1]){
//                            l.add(j+1);
//                            break;
//                        }
//                    }
                }
            }
           // System.out.println(Arrays.toString(arr));

                if (l.contains(k)) {
                    System.out.println(l.indexOf(k) + 1);
                } else {
                    System.out.println(-1);
                }
            }


            //System.out.println(l);
            //System.out.println(Arrays.toString(arr));
        }
    }
}
