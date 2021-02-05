package HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Beautiful_Triplets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, k;
        n = sc.nextInt();
        k = sc.nextInt();
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            l.add(sc.nextInt());
        }

        int count = 0;
        for (int i=0;i<l.size();i++){
            if (l.contains(l.get(i)+k)&&l.contains(l.get(i)+(2*k))){
                count++;
            }
        }
        System.out.println(count);
    }
}



