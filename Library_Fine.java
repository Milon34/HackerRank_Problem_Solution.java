package HackerRank;

import java.util.*;

public class Library_Fine {
    public static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
        int fine = 0;
        if (y1 > y2) {
            fine = 10000;
        } else if (y1 <= y2) {
            if (m1 > m2 && (y1 >= y2)) {
                fine = 500 * (m1 - m2);
            } else if (m1 <= m2) {
                if (d1 > d2 && (m1 - m2 >= 0) && (y1 >= y2)) {
                    fine = 15 * (d1 - d2);
                } else {
                    fine = 0;
                }
            }
        }
        return fine;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d1, m1, y1;
        d1 = sc.nextInt();
        m1 = sc.nextInt();
        y1 = sc.nextInt();
        int d2, m2, y2;
        d2 = sc.nextInt();
        m2 = sc.nextInt();
        y2 = sc.nextInt();

        System.out.println(libraryFine(d1, m1, y1, d2, m2, y2));
    }
}
//Testing code
class testJJ {
    public static boolean checkString(String s1, String s2) {

        int count = 0;
        if (s1.length() >= s2.length()) {
            for (int i = 0; i < s2.length(); i++) {
                if (s1.charAt(i) == s2.charAt(i)) {
                    count++;
                }
            }
            if (count == s1.length() && count == s2.length()) {
                return true;
            }
        } else {
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) == s2.charAt(i)) {
                    count++;
                }
            }
            if (count == s1.length() && count == s2.length()) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkNum(int a, int b) {
        if (a == b) {
            return true;
        }
        return false;
    }

    public static boolean compare(int arr1[], int arr2[]) {
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == arr2[i]) {
                count++;
            }
        }
        if (count == arr1.length) {
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- >0){

            List<String> l=new ArrayList<>();
            l.add(sc.nextLine());
            l.add(sc.nextLine());
               // System.out.println(s1);
               // String s2 = sc.nextLine();
            System.out.println(l);

            int a,b;
            a=sc.nextInt();
            b=sc.nextInt();
            if (checkNum(a,b)){
                System.out.println("Same");
            }else {
                System.out.println("Different");
            }
            int n1,m1;
            n1=sc.nextInt();
            m1=sc.nextInt();
            int arr1[]=new int[n1];
            int arr2[]=new int[m1];
            for (int i=0;i<n1;i++){
                arr1[i]=sc.nextInt();
            }
            for (int i=0;i<m1;i++){
                arr2[i]=sc.nextInt();
            }
            if (compare(arr1,arr2)){
                System.out.println("Same");
            }else {
                System.out.println("Different");
            }
        }
    }
}

class testMap{
    private static HashMap sortByValues(HashMap map) {
        List list = new LinkedList(map.entrySet());
        // Defined Custom Comparator here
        Collections.sort(list, new Comparator() {
            public int compare(Object o1, Object o2) {
                return ((Comparable) ((Map.Entry) (o2)).getValue())
                        .compareTo(((Map.Entry) (o1)).getValue());
            }
        });

        // Here I am copying the sorted list in HashMap
        // using LinkedHashMap to preserve the insertion order
        HashMap sortedHashMap = new LinkedHashMap();
        for (Iterator it = list.iterator(); it.hasNext();) {
            Map.Entry entry = (Map.Entry) it.next();
            sortedHashMap.put(entry.getKey(), entry.getValue());
        }
        return sortedHashMap;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        HashMap<String,Integer> h=new HashMap<>();
        while (t-- >0){
           h.put(sc.next(), sc.nextInt());
        }
        Map<Integer, String> map = sortByValues(h);
       // System.out.println("After Sorting:");
        //Collections.reverse();
        Set set2 = map.entrySet();
        Iterator iterator2 = set2.iterator();
        while(iterator2.hasNext()) {
            Map.Entry me2 = (Map.Entry)iterator2.next();
            System.out.print(me2.getKey() + " ");
            System.out.println(me2.getValue());
        }
    }
}