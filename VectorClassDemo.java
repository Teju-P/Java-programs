import java.util.Vector;

public class VectorClassDemo {
    public static void main(String[] args) {
        Vector <Integer> v = new Vector<>(3,2); // 3 is size, actually the capacity of the vector. 2 is the increment.
        System.out.println("Size = "+v.size()); // prints the total no. of elements present in 'v'.
        System.out.println("Capacity = "+v.capacity()); //prints the total elemets the 'v' can accomodate currently.
        v.add(10);
        v.addElement(20);
        v.add(30);
        v.add(40);
        System.out.println("v: "+v);
        System.out.println("Size = "+v.size()); 
        System.out.println("Capacity = "+v.capacity());
        System.out.println(v.get(0));
        System.out.println(v.isEmpty());
        System.out.println(v.contains(50));
        System.out.println(v.indexOf(20));
        System.out.println(v.firstElement());
        System.out.println(v.lastElement());
        v.set(1, 21);
        System.out.println("New v: "+v);
    }
}
