import java.util.Iterator;
import java.util.ArrayList;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(10);
        num.add(20);
        num.add(30);
        num.add(40);
        System.out.println("Initially: "+num);
        Iterator<Integer> it = num.iterator();
        System.out.println(it.hasNext());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println("======");
        /*while(it.hasNext()){
            System.out.println(it.next());
        }*/
        while (it.hasNext()) {
            int i = it.next();
            if(i==30){
                it.remove();
            }
        }
        System.out.println(num);
    }
}
