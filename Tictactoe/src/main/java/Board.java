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
        for (int i = 0; i < 3; i++)
        {
            for (int a = 0; a < 3; a++)
            {
                if (cells[i][a] == ' ') return false;
            }
        }

        return true;
    }

    public void clear() {
        for (int i = 0; i < 3; i++)
        {
            for (int a = 0; a < 3; a++)
            {
                cells[i][a] = ' ';
            }
        }
    }

    public void print() {
        System.out.println("-------");

        for (int i = 0; i < 3; i++) {
            System.out.print("|");

            for (int a = 0; a < 3; a++) {
                System.out.print(cells[i][a] == ' ' ? " " : cells[i][a]);
                System.out.print("|");
            }

            System.out.println();
        }

        System.out.println("-------");
    }
} 