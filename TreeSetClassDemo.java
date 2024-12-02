import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetClassDemo {
    public static void main(String[] args) {
        TreeSet<Character> ts = new TreeSet<>();
        ts.add('a');
        ts.add('t');
        ts.add('a'); //duplicate element
        ts.add('b');
        ts.add('l');
        ts.add('e');
        System.out.println("ts: "+ts);
        System.out.println("first(): "+ts.first());
        System.out.println("last(): "+ts.last());

        SortedSet<Character> ss = ts.headSet('h');
        System.out.println("ss (all chars in ts that are <'h'): "+ss);

        ss = ts.tailSet('h');
        System.out.println("ss (all chars in ts that are >='h'): "+ss);

        ss = ts.subSet('e','t'); //[e,t)
        System.out.println("ss (all chars in ts that are in between [e,t)): "+ss);
        
    }   
}
