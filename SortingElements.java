package ArrayList.Assignmet;

import java.util.*;

public class SortingElements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
//        Taking size of the list
        int n=sc.nextInt();
        for (int i=0; i<n; i++){
//            Adding elements in the list
            list.add(sc.nextInt());
        }
//        Calling the sort method
        Collections.sort(list);
        System.out.println(list);
    }
}
