class Outer{
    void where(){
        System.out.println("Inside Outer class");
    }
    int x =10;
    class Inner{
        int y=x+10;
        void where(){
            System.out.println("Inside Inner class");
        }
    }
    static class Inner2{
        //int z=x*20;: ERROR: static class can't reference non-static variable.
        int z = new Outer().x * 20;
        void where(){
            System.out.println("Inside Inner2 class");
        }
    }
}

public class InnerClassDemo {
    public static void main(String[] args) {
        System.out.println("Inside main");
        Outer o = new Outer();
        System.out.println(o.x);
        o.where();
        Outer.Inner i = o.new Inner();
        System.out.println(i.y);
        i.where();
        //Outer.Inner2 ii = o.new Inner2();   : ERROR, for static inner class declaring obj. is different.
        Outer.Inner2 ii = new Outer.Inner2();
        System.out.println(ii.z);
        ii.where();
    }    
}
