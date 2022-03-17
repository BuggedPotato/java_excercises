package ARRAYS2;

public class Zadanie7A {
    public static void main( String[] args ) {
        int cols = 10;
        int rows = 10;
        int[][] snail = new int[cols][rows];
        snail[0][0] = -1;
        int[][] direction = new int[][]{
                {1, 0},
                {0, 1},
                {-1, 0},
                {0, -1},
        };
        int currentDir = 0;
        int currentColumn = 0;
        int currentRow = 0;
        int counter = 0;
        while (counter++ < cols*rows)
        {
            snail[currentColumn][currentRow] = counter;
            System.out.println(currentColumn);
            switch (currentDir) {
                case 0:
                    if (currentColumn == cols-1){
                        currentDir = (currentDir+1) % 4;
                    }   else {
                        if (snail[currentColumn+direction[currentDir][0]][currentRow+direction[currentDir][1]] != 0) {
                                currentDir = (currentDir+1) % 4;
                        }
                    }
                    break;
                case 1:
                    if (currentRow == rows-1){
                        currentDir = (currentDir+1) % 4;
                    }else {
                        if (snail[currentColumn+direction[currentDir][0]][currentRow+direction[currentDir][1]] != 0) {
                            currentDir = (currentDir+1) % 4;
                        }
                    }
                    break;
                case 2:
                    if (currentColumn == 0){
                        currentDir = (currentDir+1) % 4;
                    }else {
                        if (snail[currentColumn+direction[currentDir][0]][currentRow+direction[currentDir][1]] != 0) {
                            currentDir = (currentDir+1) % 4;
                        }
                    }
                    break;
                case 3:
                    if (currentRow == 0){
                        currentDir = (currentDir+1) % 4;
                    }else {
                        if (snail[currentColumn+direction[currentDir][0]][currentRow+direction[currentDir][1]] != 0) {
                            currentDir = (currentDir+1) % 4;
                        }
                    }
                    break;
            }
            currentColumn += direction[currentDir][0];
            currentRow += direction[currentDir][1];
        }

        printArrays( snail );
    }

    public static void printArrays( int[][] arr )
    {
        for( int[] row : arr )
        {
            for( int n : row )
            {
                System.out.print( n + " " );
            }
            System.out.println();
        }
    }
}
