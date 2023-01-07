package ArrayList.Assignmet;

import java.util.ArrayList;
import java.util.Scanner;

public class IntegerElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        for (int i=0; i<n; i++){
            if (arr[i]>0){
                list.add(arr[i]);
            }
        }
        if (list.size()>0){
            System.out.println(list);
        }
        else {
            System.out.println("NA");
        }
    }
}
