class NewThread implements Runnable{
    Thread t;
    String name;
    NewThread(String n){
        name = n;
        t = new Thread(this, n);
        System.out.println("Created "+t);
        t.start();
    }
    @Override
    public void run() {
        try {
            for(int i=5;i>0;i--){
                System.out.println(t.getName()+" : "+i);
                Thread.sleep(500);
            }
        } catch (Exception e) {
            System.out.println("Caught exception inside NewThread: "+e);
        }
        System.out.println("Exiting "+t.getName());
    }
}

public class AliveAndJoinThreadMethodsDemo {
    public static void main(String[] args) {
        NewThread t1 = new NewThread("One");
        NewThread t2 = new NewThread("Two");
        NewThread t3 = new NewThread("Three");
        System.out.println("Is t1 ALIVE? - "+t1.t.isAlive());
        System.out.println("Is t1 ALIVE? - "+t2.t.isAlive());
        System.out.println("Is t1 ALIVE? - "+t3.t.isAlive());
        try {
            System.out.println("Waiting for child thread to finish");
            t1.t.join();
            t2.t.join();
            t3.t.join();
            for(int i=5;i>0;i--){
                System.out.println("Main : "+i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println("Exception occured inside main: "+e);
        }
        System.out.println("Exiting main thread");
        System.out.println("Is t1 ALIVE? - "+t1.t.isAlive());
        System.out.println("Is t1 ALIVE? - "+t2.t.isAlive());
        System.out.println("Is t1 ALIVE? - "+t3.t.isAlive());
    }
}
