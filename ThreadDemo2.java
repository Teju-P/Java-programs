class NewThread implements Runnable{
    NewThread(){
        Thread t = new Thread(this, "Demo Thread");
        System.out.println("Child thread: "+t);
        t.start();
    }
    public void run(){
        try {
            for(int i=5;i>0;i--){
                System.out.println("Child thread: "+i);
                Thread.sleep(500);
            }
        } catch (Exception e) {
            System.out.println("Exception occurred in child: "+e);
        }
        System.out.println("Exiting child");
    }
}

class ThreadDemo2{
    public static void main(String[] args) {
        new NewThread();
        try{
            for(int i = 5;i>0;i--){
                System.out.println("Main thread: "+i);
                Thread.sleep(1000);
            }
        }catch(Exception e){
            System.out.println("Exception occurred in main: "+e);
        }
        System.out.println("Exiting main");
    }
}
