class CallMe{
    public synchronized  void call(String msg){
        System.out.print("[ "+msg);
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(" ]");
    }
}

class Caller implements Runnable{
    CallMe cm;
    String m;
    Thread t;
    Caller(CallMe c, String m){
        cm = c;
        this.m = m;
        t = new Thread(this);
        t.start();
    }
    public void run(){
        synchronized (cm) {
            cm.call(m);
            cm.notify();
        }
    }
}

public class InterThreadComm {
    public static void main(String[] args) {
        CallMe callMe = new CallMe();
        Caller c1 = new Caller(callMe, "Hello");
        Caller c2 = new Caller(callMe, "Teju");
        Caller c3 = new Caller(callMe, "P");
        try {
            synchronized  (callMe) { 
                c1.t.join(); 
                callMe.wait(); 
                c2.t.join(); 
                callMe.wait(); 
                c3.t.join(); 
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
