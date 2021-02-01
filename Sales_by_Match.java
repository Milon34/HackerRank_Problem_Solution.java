package HackerRank;

import java.util.*;

public class Sales_by_Match {
    public static LinkedHashSet<Integer> findDuplicates(int[] input) {
        LinkedHashSet<Integer> duplicates = new LinkedHashSet<Integer>();

        for (int i = 0; i < input.length; i++) {
            for (int j = 1; j < input.length; j++) {
                if (input[i] == input[j] && i != j) {
                    // duplicate element found
                    duplicates.add(input[i]);
                    break;
                }
            }
        }
        return duplicates;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //List<Integer> l=new ArrayList<>();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        List<Integer> newArray=new ArrayList<>();
        LinkedHashSet<Integer> helloList = new LinkedHashSet<>();
        helloList = (LinkedHashSet<Integer>) findDuplicates(arr);

        Iterator<Integer> itr=helloList.iterator();
        while (itr.hasNext()){
            newArray.add(itr.next());
        }
        //System.out.println(newArray);
       // List<Integer> test=new ArrayList<>();
        int count=0,sum=0;
        for (int i=0;i<newArray.size();i++){
            for (int j=0;j<arr.length;j++){
                if (newArray.get(i)==arr[j]){
                    //test.add(arr[j]);
                    count++;
                }
            }
           sum+=count/2;
            count=0;
        }
        System.out.println(sum);


       // System.out.println(test);

//        for (int i = 0; i < helloList.size(); i++) {
//            newArray.add(helloList.);;
//        }
//        // System.out.println(helloList);
//        for (int i = 0; i < helloList.size(); i++) {
//            for (int j = 0; j < arr.length; j++) {
//                if (helloList)
//            }
//        }
//        List<Integer> myList=new ArrayList<>();
//        for (int i=0;i<helloList.size();i++){
//            for (int j=0;j<l.size();j++){
//                if (helloList.get(i).equals(l.get(j))){
//                    myList.add(helloList.get(i));
//                }
//            }
//        }
//        System.out.println(myList);
    }
}

class testK {
    public static Set<Integer> findDuplicates(int[] input) {
        Set<Integer> duplicates = new HashSet<Integer>();

        for (int i = 0; i < input.length; i++) {
            for (int j = 1; j < input.length; j++) {
                if (input[i] == input[j] && i != j) {
                    // duplicate element found
                    duplicates.add(input[i]);
                    break;
                }
            }
        }

        return duplicates;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 2, 7, 8, 8, 3, 3, 3};
        System.out.println("Duplicate elements in given array: ");
        //Searches for duplicate element
        System.out.println(findDuplicates(arr));
    }
}