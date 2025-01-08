public class ExponentialTime {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fibonacci(n)); // Compute the nth Fibonacci number
    }

    public static int fibonacci(int n) {
        if (n <= 1) return n; // Base case
        return fibonacci(n - 1) + fibonacci(n - 2); // Recursive calls
    }
}
