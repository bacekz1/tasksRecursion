public class Task5 {
    public static void main(String[] args) {
        rec(6, 5);
    }

    static void rec(int start, int num) {
        if (num == 0){
            return;
        }
        System.out.println(start);
        start+=3;
            rec(start, num - 1);
        }
}
