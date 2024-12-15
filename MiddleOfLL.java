import java.util.LinkedList;

public class MiddleOfLL {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(5);
        ll.add(7);
        ll.add(1);
        ll.add(7);
        System.out.print("ll: "+ll+"\n");
        int s = ll.size();
        System.out.println("Size of ll: "+s);
        if(s/2!=0){
            System.out.println("Middle of ll: "+ll.get(s/2));
            System.exit(0);
        }
        else{
            System.out.println("Middle of ll: "+ll.get(s/2));
            System.exit(0);
        }
    }
}
