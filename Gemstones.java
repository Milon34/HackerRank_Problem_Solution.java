package HackerRank;

import java.util.Scanner;
public class Gemstones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       // List<String> list = new ArrayList<>();
        int result = 0;
        String s[] = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        for (char c = 'a'; c <= 'z'; c++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (s[j].contains(Character.toString(c))) {
                    count++;
                } else {
                    break;
                }
            }
            if (count == n) {
                result++;
            }
        }
        System.out.println(result);
    }
}