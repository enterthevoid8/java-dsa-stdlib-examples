public class LinearSearch {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        int target = 30;
        int result = linearSearch(array, target);
        System.out.println("Element found at index: " + result);
    }

    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // Found
            }
        }
        return -1; // Not found
    }
}
