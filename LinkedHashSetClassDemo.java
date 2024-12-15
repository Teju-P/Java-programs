import java.util.LinkedHashSet;
import java.util.Collections;

public class LinkedHashSetClassDemo {
    public static void main(String[] args) {
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(57);
        lhs.add(6);
        lhs.add(860);
        lhs.add(630);
        lhs.add(6);
        lhs.add(890);
        lhs.add(27);
        System.out.println("lhs: "+lhs); //not auto sorted
        System.out.println("Size = "+lhs.size());
        Collections.sort(lhs);
    }
}
