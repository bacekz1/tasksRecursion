public class FibonacciTailRecursion {
    public static void main(String[] args) {
        //The First 20 Fibonacci numbers are:
        // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181.
//        System.out.println(fibbo(80));
        System.out.println(fibbo(15));
    }

    static long fibbo(int a) {
//        if (a == 0 || a == 1) {
//            return a;
//        }
//        return fibbo(a - 1) + fibbo(a - 2);
        return tailRecursion(a, 0, 1);
    }

    static long tailRecursion(int a, long b, long c) {

        if (a == 0){
            return b;
        }
        if (a == 1){
            return c;
        }
        return tailRecursion(a -1, c, c+b);
    }
}
