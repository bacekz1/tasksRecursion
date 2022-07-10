import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;
//        for (int i = a; i <=b ; i++) {
//            if (Math.pow(i,2) % 3 ==0){
//                System.out.println("skip");
//                continue;
//            }
//            sum += Math.pow(i,2);
//            if (sum>200){
//                System.out.println("Sum is above 200");
//                break;
//            }
//            System.out.println(Math.pow(i,2));
//        }
        rec(a,b,sum);
    }
    static void rec (int start,int stop, int sum){
        if (Math.pow(start,2)% 3 ==0){
            System.out.println("skip");
        }
        else {
            sum+= Math.pow(start,2);
            if (sum>200){
                System.out.println("Sum is above 200");
                return;
            }
            System.out.println(Math.pow(start,2));
        }
        if (start == stop){
            return;
        }
        rec(start+1,stop, sum);
    }
}
