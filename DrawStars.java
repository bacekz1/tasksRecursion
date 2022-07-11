public class DrawStars {
    public static void main(String[] args) {
        int a = 5;
        recursion(a,a);
    }
    static void recursion (int num, int spaces){
        if (num==0){
            return;
        }
        recursion(num-1,spaces);
        spaces(spaces-num);
        timesRecursion((num*2)-1);
        System.out.println();

    }
    static void timesRecursion (int times){
        if (times == 0){
            return;
        }
        System.out.print("*");
        timesRecursion(times-1);
    }
    static void spaces (int spaces){
        if (spaces == 0){
            return;
        }
        System.out.print(" ");
        spaces(spaces-1);
    }
}
