import java.util.Arrays;

public class ExponentialSearch {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        int target = 30;
        int result = exponentialSearch(array, target);
        System.out.println("Element found at index: " + result);
    }

    public static int exponentialSearch(int[] array, int target) {
        if (array[0] == target) return 0;

        int range = 1;
        while (range < array.length && array[range] <= target) {
            range *= 2; // Exponentially increase the range
        }

        return Arrays.binarySearch(array, range / 2, Math.min(range, array.length), target);
    }
}
