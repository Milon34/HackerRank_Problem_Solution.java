package HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Missing_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int arr1[] = new int[(int) n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        int arr2[] = new int[(int) n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }
        List<Integer> l=new ArrayList<>();
        for (int i=0;i<arr1.length;i++){
            int count=0;
            for (int j=0;j<arr2.length;j++){
                if (arr1[i]==arr2[i]){
                    count++;
                }
            }
            if (count%2!=0){
                l.add(arr1[i]);
            }
        }
        System.out.println(l);
//        Arrays.sort(arr1);
//        Arrays.sort(arr2);
//        int val1 = arr1[arr1.length - 1];
//        int val2 = arr2[arr2.length - 1];
//        int arrFast1[] = new int[val1 + 1];
//        int arrFast2[] = new int[val2 + 1];
//        //System.out.println(arrFast1.length);
//        for (int i = 0; i < n1; i++) {
//            arrFast1[arr1[i]]++;
//        }
//        for (int i = 0; i < n2; i++) {
//            arrFast2[arr2[i]]++;
//        }
//        System.out.println(Arrays.toString(arrFast1));
//        List<Integer> add = new ArrayList<>();
//        for (int i = 0; i < arrFast1.length; i++) {
//            for (int j = 0; j < arrFast2.length; j++) {
//                if ()
//            }
//        }
        //  System.out.println(add);
    }
}
   // int temp=a[i];
    //            a[i]=c[i];
   //                     c[i]=temp;
                        //swap(a[i],c[i]);
    //                    temp=b[i];
    //                    b[i]=d[i];
    //                    d[i]=temp;
//  swap(b[i],d[i]);