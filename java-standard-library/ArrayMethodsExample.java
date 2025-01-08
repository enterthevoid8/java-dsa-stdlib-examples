import java.util.Arrays;

public class ArrayMethodsExample {
    public static void main(String[] args) {
        // Sample arrays
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 6};
        int[] array3 = Arrays.copyOf(array1, array1.length);
        int[] array4 = {9, 8, 7, 6, 5};

        // Multidimensional arrays for deepEquals
        int[][] multiArray1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] multiArray2 = {{1, 2, 3}, {4, 5, 6}};

        // compare()
        System.out.println("compare(array1, array2): " + Arrays.compare(array1, array2)); // Negative (array1 < array2)

        // copyOf()
        int[] copiedArray = Arrays.copyOf(array1, 7); // New length is 7
        System.out.println("copyOf(array1, 7): " + Arrays.toString(copiedArray)); // [1, 2, 3, 4, 5, 0, 0]

        // deepEquals()
        System.out.println("deepEquals(multiArray1, multiArray2): " + Arrays.deepEquals(multiArray1, multiArray2)); // true

        // equals()
        System.out.println("equals(array1, array3): " + Arrays.equals(array1, array3)); // true

        // fill()
        Arrays.fill(array4, 0);
        System.out.println("fill(array4, 0): " + Arrays.toString(array4)); // [0, 0, 0, 0, 0]

        // mismatch()
        System.out.println("mismatch(array1, array2): " + Arrays.mismatch(array1, array2)); // 4 (index of first mismatch)

        // sort()
        int[] unsortedArray = {9, 4, 7, 1, 3};
        Arrays.sort(unsortedArray);
        System.out.println("sort(unsortedArray): " + Arrays.toString(unsortedArray)); // [1, 3, 4, 7, 9]

        // length (property, not a method)
        System.out.println("length of array1: " + array1.length); // 5
    }
}
