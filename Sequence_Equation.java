package HackerRank;

import java.util.*;

public class Sequence_Equation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer> lScan=new ArrayList<>();
        for (int i=0;i<n;i++){
            lScan.add(sc.nextInt());
        }
        List<Integer> lSeq=new ArrayList<>();
        for (int i=1;i<=n;i++){
            lSeq.add(i);
        }
        int myArraySeq[]=new int[n];
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for (int i=1;i<=n;i++){
            //myArraySeq[i]=lScan.indexOf(lSeq.get(i))+1;
            hashMap.put(i,lScan.indexOf(lSeq.get(i-1))+1);

        }
        for (int i=1;i<=hashMap.size();i++){
            int value=hashMap.get(i);
            System.out.println(hashMap.get(value));
        }
        //System.out.println(hashMap);

        //System.out.println(Arrays.toString(myArraySeq));
    }
}
