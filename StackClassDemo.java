import java.util.Stack;

public class StackClassDemo {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        System.out.println("Stack: "+s);
        System.out.println("Top: "+s.peek());
        int poppedElement = s.pop();
        System.out.println("Popped: "+poppedElement);
        System.out.println("Updated stack: "+s);
        System.out.println(s.isEmpty());
        System.out.println(s.search(10));
        System.out.println(s.search(20));
        System.out.println(s.search(150));
    }
}
