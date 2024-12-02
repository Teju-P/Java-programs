class NewThread implements Runnable{
    String name;
    Thread t;
    NewThread(String n){
        name = n;
        t = new Thread(this,name);
        System.out.println("CT: "+name);
        t.start();
    }
    public void run(){
        try{
            for(int i =5;i>0;i--){
                System.out.println(name+": "+i);
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){
            System.out.println(e);
        }
        System.out.println("Exiting "+name);
    }
}

public class ThreadDemo5 {
    public static void main(String[] args) {
        NewThread n1 = new NewThread("One");
        NewThread n2 = new NewThread("Two");
        NewThread n3 = new NewThread("Three");
        System.out.println("One is alive? : "+n1.t.isAlive());
        System.out.println("Two is alive? : "+n2.t.isAlive());
        System.out.println("Three is alive? : "+n3.t.isAlive());
        try {
            System.out.println("Inside main thread. Waiting for CT to terminate...");
            n1.t.join();
            n2.t.join();
            n3.t.join();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("One is alive? : "+n1.t.isAlive());
        System.out.println("Two is alive? : "+n2.t.isAlive());
        System.out.println("Three is alive? : "+n3.t.isAlive());
        System.out.println("Exiting MT");
    }
}
