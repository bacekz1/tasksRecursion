public class CheckArray {

    public static void main(String[] args) {

        int[] arr = {4, 54, 64, 654, 65, 46, 54};
        int sum = 0;
        checkAvg(arr, arr.length, sum);
    }

    static void checkAvg(int[] arr, int arrLength, int sum) {
        if (arrLength == 0) {
            System.out.println(sum > 0 ? "positive" : "negative");
            System.out.println(sum);
            return;
        }

        checkAvg(arr, arrLength - 1, sum + arr[arrLength-1]);
    }


}
