public class BinarySearchRecursive {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        int target = 30;
        int result = binarySearch(array, 0, array.length - 1, target);
        System.out.println("Element found at index: " + result);
    }

    public static int binarySearch(int[] array, int left, int right, int target) {
        if (left > right) {
            return -1; // Not found
        }

        int mid = left + (right - left) / 2;

        if (array[mid] == target) {
            return mid; // Found
        } else if (array[mid] < target) {
            return binarySearch(array, mid + 1, right, target); // Search right half
        } else {
            return binarySearch(array, left, mid - 1, target); // Search left half
        }
    }
}
