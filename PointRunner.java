public class PointRunner {
    public static void main(String[] args) {
        Point a = new Point(3,4);
        Point b = new Point(1,5);

        System.out.println("A's x = "+a.getX());
        System.out.println("A's y = "+a.getY());
        a.move(1,5);
        System.out.println("After moving:");
        System.out.println("A's x = "+a.getX());
        System.out.println("A's y = "+a.getY());
        System.out.println("a's distance from b: ");
        System.out.println(a.distanceTo(b));
    }
}
