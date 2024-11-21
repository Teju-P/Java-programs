interface Animal{
    //Interface can only have abstract methods. Variables in an interface are public, static and final.
    int weight = 200;
    public void sleep(); //No body - abstract methods only - by default public.
}

class Cat implements Animal{
    //We can implement multiple interfaces but can't extend multiple classes. Java doesn't support muliple inheritance.
    public void sleep(){
        System.out.println("Purr...");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Cat c = new Cat();
        System.out.println("Cat weighs "+Animal.weight+" pounds."); // weight is public, static and final. So no need to use obj. to access static variable. 
        int new_weight = Animal.weight+100;
        System.out.println("New weight: "+new_weight);
        c.sleep();
    }
}
