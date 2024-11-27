import java.util.LinkedList;
import java.util.Collections;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> num = new LinkedList<>();
        System.out.println("LinkedList has all methods that are present in ArrayList");
        num.add(10);
        num.add(20);
        num.add(30);
        num.add(40);
        System.out.println("num: "+num);
        num.addFirst(50);
        num.addLast(60);
        System.out.println(num);
        num.removeFirst();
        num.removeLast();
        num.remove(num.indexOf(30));
        System.out.println(num);
        System.out.println(num.getFirst());
        System.out.println(num.getLast());
        System.out.println("Before sorting in reverse order: "+num);
        Collections.sort(num,Collections.reverseOrder());
        System.out.println("After sorting in reverse order: "+num);
        num.clear();
        System.out.println(num);
    }
}
