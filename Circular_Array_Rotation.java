package HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Circular_Array_Rotation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,k,q;
        n=sc.nextInt();
        k=sc.nextInt();
        q=sc.nextInt();
       // int arr1[]=new int[n];
        List<Integer> l=new ArrayList<>();
        for (int i=0;i<n;i++){
            l.add(sc.nextInt());
        }
        //System.out.println(Arrays.toString(arr1));
        int arr2[]=new int[q];
        for (int i=0;i<q;i++){
            arr2[i]=sc.nextInt();
            System.out.println(l.get((n - (k % n)+ arr2[i]) % n));
        }
//        int ks=0;
//        for (int i=0;i<k;i++){
//            int mValue=l.get(0);
//            l.set(ks,l.get(l.size()-1));
//            for (int j=1;j<l.size();j++){
//                int fValue=l.get(j);
//                l.set(j,mValue);
//                mValue=fValue;
//            }
//        }
//        for (int i=0;i<arr2.length;i++){
//            System.out.println(l.get(arr2[i]));
//        }
        //System.out.println(l);
    }
}
