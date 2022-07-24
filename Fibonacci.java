public class Fibonacci {
    static long[] fibonacciCache;

    public static void main(String[] args) {
        //The First 20 Fibonacci numbers are:
        // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181.
        int n = 15;
        fibonacciCache = new long[n + 1];

        System.out.println(recursionFibonacci(n));
    }

    static long recursionFibonacci(int num) {

        if (num < 2) {
            return num;
        }
        if (fibonacciCache[num] != 0) {
            return fibonacciCache[num];
        }
        fibonacciCache[num] = recursionFibonacci(num - 1) + recursionFibonacci(num - 2);

        return recursionFibonacci(num - 1) + recursionFibonacci(num - 2);
    }
}
