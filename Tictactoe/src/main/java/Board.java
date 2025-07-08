public class Board {

    char[][] cells;

    public Board()
    {
        cells = new char[3][3];
        clear();
    }

    public boolean isCellEmpty(int x, int y)
    {
        return cells[x][y] == ' ';
    }

    public void place(int x, int y, char marker)
    {
        cells[x][y] = marker;
    }

    public boolean isFull()
    {
        for (char[] row : cells)
        {
            for (char val : row)
            {
                if (val == ' ') return false;
            }
        }
        return true;
    }

    public void clear() {
        for (int i = 0; i < cells.length; i++)
        {
            for (int a = 0; a < cells[i].length; a++)
            {
                cells[i][a] = ' ';
            }
        }
    }

    public void print() {
        System.out.println("-------");

        for (char[] row : cells) {
            System.out.print("|");

            for (char val : row) {
                System.out.print(val);
                System.out.print("|");
            }

            System.out.println();
        }

        System.out.println("-------");
    }
} 