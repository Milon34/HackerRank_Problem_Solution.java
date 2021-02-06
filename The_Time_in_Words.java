package HackerRank;

import java.util.Scanner;

public class The_Time_in_Words {
    public static void main(String[] args) {
        int h, m;
        Scanner sc = new Scanner(System.in);
        h = sc.nextInt();
        m = sc.nextInt();
        String[] value = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty", "twenty one", "twenty two", "twenty three", "twenty four", "twenty five", "twenty six", "twenty seven", "twenty eight", "twenty nine"};
        String time;
        if (m <= 30) {
            if (m == 0)
                time = value[h] + " o' clock";
            else if (m == 15)
                time = "quarter past " + value[h];
            else if (m == 30)
                time = "half past " + value[h];
            else if (m == 1)
                time = value[m] + " minute past " + value[h];
            else
                time = value[m] + " minutes past " + value[h];
        } else {
            if (m == 45)
                time = "quarter to " + value[h + 1];
            else if (m == 59)
                time = value[60 - m] + " minute to " + value[h + 1];
            else
                time = value[60 - m] + " minutes to " + value[h + 1];
        }
        System.out.println(time);
    }
}

