package HackerRank;

import java.util.Arrays;
import java.util.Scanner;

public class Maximum_Cost_of_Laptop_Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int arr[] = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr[i] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        String s[] = new String[n2];
        for (int i = 0; i < n2; i++) {
            s[i] = sc.next();
        }
        int fact = sc.nextInt();
        int sum = 0;
        if (n1 ==1&&s[0].equals("illegal")){
            System.out.println("0");
            return;
        }else if (n1 ==1&&s[0].equals("legal")){
            sum+=arr[0];
        }else {
            int myVal=fact;
            int hash=0;
            for (int i = 0; i <= fact-1; i++) {
                //System.out.println("hh");
                if (arr[hash] == 0) {
                    hash++;
                    fact++;
                } else if (s[i].equals("legal")) {
                    sum += arr[i];
                } else if (s[i].equals("illegal")) {
                    sum += arr[i];
                    fact++;
                }if (s[i+1].equals("illegal")&&arr[0]==0){
                    sum+=arr[i+1];
                }
//                if(count==myVal){
//                    System.out.println(sum);
//                    return;
//                }

//                if (s[i+1].equals("illegal")){
//                    sum+=arr[i+1];
//                }
            }
        }
        System.out.println(sum);
        //System.out.println(Arrays.toString(s));
    }
}
