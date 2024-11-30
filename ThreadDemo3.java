class NewThread extends Thread{
    NewThread(){
        super("Demo Thread"); // same as new Thread(String name)
        System.out.println("Child thread: "+this);
        start();
    }
    public void run(){
        try {
            for(int i=5;i>0;i--){
                System.out.println("CT: "+i);
                Thread.sleep(500);
            }
        } catch (Exception e) {
            System.out.println("Exception inside child thread: "+e);
        }
        System.out.println("Child thread terminating");
    }
}

public class ThreadDemo3 {
    public static void main(String[] args) {
        new NewThread();
        try {
            for(int i=5;i>0;i--){
                System.out.println("MT: "+i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println("Exception inside main thread: "+e);
        }  
        System.out.println("Main thread terminating");
    }
}
