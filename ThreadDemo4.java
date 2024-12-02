class NewThread implements Runnable{
    String name;
    NewThread(String n){
        name = n;
        Thread t = new Thread(this, name);
        System.out.println("CT: "+t);
        t.start();
    }
    public void run(){
        try {
            for(int i =5;i>0;i--){
                System.out.println(name+": "+i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(name+" exiting");
    }
    
}

public class ThreadDemo4 {
    public static void main(String[] args) {
        new NewThread("One");
        new NewThread("Two");
        new NewThread("Three");
        try {
            Thread.sleep(10000);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Exiting MT");
    }
}
