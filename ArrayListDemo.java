import java.util.ArrayList;
import java.util.Collections;

class ArrayListDemo{
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println("cars: "+cars);
        cars.add(0, "Benz");
        System.out.println("After adding Benzo to index 0: "+cars);
        System.out.println(cars.get(0)); //Benz
        System.out.println(cars.get(2)); //BMW
        cars.set(0, "Audi"); //Changes Benzo at index 0 to Audi.
        System.out.println("After set(0,\"Audi\"): "+cars);
        System.out.println("cars.contains(\"Ford\"): "+cars.contains("Ford"));
        System.out.println("cars.contains(\"Toyota\"): "+cars.contains("Toyota"));
        cars.remove("Ford"); //remove using object or item.
        cars.remove(0); // remove using index.
        System.out.println("After removing Ford and element at index 0: "+cars);
        System.out.println("Size of cars: "+cars.size()); //3
        System.out.println("cars.indexOf(\"BMW\"): "+cars.indexOf("BMW")); // returns index of BMW. i.e., 1. 
        System.out.println("cars.indexOf(\"Ford\"): "+cars.indexOf("Ford")); //If not found, returns -1.
        cars.clear(); //removes all elements from the ArrayList cars.
        System.out.println("After clear(): "+cars);
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println("Reinitialized cars: "+cars);
        System.out.println("---Using for loop---");
        for(int i=0;i<cars.size();i++){
            System.out.println(i+" : "+cars.get(i));
        }
        System.out.println("---Using for-each loop---");
        for(String s : cars){
            System.out.println(cars.indexOf(s)+" : "+s);
        }
        System.out.println("Before sorting: "+cars);
        Collections.sort(cars);
        System.out.println("After sorting: "+cars);
        Collections.sort(cars,Collections.reverseOrder());
        System.out.println("After sorting in reverse order: "+cars);
    }
}