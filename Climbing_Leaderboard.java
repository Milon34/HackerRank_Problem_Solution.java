package HackerRank;

import java.util.*;

public class Climbing_Leaderboard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TreeSet<Integer> hashSet = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            hashSet.add(sc.nextInt());
        }
        // System.out.println(hashSet);
        int m = sc.nextInt();
        int arr[] = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = sc.nextInt();
        }
        Object[] obj = hashSet.toArray();
        // Map<Integer,Integer> mil=new HashMap<>();
        int k = hashSet.size() - 1;
        List<Integer> l = new ArrayList<>();
        for (int i = 1; i <= hashSet.size(); i++) {
            l.add((Integer) obj[k]);
//            mil.put(i, (Integer) obj[k]);
            k--;
        }
        System.out.println(l);
        // System.out.println(l.indexOf());


        int incre = hashSet.size() + 1;
        for (int i = 0; i < arr.length; i++) {

            mi:for (int j = 0; j < l.size(); j++) {

                if (arr[i] >= l.get(j)) {
                    System.out.println(l.indexOf(l.get(j)) + 1);
                    break mi;
                }else if (arr[i]<l.get(l.size()-1)){
                    System.out.println(incre);
                    break mi;
                }
                incre++;
//                if (arr[i] < l.get(j)) {
//                    System.out.println(incre);
//                    break mi;
//                }
//                incre++;
            }
        }
//
//        System.out.println(mil);


//        int rank=1;
//        int resArray[]=new int[arr.length];
//        for (int i = 0;i<arr.length;i++){
//            for (int j=0;j<hashSet.size()-1;j++){
//                if ()
//            }
//        }

        //System.out.println(Arrays.toString(arr));
    }
}
