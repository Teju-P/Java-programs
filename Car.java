class Vehicle{
    protected String brand = "Ford";
    public static void sound(){
        System.out.println("Vroom vroom...");
    }
}

public class Car extends Vehicle {
    private String model = "Mustang";
    public static void main(String[] args) {
        Car obj = new Car();
        System.out.println(obj.brand+" "+obj.model);
        sound();
    }
}