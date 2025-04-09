package exercise;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// BEGIN
public class App {
    public static void swapKeyValue(KeyValueStorage storage) {
        Map<String, String> data = storage.toMap();

        for (var key : data.keySet()) {
            storage.unset(key);
        }

        for (var current : data.entrySet()) {
            String oldKey = current.getKey();
            String oldValue = current.getValue();
            storage.set(oldValue, oldKey);
        }

    }
}
// END
