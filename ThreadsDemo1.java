public class ThreadsDemo1 {
    public static void main(String[] args) {
        Thread t = Thread.currentThread(); //Currently main thread is the only thread running, so 't' now holds main thread.
        System.out.println("Current thread: "+t);
        System.out.println("Name of t: "+t.getName());
        System.out.println("Priority of t: "+t.getPriority());
        System.out.println("Group name of t: "+t.getThreadGroup());
        t.setName("My Thread");
        t.setPriority(3);
        System.out.println("Thread t after setting thread name and priority: "+t);
    }
}
