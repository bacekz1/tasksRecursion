public class Task1 {
    public static void main(String[] args) {
        //print num from 1 to 100
        recursion(100);
    }

    static void recursion(int start) {
        if (start == 0) {
            return;
        }
        recursion(start - 1);
        System.out.println(start);
    }
}
