package HackerRank;

import java.util.*;

public class Designer_PDF_Viewer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[26];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        String s = sc.next();
        char ch[] = s.toCharArray();
        List<Character> listCharacter = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            listCharacter.add(ch[i]);
        }
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            int val = ch[i] - 97;
            l.add(arr[val]);
        }
        int max= Collections.max(l);
        System.out.println(l.size()*max);
    }
}
