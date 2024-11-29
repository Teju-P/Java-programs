public class ManualException {
    public static void main(String[] args) {
        try {
            throw new NullPointerException("Demo");
        } catch (Exception e) {
            System.out.println("Caught exception: "+e);
        }
    }
}
