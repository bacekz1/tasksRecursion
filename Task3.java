public class Task3 {

    public static void main(String[] args) {
        recursion(-10);
    }
    static void recursion (int start){
        if (start%2 !=0){
            System.out.println(start);
        }
        if (start == 10){
            return;
        }
        recursion(start+1);
    }
}
