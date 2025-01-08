import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 5, 6};
        heapSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void heapSort(int[] array) {
        int n = array.length;

        // Build max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(array, n, i);
        }

        // Extract elements from the heap
        for (int i = n - 1; i > 0; i--) {
            // Move current root to end
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            // Heapify the reduced heap
            heapify(array, i, 0);
        }
    }

    public static void heapify(int[] array, int n, int i) {
        int largest = i; // Root
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && array[left] > array[largest]) {
            largest = left;
        }

        if (right < n && array[right] > array[largest]) {
            largest = right;
        }

        if (largest != i) {
            // Swap
            int temp = array[i];
            array[i] = array[largest];
            array[largest] = temp;

            heapify(array, n, largest);
        }
    }
}
