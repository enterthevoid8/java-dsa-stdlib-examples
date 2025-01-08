public class InterpolationSearch {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        int target = 30;
        int result = interpolationSearch(array, target);
        System.out.println("Element found at index: " + result);
    }

    public static int interpolationSearch(int[] array, int target) {
        int low = 0, high = array.length - 1;

        while (low <= high && target >= array[low] && target <= array[high]) {
            if (low == high) {
                if (array[low] == target) return low;
                return -1; // Not found
            }

            int pos = low + ((target - array[low]) * (high - low)) / (array[high] - array[low]);

            if (array[pos] == target) {
                return pos; // Found
            } else if (array[pos] < target) {
                low = pos + 1; // Move right
            } else {
                high = pos - 1; // Move left
            }
        }
        return -1; // Not found
    }
}
