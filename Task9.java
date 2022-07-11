public class Task9 {
    static int max = 99;
    public static void main(String[] args) {
        recursion();

    }
    static void recursion (){
        int tempMax = max;
        int first = (tempMax/100) %10;
        int second = (tempMax/10) %10;
        int third = tempMax %10;

        if (first != second && second != third && first != third ){
            System.out.println(max);
        }

        if(max == 999){
            return;
        }
        max++;
        recursion();
    }
}
