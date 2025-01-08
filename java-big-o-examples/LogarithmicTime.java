import java.util.Arrays;

public class LogarithmicTime {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9};
        int target = 5;
        System.out.println(binarySearch(array, target));
    }

    public static int binarySearch(int[] array, int target) {
        int left = 0, right = array.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == target) {
                return mid; // Found
            } else if (array[mid] < target) {
                left = mid + 1; // Search right half
            } else {
                right = mid - 1; // Search left half
            }
        }
        return -1; // Not found
    }
}
