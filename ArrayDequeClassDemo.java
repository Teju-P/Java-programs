import java.util.ArrayDeque;

public class ArrayDequeClassDemo {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();
        adq.push(10); //[10]
        adq.add(40); //[10,40]
        adq.push(10); //[10,10,40]
        adq.add(57); //[10,10,40,57]
        adq.push(5); //[5,10,10,40,57]
        adq.add(7); //[5,10,10,40,57,7]
        System.out.println("adq initially: "+adq);
        System.out.println("Popped: "+adq.pop());
        System.out.println("adq: "+adq);
        System.out.println("Polled: "+adq.poll());
        System.out.println("adq: "+adq);
        System.out.println("Removing: "+adq.remove());
        System.out.println("adq here is : "+adq); //[40, 57, 7]
        adq.addFirst(13); //[13,40, 57, 7]
        adq.addLast(153); //[13,40, 57, 7,153]
        adq.push(67); //[67,13,40, 57, 7,153]
        adq.push(1); //[1,67,13,40, 57, 7,153]
        adq.offer(578); //[1,67,13,40, 57, 7,153,578]
        System.out.println("adq: "+adq);
        System.out.println("get first: "+adq.getFirst());
        System.out.println("get last: "+adq.getLast());
        System.out.println("peek: "+adq.peek());
        System.out.println("pop(): "+adq.pop());
        System.out.println("peek: "+adq.peek());
        System.out.println("poll(): "+adq.poll());
        while(adq.peek()!=null){
            System.out.print(adq.poll()+" ");
        }System.out.println();
        System.out.println(adq.isEmpty());
    }
}
