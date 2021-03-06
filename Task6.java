public class Task6 {
    public static void main(String[] args) {
        int a = 5;
        rec(a, a,a-1);
    }

    static void rec(int a, int times, int printNum) {

        if (a == 0) {
            return;
        }
        nestedRec(times, printNum);
        System.out.println();
        rec(a-1, times, printNum + 2);
    }

    static void nestedRec(int times, int printNum) {
        if (times == 0) {
            return;
        }
        System.out.print(printNum);
        nestedRec(times - 1, printNum);
    }
}
