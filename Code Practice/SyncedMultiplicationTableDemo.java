class Tables{
    public /*synchronized*/ void displayTables(int num){
        for(int i=1;i<11;i++){
            System.out.print(num*i+" ");
        }System.out.println();
    }
}

class TablesCaller implements Runnable{
    int num;
    Tables tab;
    Thread t;
    String name;
    TablesCaller(Tables ob,String s,int n){
        num = n;
        tab = ob;
        name = s;
        t = new Thread(this,name);
        t.start();
    }
    public void run(){
        synchronized(tab){
            try {
                tab.displayTables(num);
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("Caught exception: "+e);
            }
        }
    }
    
}

public class SyncedMultiplicationTableDemo {
    public static void main(String[] args) {
        Tables tb = new Tables();
        TablesCaller tc1 = new TablesCaller( tb,"tc1", 12);
        TablesCaller tc2 = new TablesCaller( tb,"tc2", 15);
    }
}
