import java.util.PriorityQueue;

public class PriorityQueueClassDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(2);
        System.out.println(pq);
        System.out.println("1st in:  "+pq.peek());
        pq.poll(); //removes 1st element - removes 2.
        System.out.println(pq);
        pq.offer(305);
        pq.offer(4);
        pq.offer(75);
        System.out.println(pq);
        System.out.println("1st in:  "+pq.peek());
        System.out.println("Removing: "+pq.remove());
        System.out.println("After remove() pq is : "+pq);
        System.out.println(pq.remove(50));
        System.out.println("pq after removing specified element 50: "+pq);
        System.out.println("element(): "+pq.element());
    }
}
