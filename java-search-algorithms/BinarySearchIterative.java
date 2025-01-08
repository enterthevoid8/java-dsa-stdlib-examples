public class BinarySearchIterative {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        int target = 30;
        int result = binarySearch(array, target);
        System.out.println("Element found at index: " + result);
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
