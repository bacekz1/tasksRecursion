import java.util.Scanner;

public class Task10 {
    static int min =10;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        rec(a);
    }
    static void rec (int a){
        if (a % 7 ==0){
            System.out.println(a);
        }
        if (min == a){
            return;
        }
        rec(a-1);
    }
}
