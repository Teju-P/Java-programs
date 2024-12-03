class Product{
    int price;
    boolean valueSet;
    synchronized public void setPrice(int price){
        while(valueSet){
            try {
                wait();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        this.price = price;
        valueSet = true;
        System.out.println("Price set: "+price);
        notify();
    }
    synchronized public int getPrice(){
        while(!valueSet){
            try{
                wait();
            }catch(Exception e){
                System.out.println(e);
            }
        }
        System.out.println("Got price: "+price);
        valueSet=false;
        notify();
        return price;
    }
}

class Producer implements  Runnable{
    Product pp;
    Producer(Product p){
        this.pp = p;
        new Thread(this,"ProducerThread").start();;
    }
    public void run(){
        int i=0;
        while (i<=10) { 
            pp.setPrice(i++);  
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("Exception Inside Producer: "+e);
            }
        }
    }
}

class Consumer implements Runnable{
    Product pc;
    Consumer(Product p){
        pc = p;
        new Thread(this, "ConsumerThread").start();
    }
    public void run(){
        int i=0;
        while (i<=10) { 
            pc.getPrice();
            i++;
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("Exception Inside Producer: "+e);
            }
        }
    }
}

class ProducerConsumerITCDemo1{
    public static void main(String [] args){
        Product x =new Product();
        new Producer(x);
        new Consumer(x);
        System.out.println("Press 'ctrl+c' to stop the loop");
    }
}