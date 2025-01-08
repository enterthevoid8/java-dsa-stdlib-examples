import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListMethodsExample {
    public static void main(String[] args) {
        // Initializing the ArrayList
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Alice", "Bob", "Charlie", "Alice"));

        // 1. add()
        list.add("Diana");
        System.out.println("After add(): " + list); // Adds "Diana"

        // 2. addAll()
        list.addAll(Arrays.asList("Eve", "Frank"));
        System.out.println("After addAll(): " + list); // Adds multiple items

        // 3. clear()
        ArrayList<String> temp = new ArrayList<>(list);
        temp.clear();
        System.out.println("After clear(): " + temp); // Empty list

        // 4. clone()
        ArrayList<String> clonedList = (ArrayList<String>) list.clone();
        System.out.println("After clone(): " + clonedList);

        // 5. contains()
        System.out.println("Contains 'Alice': " + list.contains("Alice")); // true

        // 6. ensureCapacity()
        list.ensureCapacity(20);
        System.out.println("Capacity ensured for at least 20 elements.");

        // 7. forEach()
        System.out.println("Using forEach():");
        list.forEach(System.out::println);

        // 8. get()
        System.out.println("Get item at index 1: " + list.get(1)); // Bob

        // 9. indexOf()
        System.out.println("Index of 'Alice': " + list.indexOf("Alice")); // 0

        // 10. isEmpty()
        System.out.println("Is list empty? " + list.isEmpty()); // false

        // 11. iterator()
        Iterator<String> iterator = list.iterator();
        System.out.println("Using iterator:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 12. lastIndexOf()
        System.out.println("Last index of 'Alice': " + list.lastIndexOf("Alice")); // 3

        // 13. listIterator()
        ListIterator<String> listIterator = list.listIterator();
        System.out.println("Using listIterator:");
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        // 14. remove()
        list.remove("Alice");
        System.out.println("After remove('Alice'): " + list);

        // 15. removeAll()
        list.removeAll(Arrays.asList("Bob", "Charlie"));
        System.out.println("After removeAll(): " + list);

        // 16. removeIf()
        list.removeIf(name -> name.startsWith("D"));
        System.out.println("After removeIf(): " + list);

        // 17. replaceAll()
        list.replaceAll(name -> name.toUpperCase());
        System.out.println("After replaceAll(): " + list);

        // 18. retainAll()
        list.retainAll(Arrays.asList("EVE", "FRANK"));
        System.out.println("After retainAll(): " + list);

        // 19. set()
        list.set(0, "EVELYN");
        System.out.println("After set(): " + list);

        // 20. size()
        System.out.println("Size of list: " + list.size()); // 2

        // 21. sort()
        list.sort(String::compareTo);
        System.out.println("After sort(): " + list);

        // 22. spliterator()
        System.out.println("Using spliterator:");
        list.spliterator().forEachRemaining(System.out::println);

        // 23. subList()
        ArrayList<String> originalList = new ArrayList<>(Arrays.asList("Alice", "Bob", "Charlie", "Diana", "Eve", "Frank"));
        List<String> subList = originalList.subList(1, 4);
        System.out.println("Sublist: " + subList);

        // 24. toArray()
        Object[] array = list.toArray();
        System.out.println("toArray(): " + Arrays.toString(array));

        // 25. trimToSize()
        originalList.trimToSize();
        System.out.println("After trimToSize(): " + originalList);
    }
}
