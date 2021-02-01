package HackerRank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Migratory_Bird {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int arrF[] = new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i = 0; i < n ; i++ ) {
            arrF[arr[i]]++;
        }
        int max = 0,maxpos=0;
        for(int i = 0 ; i < n ; i++)
        {
            if(arrF[i] > max)
            {
                max = arrF[i];
                maxpos = i;
            }
        }
        System.out.println(maxpos);
        }
    }

