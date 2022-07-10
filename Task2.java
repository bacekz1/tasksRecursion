public class Task2 {

    public static void main(String[] args) {
        //print num from -20 to 100;
        recursion(-20);
    }
    static void recursion (int start){
        System.out.println(start);
        if (start >=100){
            return;
        }
        recursion(start +1);
    }
}
