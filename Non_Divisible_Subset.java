package HackerRank;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Non_Divisible_Subset {
    static int nonDivisibleSubset(int k, int[] S) { //7
                                                    //        19 10 12 10 24 25 22
        int[] remainderArr = new int[k];
        for (Integer each : S) {
            remainderArr[each % k]++;
        }
        int zeroRemainder = remainderArr[0];
        int maxNumberOfDivisibleSet;
        if (zeroRemainder>0){
            maxNumberOfDivisibleSet=1;
        }else {
            maxNumberOfDivisibleSet=0;
        }
        //int maxNumberOfDivisibleSet = zeroRemainder > 0 ? 1 : 0;
        for (int i = 1; i <= (k / 2); i++) {
            if (i != k - i)
                maxNumberOfDivisibleSet += Math.max(remainderArr[i], remainderArr[k - i]);
            else
                maxNumberOfDivisibleSet ++;
        }
        return maxNumberOfDivisibleSet;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,k;
        n=sc.nextInt();
        k=sc.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(nonDivisibleSubset(k,arr));
    }
}
