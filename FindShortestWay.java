public class FindShortestWay {

    public static void main(String[] args) {

        /*
        Write a method that by given map of a parking lot and the coordinates of the entrance
        of the parking lot, finds the smallest amount of steps you need to park your car. You can drive
        on squares marked with ' ' (space). A free parking spot is marked with 'F'. Spots that are already
        taken are marked with 'T'. You cannot pass through taken parking spots. The method must
        return an integer value equal to the smallest amount of moves that are needed to park the car or
        -1 if there are no available parking spots that you can reach from the entrance.
         */

        char[][] parking = {
                {' ', ' ', ' ', ' ', 'X', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', 'T', ' ', 'T', ' ', 'T', ' ', ' ', ' '},
                {'T', 'T', 'F', 'T', 'T', ' ', 'T', 'F', 'T', 'T'},
                {' ', 'T', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {'F', 'T', 'T', 'T', 'T', ' ', 'T', 'T', 'T', 'T'},
                {' ', 'T', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}
        };
        int row = 0;
        int col = 4;
        int steps = 0;

        System.out.println(findShorestWay(parking, row, col, steps));
        for (int i = 0; i < parking.length; i++) {
            for (int j = 0; j < parking[i].length; j++) {
                System.out.print(parking[i][j]);
            }
            System.out.println();
        }
    }

    static int findShorestWay(char[][] parking, int row, int col, int steps) {

        if (row > parking.length - 1 || row < 0 || col > parking[0].length - 1 || col < 0) {
            return -1;
        }

        if (parking[row][col] == 'T' || parking[row][col] == '*') {
            return -1;
        }

        if (parking[row][col] == 'F') {
            return steps;
        }

        parking[row][col] = '*';
        steps++;
        int result = Integer.MAX_VALUE;
        int up = findShorestWay(parking, row + 1, col, steps);
        int right = findShorestWay(parking, row, col + 1, steps);
        int left = findShorestWay(parking, row, col - 1, steps);
        int down = findShorestWay(parking, row - 1, col, steps);
        if (down > 0 && down < result) {
            result = down;
        }
        if (up > 0 && up < result) {
            result = up;
        }
        if (left > 0 && left < result) {
            result = left;
        }
        if (right > 0 && right < result) {
            result = right;
        }

        return result;

    }
}
