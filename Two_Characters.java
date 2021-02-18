package HackerRank;

import java.util.Scanner;

public class Two_Characters {
    public static int alternating(String s,char c1,char c2){
        char lastseen=0;
        int result=0;

        for (int k=0;k<s.length();k++) {
            if ((s.charAt(k)!=c1) && (s.charAt(k)!=c2)){
                continue;
            }
            if (lastseen!=s.charAt(k)) {
                lastseen=s.charAt(k);
                result++;
                continue;
            }
            return 0;
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        char ch[] = s.toCharArray();
        int sum=0;
        for (int i=0;i<s.length()-1;i++){
            sum+=alternating(s,ch[i],ch[i+1]);
        }
        System.out.println(sum);
    }
}
class testF{
    public  static  void sort(int arr[])
    {
        int n = arr.length;
        int count=0;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
                count++;
            }
            arr[j + 1] = key;
        }
        System.out.println(count);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sort(arr);
    }
}