package HackerRank;

import java.util.*;

public class Picking_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        int arr[] = new int[n];
        int[] arr = new int[100];
        int a;
        for(int i=0; i < n; i++){
            a = sc.nextInt();
            if (a==0) {
                arr[0]++;
            } else {
                arr[a]++;
                arr[a-1]++;
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 100; i++) {
            if (arr[i] > max ) {
                max = arr[i];
            }
        }
        System.out.println(max);
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//        List<Integer> l = new ArrayList<>();
//        for (int j = 0; j < n - 1; j++) {
//            if (Math.abs(arr[j] - arr[j + 1]) <= 1) {
//                l.add(arr[j]);
//            }
//        }
//        System.out.println(l);
//
//        for (int i=0;i<l.size();i++){
//            mi: for (int j=i+1;j<l.size();j++){
//                if (Math.abs(l.get(i)-l.get(j))<=1){
//                    continue mi;
//                }else {
//                    l.remove(new Integer(l.get(j)));
//                }
//            }
//        }
//        System.out.println(l);
//        System.out.println(l.size());





//        //System.out.println(l);
//        List<Integer> connect=new ArrayList<>();
//        for (int i=0;i<l.size();i++){
//            for (int j=0;j<arr.length;j++){
//                if (l.get(i)==arr[j]){
//                    connect.add(l.get(i));
//                }
//            }
//        }
        //System.out.println(connect);
//
//        System.out.println(connect);
//        Collections.sort(connect);//1 2 3
       // List<Integer> myList=new ArrayList<>();
//        for (int i=0;i<connect.size();i++){
//            for (int j=i+1;j<connect.size();j++){
//                if (Math.abs(l.get(i)-l.get(j))<=1){
//                    continue;
//                }else {
//                    connect.remove(connect.get(j));
//                }
//            }
//        }
        //System.out.println(connect.size());
    }
}
