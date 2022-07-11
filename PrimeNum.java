import java.util.Scanner;


public class PrimeNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int start = 2;
        recursion(num,start);
    }

    static void recursion(int num, int start) {
        if (num % start == 0){
            System.out.println("ne");
            return;
        }
        if (num/2 == start){
            System.out.println("da");
            return;
        }
        recursion(num,start+1);
    }
}
