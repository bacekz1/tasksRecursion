public class ReturnLandHChar {
    public static void main(String[] args) {
        String test = "lalsfdn alsfjnalf";
        System.out.println(solution(test));
    }

    static String solution(String a) {
       return tailRecursion(a, a.charAt(0), a.charAt(0), a.codePointAt(0), a.codePointAt(0), 0);
    }

    static String tailRecursion(String a, char low, char high, int l, int h, int startIndex) {
        if (startIndex == a.length()) {
            return String.format("lowest char is %s. Highest char is %s", low, high);
        }
        if (a.codePointAt(startIndex) > h) {
            h = a.codePointAt(startIndex);
            high = a.charAt(startIndex);
        }

        if (a.codePointAt(startIndex) < l) {
            l = a.codePointAt(startIndex);
            low = a.charAt(startIndex);
        }
        return tailRecursion(a, low, high, l, h, startIndex + 1);
    }
}
