public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 5, 6};
        selectionSort(array);
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static void selectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
}
