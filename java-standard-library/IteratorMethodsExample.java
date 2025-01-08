import java.util.ArrayList;
import java.util.Iterator;

public class IteratorMethodsExample {
    public static void main(String[] args) {
        // Create an ArrayList with some elements
        ArrayList<String> list = new ArrayList<>();
        list.add("Alice");
        list.add("Bob");
        list.add("Charlie");
        list.add("Diana");

        // Get an Iterator for the list
        Iterator<String> iterator = list.iterator();

        // 1. hasNext() - Check if there are more elements to iterate over
        System.out.println("Iterating over the list:");
        while (iterator.hasNext()) { // Checks if there is a next element
            // 2. next() - Retrieve the next element
            String element = iterator.next();
            System.out.println("Next element: " + element);

            // 3. remove() - Remove the element if it meets a condition
            if (element.startsWith("C")) {
                System.out.println("Removing element: " + element);
                iterator.remove(); // Removes the last element returned by next()
            }
        }

        // Print the modified list
        System.out.println("\nModified list after iteration: " + list);
    }
}
