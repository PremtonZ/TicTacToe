public class Main {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        while (true) {
            TicTacToe game = new TicTacToe();
            game.start();
            while (true) {
                System.out.print("Do you want to play again? (y/n): ");
                String answer = scanner.next().trim().toLowerCase();
                if (answer.equals("y")) {
                    break;
                } else if (answer.equals("n")) {
                    System.out.println("Thank you for playing!");
                    return; 
                } else {
                    System.out.println("Please enter only 'y' or 'n'.");
                }
            }
        }
    }
}