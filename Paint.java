public class Paint {

    public static void main(String[] args) {
        char[][] map = {
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', 'T', ' ', 'T', ' ', 'T', ' ', ' ', ' '},
                {'T', 'T', ' ', 'T', 'T', ' ', 'T', ' ', 'T', 'T'},
                {' ', 'T', ' ', ' ', ' ', ' ', ' ', 'T', ' ', ' '},
                {' ', 'T', ' ', 'T', 'T', ' ', 'T', 'T', 'T', 'T'},
                {' ', 'T', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {'T', 'T', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}
        };

        int row = 0;
        int col = 0;
        paint(map, row, col);

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                System.out.print(map[i][j]);
            }
            System.out.println();
        }

    }

    static void paint(char[][] map, int row, int col) {
        if (row > map.length - 1 || row < 0 || col > map.length - 1 || col < 0) {
            return;
        }
        if (map[row][col] == 'T' || map[row][col] == '*' || map[row][col] == 'p') {
            return;
        }

        map[row][col] = '*';
        paint(map, row+1, col);//долу
        paint(map, row, col+1); //дясно
        paint(map, row, col -1); //ляво
        paint(map, row -1, col); //горе
    }
}
