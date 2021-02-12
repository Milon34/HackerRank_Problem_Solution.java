package HackerRank;

import java.util.*;

public class Big_Sorting {
    static void sortLargeNumbers(String arr[]) {
        Arrays.sort(arr, (left, right) ->         //using lamda expression
        {
            if (left.length() != right.length())
                return left.length() - right.length();
            return left.compareTo(right);
        });
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String arr[]=new String[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.next();
        }
        sortLargeNumbers(arr);
        for (String s:arr){
            System.out.println(s);
        }
        System.out.println();
    }
}
class  testKK{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int v=sc.nextInt();
        int n=sc.nextInt();
        List<Integer> l=new ArrayList<>();
       for (int i=0;i<n;i++){
           l.add(sc.nextInt());
       }
        System.out.println(Collections.binarySearch(l,v));
    }
}