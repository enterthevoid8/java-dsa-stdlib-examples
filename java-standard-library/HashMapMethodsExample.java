import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;

public class HashMapMethodsExample {
    public static void main(String[] args) {
        // Initialize a HashMap
        HashMap<Integer, String> map = new HashMap<>();

        // 1. put()
        map.put(1, "Alice");
        map.put(2, "Bob");
        map.put(3, "Charlie");
        System.out.println("After put(): " + map);

        // 2. putIfAbsent()
        map.putIfAbsent(3, "David"); // Key 3 already exists
        map.putIfAbsent(4, "Eve"); // Key 4 does not exist
        System.out.println("After putIfAbsent(): " + map);

        // 3. get()
        System.out.println("Value for key 2: " + map.get(2)); // Bob

        // 4. getOrDefault()
        System.out.println("Value for key 5 (default): " + map.getOrDefault(5, "Unknown")); // Unknown

        // 5. containsKey()
        System.out.println("Contains key 3? " + map.containsKey(3)); // true

        // 6. containsValue()
        System.out.println("Contains value 'Eve'? " + map.containsValue("Eve")); // true

        // 7. remove()
        map.remove(1);
        System.out.println("After remove(key 1): " + map);

        // 8. replace()
        map.replace(2, "Bob", "Bobby");
        System.out.println("After replace(): " + map);

        // 9. replaceAll()
        map.replaceAll((key, value) -> value.toUpperCase());
        System.out.println("After replaceAll(): " + map);

        // 10. size()
        System.out.println("Size of the map: " + map.size()); // 3

        // 11. isEmpty()
        System.out.println("Is map empty? " + map.isEmpty()); // false

        // 12. clear()
        HashMap<Integer, String> tempMap = new HashMap<>(map);
        tempMap.clear();
        System.out.println("After clear(): " + tempMap); // Empty map

        // 13. clone()
        HashMap<Integer, String> clonedMap = (HashMap<Integer, String>) map.clone();
        System.out.println("After clone(): " + clonedMap);

        // 14. compute()
        map.compute(2, (key, value) -> value + " Updated");
        System.out.println("After compute(): " + map);

        // 15. computeIfAbsent()
        map.computeIfAbsent(5, key -> "New Entry");
        System.out.println("After computeIfAbsent(): " + map);

        // 16. computeIfPresent()
        map.computeIfPresent(3, (key, value) -> value + " Updated");
        System.out.println("After computeIfPresent(): " + map);

        // 17. merge()
        map.merge(3, "Merged Value", (oldValue, newValue) -> oldValue + " & " + newValue);
        map.merge(6, "New Value", (oldValue, newValue) -> oldValue + " & " + newValue); // No old value
        System.out.println("After merge(): " + map);

        // 18. entrySet()
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        System.out.println("Entry Set: " + entries);

        // 19. forEach()
        System.out.println("Using forEach():");
        map.forEach((key, value) -> System.out.println(key + ": " + value));

        // 20. keySet()
        Set<Integer> keys = map.keySet();
        System.out.println("Key Set: " + keys);

        // 21. values()
        Collection<String> values = map.values();
        System.out.println("Values: " + values);

        // 22. putAll()
        HashMap<Integer, String> anotherMap = new HashMap<>();
        anotherMap.put(7, "New Guy");
        anotherMap.put(8, "Another Guy");
        map.putAll(anotherMap);
        System.out.println("After putAll(): " + map);
    }
}
