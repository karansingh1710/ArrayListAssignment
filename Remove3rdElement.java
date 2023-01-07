package ArrayList.Assignmet;

import java.util.ArrayList;
import java.util.Scanner;

public class Remove3rdElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
//        Taking size of the list
        int n=sc.nextInt();
        for (int i=0; i<n; i++){
//            Adding elements in the list
            list.add(sc.nextInt());
        }
//        Removing the element present at the index 2 bcz index 2 is our 3rd element
        list.remove(2);
        System.out.println(list);
    }
}
