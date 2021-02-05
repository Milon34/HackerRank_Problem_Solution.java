package HackerRank;

import java.util.Arrays;
import java.util.Scanner;

public class Bigger_is_Greater {
    static String biggerIsGreater(String s) {
        char charArr[] = s.toCharArray();
        int n = charArr.length;
        int i = 0;
        for (i = n - 1; i > 0; i--) {
            if (charArr[i] > charArr[i - 1]) {
                break;
            }
        }
        if (i == 0) {
            return "no answer";
        } else {
            int small = charArr[i - 1], next = i;

            for (int j = i + 1; j < n; j++) {
                if (charArr[j] > small && charArr[j] < charArr[next]) {
                    next = j;
                }
            }
            swap(charArr, i - 1, next);
            Arrays.sort(charArr, i, n);
        }
        return new String(charArr);
    }

    static void swap(char charArr[], int i, int j) {
        char temp = charArr[i];
        charArr[i] = charArr[j];
        charArr[j] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            String s = sc.next();
            System.out.println(biggerIsGreater(s));
            // System.out.println(Arrays.toString(ch));
        }
    }
}
