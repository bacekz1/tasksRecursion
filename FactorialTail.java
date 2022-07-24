public class FactorialTail {
    public static void main(String[] args) {
        System.out.println(fac(5));
    }

    static int fac(int a) {
        return tailFac(a, 1);
    }

    static int tailFac(int a, int result) {
        if (a == 1) {
            return result;
        }
        return tailFac(a - 1, result * a);
    }
}
