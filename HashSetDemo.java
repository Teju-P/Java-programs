import java.util.HashSet;
import java.util.Collections;

public class HashSetDemo {
    public static void main(String args[]){
        HashSet<Integer> num = new HashSet<>();
        num.add(10);
        num.add(20);
        num.add(30);
        num.add(10);
        System.out.println(num);
        System.out.println(num.contains(40));
        System.out.println(num.contains(10));
        num.remove(10);
        System.out.println(num);
        System.out.println("SIZE="+num.size());
        num.clear();
        System.out.println(num);

    }
}
