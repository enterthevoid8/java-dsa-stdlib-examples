import java.io.*;
import java.util.*;

public class ErrorsAndExceptionsExample {
    public static void main(String[] args) {
        // ArithmeticError
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticError: " + e.getMessage());
        }

        // ArrayIndexOutOfBoundsException
        try {
            int[] array = {1, 2, 3};
            System.out.println(array[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        // ClassNotFoundException
        try {
            Class.forName("NonExistentClass");
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException: " + e.getMessage());
        }

        // ConcurrentModificationException
        try {
            List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C"));
            for (String item : list) {
                if (item.equals("B")) {
                    list.remove(item);
                }
            }
        } catch (ConcurrentModificationException e) {
            System.out.println("ConcurrentModificationException: " + e.getMessage());
        }

        // FileNotFoundException
        try {
            FileReader file = new FileReader("nonexistentfile.txt");
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException: " + e.getMessage());
        }

        // InputMismatchException
        try (Scanner scanner = new Scanner("hello")) {
            int number = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException: " + e.getMessage());
        }

        // InterruptedException
        try {
            Thread.sleep(100);
            Thread.currentThread().interrupt();
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println("InterruptedException: " + e.getMessage());
        }

        // NegativeArraySizeException
        try {
            int[] negativeArray = new int[-1];
        } catch (NegativeArraySizeException e) {
            System.out.println("NegativeArraySizeException: " + e.getMessage());
        }

        // NullPointerException
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage());
        }

        // NumberFormatException
        try {
            int num = Integer.parseInt("ABC");
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: " + e.getMessage());
        }

        // StringIndexOutOfBoundsException
        try {
            String str = "Hello";
            char ch = str.charAt(10);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException: " + e.getMessage());
        }

        // IllegalArgumentException
        try {
            Thread.sleep(-1);
        } catch (IllegalArgumentException | InterruptedException e) {
            System.out.println("IllegalArgumentException: " + e.getMessage());
        }

        // IllegalStateException
        try {
            Iterator<String> iterator = Collections.emptyIterator();
            iterator.remove();
        } catch (IllegalStateException e) {
            System.out.println("IllegalStateException: " + e.getMessage());
        }
    }
}
