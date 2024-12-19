//Suppose there are 3 objects A, B and C. Deadlock occurs when A is waiting for B, B is waiting for C while C is waiting for A.

class Deadlock implements Runnable{
    Object o1, o2;
    Deadlock(Object ob1, Object ob2){
        o1 = ob1;
        o2 = ob2;
    }
    @Override
    public void run() {
        String tname = Thread.currentThread().getName();
        System.out.println(tname+" is taking control on the lock "+o1);
        synchronized(o1){
            System.out.println(tname+" acquired lock on "+o1);
            work();
            System.out.println(tname+" iz taking control on the lock "+o2);
            synchronized(o2){
                System.out.println(tname+" acquired lock on "+o2); //not executed as o2 is already ALIVE, it needs to terminate to execute this statement.
                work();
            }
            System.out.println(tname+" released lock on "+o2); //not executed
        }
        System.out.println(tname+" released lock on "+o1); //not executed
    }
    void work(){
        try {
            Thread.sleep(10000);
        } catch (Exception e) {
            System.out.println("Caught exception: "+e);
        }
    }
}

public class DeadLockDemo {
    public static void main(String[] args) throws InterruptedException{
        Object obj1 = new Object();
        Object obj2 = new Object();
        Object obj3 = new Object();

        Thread t1 = new Thread(new Deadlock(obj1, obj2),"t1");
        Thread t2 = new Thread(new Deadlock(obj2, obj3),"t2");
        Thread t3 = new Thread(new Deadlock(obj3, obj1),"t3");

        t1.start();
        Thread.sleep(500);
        t2.start();
        Thread.sleep(500);
        t3.start();
    }
}
