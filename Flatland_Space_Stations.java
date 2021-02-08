package HackerRank;

import java.util.*;

public class Flatland_Space_Stations {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,m;
        n=sc.nextInt();
        m=sc.nextInt();
//        List<Integer> l=new ArrayList<>();
        int arr[]=new int[m];
        for (int i=0;i<m;i++){
//            l.add(sc.nextInt());
            arr[i]=sc.nextInt();
        }
//        List<Integer> myList=new ArrayList<>();
        //int arr[]=new int[n];
        int max=0;
        for (int i=0;i<n;i++){
            int min=Integer.MAX_VALUE;
            m:for (int j=0;j<arr.length;j++){
                min=Math.min(min,Math.abs(i-arr[j]));
                if (min==0){
                    break m;
                }
            }
            //arr[i]=min;
            max=Math.max(max,min);
        }
        System.out.println(max);
    }
}
