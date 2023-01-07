package ArrayList.Assignmet;

import java.util.ArrayList;
import java.util.Scanner;

public class Swap2Element {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
//        Taking size of the list
        int n=sc.nextInt();
        for (int i=0; i<n; i++){
//            Adding elements in the list
            list.add(sc.nextInt());
        }
//        getting index where we have to swap the values
        int i=sc.nextInt(); int j=sc.nextInt();
        Integer temp=list.get(i);
        list.set(i,list.get(j));
        list.set(j,temp);
//        Printing the swapped list
        System.out.println(list);

    }
}
