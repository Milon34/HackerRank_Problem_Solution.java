package HackerRank;

import java.util.Arrays;
import java.util.Scanner;

public class Three_D_Surface_Area {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int H, W;
        H=sc.nextInt();
        W=sc.nextInt();
        int arr[][]=new int[H][W];
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++)
                arr[i][j]=sc.nextInt();
        }
        int s;
        s = (H * W) + (H * W);
        for (int i = 0; i < W; i++) {
            s = s + arr[H - 1][i];
        }
        for (int i = 0; i < W; i++) {
            s = s + arr[0][i];
        }
        for (int i = 0; i < H; i++) {
            s = s + arr[i][0];
        }
        for (int i = 0; i < H; i++) {
            s = s + arr[i][W - 1];
        }                              //s=44
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W - 1; j++) {
                int k = j + 1;
                s = s + Math.abs(arr[i][k] - arr[i][j]);
            }
        }
        for (int i = 0; i < W; i++) {
            for (int j = 0; j < H - 1; j++) {
                int k = j + 1;
                s = s + Math.abs(arr[k][i] - arr[j][i]);
            }
        }
        System.out.println(s);
    }
}