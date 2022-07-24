public class Factorial {
    public static void main(String[] args) {

        System.out.println(fac(5));
    }
    static int fac(int a){
        if (a== 1){
            return a;
        }
        return a*fac(a-1);
    }

}
