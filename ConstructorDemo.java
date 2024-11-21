class A {
    int x = 10;
}

class B {
    int x;
    float y;
    B(){
        x=10;
    }
    B(int x){
        this.x = x;
    }
    B(int x, float y){
        this.x=x;
        this.y=y;
    }
    
}

public class ConstructorDemo {
    public static void main(String[] args) {
        A obA = new A(); //empty constructor
        B obB = new B(); // constructor with no parameters
        B obB2 = new B(15); //constructor with 1 param.
        B obB3 = new B(16,23.5f); //constructor with 2 parameters
        System.out.println("A: "+obA.x);
        System.out.println("B: "+obB.x);
        System.out.println("B: "+obB2.x);
        System.out.println("B: "+obB3.x+"  "+obB3.y);
    }
}
