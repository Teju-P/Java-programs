public class ThrowsDemo {

    static void throwOne() throws IllegalAccessException{
        System.out.println("Inside throwOne()");
        throw new IllegalAccessException("Demo");
    }
    public static void main(String[] args) {
        try {
            throwOne();
        } catch (Exception e) {
            System.out.println("Caught exception: "+e);
        }
    }
}
