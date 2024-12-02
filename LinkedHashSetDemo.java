import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(57);
        lhs.add(6);
        lhs.add(860);
        lhs.add(630);
        lhs.add(890);
        lhs.add(27);
        System.out.println("lhs: "+lhs); //not auto sorted
    }
}
