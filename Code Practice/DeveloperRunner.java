
class Developer {
    private int age;
    String name;
    Developer(int a, String s){
        age = a;
        name = s;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }  
    public void writeCode(){
        System.out.println(name+"writes code.");
    } 
    public void drinkCoffee(){
        System.out.println(name+" likes to drink coffee and solve quadratic equations.");
    }
}

public class DeveloperRunner {
    public static void main(String[] args) {
        Developer d = new Developer(22, "Samuel");
        System.out.println("Name = "+d.name+"\nAge = "+d.getAge());
        d.writeCode();
        d.drinkCoffee();
    }
}
