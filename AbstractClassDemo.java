abstract class Animal{
    //Abstract class can have abstract methods, normal methods and data members.
    public abstract void animalSound(); //abstract class
    void sleep(){
        System.out.println("Zzz...");
    }
}

class Cat extends Animal{
    public void animalSound(){
        System.out.println("Meow");
    }
    void sleep(){
        System.out.println("Purr...");
    }
}

public class AbstractClassDemo {
    public static void main(String[] args) {
        //NOTE: We can't create objects for abstract classes.
        Cat c = new Cat();
        c.animalSound();
        c.sleep();
    }
}
