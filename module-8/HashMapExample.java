
import java.util.HashMap;

public class HashMapExample {

    public static void main(String[] args) {
        // Create a HashMap: Key is String (Country), Value is String (City)
        HashMap<String, String> capitalCities = new HashMap<>();

        // 1. Add items using put()
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");

        // 2. Access an item using get()
        String capital = capitalCities.get("Germany");
        System.out.println("The capital of Germany is: " + capital);

        // 3. Remove an item
        capitalCities.remove("Norway");

        // 4. Check size
        System.out.println("Number of entries: " + capitalCities.size());
    }
}
