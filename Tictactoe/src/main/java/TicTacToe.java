import java.util.Scanner;

public class TicTacToe
{
    private Player player1;
    private Player player2;
    private Player currentPlayer;
    private Board board;

    public TicTacToe()
    {
        player1 = new Player('X');
        player2 = new Player('O');
        currentPlayer = player1;
        board = new Board();
    }

    public void start()
    {
        Scanner scanner = new Scanner(System.in);
        board.clear();
        while (true)
        {
            System.out.println("Current Player: " + currentPlayer.getMarker());
            board.print();
            System.out.println();
            int row, col;
            while (true)
            {
                System.out.print("row (0–2): ");
                if (!scanner.hasNextInt())
                {
                    System.out.println("Please enter a valid number between 0 and 2.\n");
                    scanner.next();
                    continue;
                }
                row = scanner.nextInt();

                System.out.print("column (0–2): ");
                if (!scanner.hasNextInt())
                {
                    System.out.println("Please enter a valid number between 0 and 2.\n");
                    scanner.next();
                    continue;
                }
                col = scanner.nextInt();

                if (row < 0 || row > 2 || col < 0 || col > 2)
                {
                    System.out.println("Please enter numbers between 0 and 2 for both row and column.\n");
                }
                else if (!board.isCellEmpty(row, col))
                {
                    System.out.println("That cell is already taken. Please choose another one.\n");
                }
                else
                {
                    break;
                }
            }
            System.out.println();

            board.place(row, col, currentPlayer.getMarker());

            if (hasWinner())
            {
                board.print();
                System.out.println("Player " + currentPlayer.getMarker() + " wins!");
                break;
            }
            else if (board.isFull())
            {
                board.print();
                System.out.println("It's a draw!");
                break;
            }

            switchCurrentPlayer();
        }
    }

    public void switchCurrentPlayer()
    {
        currentPlayer = (currentPlayer == player1) ? player2 : player1;
    }

    private boolean hasWinner()
    {
        char marker = currentPlayer.getMarker();
        char[][] cells = board.cells;

        for (int i = 0; i < cells.length; i++)
        {
            if ((cells[i][0] == marker && cells[i][1] == marker && cells[i][2] == marker) || (cells[0][i] == marker && cells[1][i] == marker && cells[2][i] == marker))
            {
                return true;
            }
        }

        if ((cells[0][0] == marker && cells[1][1] == marker && cells[2][2] == marker) || (cells[0][2] == marker && cells[1][1] == marker && cells[2][0] == marker))
        {
            return true;
        }

        return false;
    }
} 