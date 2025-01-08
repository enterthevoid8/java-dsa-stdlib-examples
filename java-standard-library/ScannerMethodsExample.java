import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ScannerMethodsExample {
    public static void main(String[] args) {
        String input = "true 123 45.67 hello\ntrue 255 78.9 world\nfalse";
        Scanner scanner = new Scanner(input);

        // 1. delimiter()
        System.out.println("Default delimiter: " + scanner.delimiter()); // Default is whitespace

        // 2. hasNext() & next()
        System.out.println("Tokens using hasNext() and next():");
        while (scanner.hasNext()) {
            System.out.println("Next token: " + scanner.next());
        }

        // Reset scanner for further examples
        scanner = new Scanner(input);

        // 3. hasNextBoolean() & nextBoolean()
        if (scanner.hasNextBoolean()) {
            System.out.println("Boolean value: " + scanner.nextBoolean()); // true
        }

        // 4. hasNextInt() & nextInt()
        if (scanner.hasNextInt()) {
            System.out.println("Integer value: " + scanner.nextInt()); // 123
        }

        // 5. hasNextDouble() & nextDouble()
        if (scanner.hasNextDouble()) {
            System.out.println("Double value: " + scanner.nextDouble()); // 45.67
        }

        // 6. findInLine()
        scanner.useDelimiter(Pattern.compile("\\s+")); // Set delimiter to whitespace
        System.out.println("findInLine 'hello': " + scanner.findInLine("hello")); // hello

        // 7. findWithinHorizon()
        scanner = new Scanner(input); // Reset scanner
        System.out.println("findWithinHorizon 'world': " + scanner.findWithinHorizon("world", 100)); // world

        // 8. hasNextLine() & nextLine()
        System.out.println("Lines using hasNextLine() and nextLine():");
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }

        // Reset scanner for additional examples
        scanner = new Scanner(input);

        // 9. useDelimiter()
        scanner.useDelimiter(","); // Set delimiter to comma
        System.out.println("Using custom delimiter (comma):");
        System.out.println("Next token: " + scanner.next()); // true 123 45.67 hello (up to the first comma)

        // 10. useLocale() & locale()
        scanner.useLocale(Locale.US); // Set locale
        System.out.println("Scanner locale: " + scanner.locale()); // US locale

        // 11. hasNextShort() & nextShort()
        if (scanner.hasNextShort()) {
            System.out.println("Short value: " + scanner.nextShort()); // Retrieves a short value
        }

        // 12. radix() & useRadix()
        scanner.useRadix(16); // Set radix to hexadecimal
        System.out.println("Scanner radix: " + scanner.radix()); // 16 (hexadecimal)
        scanner.close();

        // 13. reset()
        scanner = new Scanner(input).useDelimiter(",").useLocale(Locale.US); // Custom configurations
        System.out.println("Before reset, delimiter: " + scanner.delimiter());
        scanner.reset();
        System.out.println("After reset, delimiter: " + scanner.delimiter()); // Resets to default delimiter

        // 14. close()
        scanner.close();
        System.out.println("Scanner closed.");
    }
}
