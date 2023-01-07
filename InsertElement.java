package ArrayList.Assignmet;
import java.util.ArrayList;
import java.util.Scanner;

public class InsertElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> list=new ArrayList<>();
        System.out.println("Enter elements of the list");
        for (int i=0; i<n; i++){
            list.add(sc.nextInt());
        }
        System.out.println("Enter element to be inserted");
        list.add(0,sc.nextInt());
        System.out.println(list);
    }
}
