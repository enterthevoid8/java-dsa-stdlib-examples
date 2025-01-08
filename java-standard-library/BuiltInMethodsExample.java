import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.file.*;
import java.util.*;
import java.util.regex.*;
import java.util.stream.Collectors;

public class BuiltInMethodsExample {
    public static void main(String[] args) throws Exception {
        // ********** String Methods **********
        String str = "Hello, World!";
        System.out.println("toUpperCase(): " + str.toUpperCase());
        System.out.println("toLowerCase(): " + str.toLowerCase());
        System.out.println("substring(0, 5): " + str.substring(0, 5));
        System.out.println("charAt(7): " + str.charAt(7));
        System.out.println("contains('World'): " + str.contains("World"));
        System.out.println("trim(): " + "   Hello   ".trim());
        System.out.println("replace('o', '0'): " + str.replace('o', '0'));

        // ********** Math Methods **********
        System.out.println("Math.max(10, 20): " + Math.max(10, 20));
        System.out.println("Math.sqrt(16): " + Math.sqrt(16));
        System.out.println("Math.random(): " + Math.random());

        // ********** Array Methods **********
        int[] array = {5, 2, 8, 4};
        System.out.println("Arrays.toString(): " + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("Arrays.sort(): " + Arrays.toString(array));

        // ********** Collections Framework **********
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("list.contains(3): " + list.contains(3));
        Collections.reverse(list);
        System.out.println("Collections.reverse(): " + list);

        // ********** File and Input/Output **********
        Path filePath = Paths.get("example.txt");
        Files.writeString(filePath, "Hello, File!");
        System.out.println("Files.readString(): " + Files.readString(filePath));
        Files.delete(filePath);

        // ********** Optional **********
        Optional<String> optional = Optional.of("Value");
        System.out.println("optional.orElse(): " + optional.orElse("Default"));

        // ********** Stream API **********
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        List<String> filteredNames = names.stream()
                                          .filter(name -> name.startsWith("A"))
                                          .collect(Collectors.toList());
        System.out.println("Stream API filter(): " + filteredNames);

        // ********** Regex Methods **********
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher("12345");
        System.out.println("Regex matches(): " + matcher.matches());

        // ********** Reflection API **********
        Class<?> clazz = String.class;
        System.out.println("Class name: " + clazz.getName());
        System.out.println("Declared methods: " + Arrays.toString(clazz.getDeclaredMethods()));

        // ********** System Methods **********
        System.out.println("System.currentTimeMillis(): " + System.currentTimeMillis());

        // ********** Scanner Methods **********
        Scanner scanner = new Scanner("12345\nAlice\n");
        System.out.println("Scanner.nextInt(): " + scanner.nextInt());
        System.out.println("Scanner.nextLine(): " + scanner.nextLine());
        scanner.close();

        // ********** BigInteger and BigDecimal **********
        BigInteger bigInt = new BigInteger("12345678901234567890");
        BigDecimal bigDec = new BigDecimal("12345.6789");
        System.out.println("BigInteger: " + bigInt);
        System.out.println("BigDecimal: " + bigDec);
    }
}
