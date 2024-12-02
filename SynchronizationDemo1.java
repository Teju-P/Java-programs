class CallMe{
    synchronized void call(String msg){
        System.out.print("[ "+msg);
        try{
            Thread.sleep(500);
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println(" ]");
    }
}

class Caller implements Runnable{
    CallMe cm;
    Thread t;
    String m;
    Caller(CallMe cm_obj, String msg){
        cm = cm_obj;
        m = msg;
        t = new Thread(this);
        t.start();
    }
    public void run(){
        cm.call(m);
    }
}

public class SynchronizationDemo1 {
    public static void main(String[] args) {
        CallMe callMe = new CallMe();
        Caller ob1 = new Caller(callMe,"Hello");
        Caller ob2 = new Caller(callMe,"Teju");
        Caller ob3 = new Caller(callMe,"P");
        try {
            ob1.t.join();;
            ob2.t.join();
            ob3.t.join();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
