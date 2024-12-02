import java.util.TreeMap;
import javax.swing.plaf.basic.BasicTabbedPaneUI;

public class TreeMapClassDemo {
    public static void main(String[] args) {
        TreeMap<String, Double> tm = new TreeMap<>();
        tm.put("Teju", 3434.5);
        tm.put("Vishal", 3245.4);
        tm.put("Kushal", 3432.286);
        tm.put("Verma", 3029.56);
        System.out.println("tm: "+tm);
        System.out.println(tm.firstEntry());
        System.out.println(tm.lastEntry());
        System.out.println(tm.firstKey());
        System.out.println(tm.lastKey());
        for(String s : tm.keySet()){
            System.out.println(s+" :+: "+tm.get(s));
        }
        System.out.println(tm.get("Teju"));
        tm.remove("Vishal");
        System.out.println("Updates tm: "+tm);
        System.out.println("size: "+tm.size());
    }
}