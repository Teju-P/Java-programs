import java.util.HashMap;
import java.util.Collections;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String,String> capCities = new HashMap<>();
        capCities.put("India", "New Delhi");
        capCities.put("England", "London");
        capCities.put("Germany","Brazil");
        capCities.put("USA","Washington DC");
        System.out.println(capCities);
        System.out.println("Capital city of India is "+capCities.get("India"));
        capCities.remove("USA");
        System.out.println(capCities);
        System.out.println(capCities.size()); //3
        for(String s : capCities.keySet()){
            System.out.println(s+" : "+capCities.get(s));
        }
        for(String s : capCities.values()){
            System.out.println(s);
        }
    }
}
