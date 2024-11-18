import java.util.Map;
import java.util.TreeMap;

public class StringCompressor {
    public static void main(String[] args) {
        String input = "a2b1a3c2b2";
        String compressed = compressString(input);
        System.out.println("Compressed String: " + compressed);
    }

    public static String compressString(String s) {
        Map<Character, Integer> frequencyMap = new TreeMap<>();

        for (int i = 0; i < s.length(); i += 2) {
            char character = s.charAt(i);
            int frequency = Character.getNumericValue(s.charAt(i + 1));
            frequencyMap.put(character, frequencyMap.getOrDefault(character, 0) + frequency);
        }

        StringBuilder compressed = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            compressed.append(entry.getKey()).append(entry.getValue());
        }

        return compressed.toString();
    }
}
