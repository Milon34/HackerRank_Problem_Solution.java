package HackerRank;

import java.util.Arrays;
import java.util.Scanner;

public class Grid_Challenge {
    static boolean isSorted(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1])
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- >0){
            int n=sc.nextInt();
            String[] s=new String[n];
            for (int i=0;i<n;i++){
                String in=sc.next();
                char[] ch=in.toCharArray();
                Arrays.sort(ch);
                String moveArray= String.valueOf(ch);
                s[i]=moveArray;
            }
            //System.out.println(Arrays.toString(s));
            int m=s[0].length();
           int[][] sortedCheckRow=new int[n][m];
            for (int i=0;i<n;i++){
                String perfectCheck=s[i];
                for (int j=0;j<m;j++){
                    sortedCheckRow[i][j]=perfectCheck.charAt(j);
                }
            }
            boolean check=true;
            for (int i=0;i<m;i++){
                int[] genuineArray=new int[n];
                for (int j=0;j<n;j++){
                    genuineArray[j]=sortedCheckRow[j][i];
                }
                //System.out.println(Arrays.toString(genuineArray));
                if (isSorted(genuineArray)){
                    check=true;
                }else{
                    check=false;
                    break;
                }
            }
            if (check){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
//            for (int i=0;i<n;i++){
//                for (int j=0;j<m;j++){
//                    System.out.print(sortedCheckRow[i][j]+" ");
//                }
//                System.out.println();
//            }
        }
    }
}
