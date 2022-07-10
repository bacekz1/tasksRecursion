import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
//        int sum =0;
//        for (int i = 1; i <= a; i++) {
//            sum+= i;
//        }
//        System.out.println(sum);
        System.out.println(recursion(a));
    }
    static int recursion (int start) {
        if (start == 1) {
            return 1;
        }
        return start + recursion(start - 1);


    }
}
