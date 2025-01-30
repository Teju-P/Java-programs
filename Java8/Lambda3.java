package Java8;

import java.util.ArrayList;

public class Lambda3 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        System.out.println("Printing all elements of al:");
        al.forEach(n -> System.out.print(n+" "));
        System.out.println("\nPrinting only even elements of al:");
        al.forEach(n ->{
            if(n%2==0) System.out.print(n+" ");
        });
        System.out.println();
    }
}
