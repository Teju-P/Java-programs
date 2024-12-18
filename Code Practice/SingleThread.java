public class SingleThread {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println(t);
        t.setName("NewThread");
        t.setPriority(1);
        System.out.println(t.getState());
        System.out.println(t);
    }
}
