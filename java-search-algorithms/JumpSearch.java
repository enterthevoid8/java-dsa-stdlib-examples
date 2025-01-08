public class JumpSearch {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        int target = 30;
        int result = jumpSearch(array, target);
        System.out.println("Element found at index: " + result);
    }

    public static int jumpSearch(int[] array, int target) {
        int n = array.length;
        int step = (int) Math.sqrt(n);

        int prev = 0;
        while (array[Math.min(step, n) - 1] < target) {
            prev = step;
            step += (int) Math.sqrt(n);
            if (prev >= n) {
                return -1; // Not found
            }
        }

        for (int i = prev; i < Math.min(step, n); i++) {
            if (array[i] == target) {
                return i; // Found
            }
        }

        return -1; // Not found
    }
}
