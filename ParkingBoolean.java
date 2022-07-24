public class ParkingBoolean {

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
                {' ', ' ', ' ', ' ', 'X', ' ', 'F', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', 'T', ' ', 'T', ' ', ' ', ' '},
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

        System.out.println(findFreePlace(parking, row, col));


    }

    static boolean findFreePlace(char[][] parking, int row, int col) {

        if (row > parking.length - 1 || row < 0 || col > parking[0].length - 1 || col < 0) {
            return false;
        }

        if (parking[row][col] == 'T' || parking[row][col] == '*') {
            return false;
        }

        if (parking[row][col] == 'F') {
            return true;
        }

        parking[row][col] = '*';
        for (int row1 = 0; row1 < parking.length; row1++) {
            for (int col1 = 0; col1 < parking[row1].length; col1++) {
                System.out.print(parking[row1][col1]);
            }
            System.out.println();
        }
        System.out.println("------------------------------------");

     return   findFreePlace(parking, row + 1, col) ||
                findFreePlace(parking, row, col + 1) ||
                findFreePlace(parking, row, col - 1) ||
                findFreePlace(parking, row - 1, col);
    }

}
