import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        TicTac tictac = new TicTac();
        tictac.iniBoard();
        tictac.printBoard();
        playGame(tictac);
    }

    private static void playGame(TicTac tictac) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int[] userMove;
            do {
                userMove = User.getUserMove();
                if (userMove == null) {
                    System.out.println("Invalid move. Please try again.");
                }
            } while (userMove == null);

            int row = userMove[1];
            int col = userMove[0];

            if (!tictac.isValidmove(row, col)) {
                System.out.println("Invalid move. Please try again.");
                continue;
            }

            tictac.makeMove(row, col, 'X');
            tictac.printBoard();

            if (tictac.checkWin('X')) {
                System.out.println("Player wins! Game over.");
                break;
            }

            if (tictac.isBoardFull()) {
                System.out.println("Game over. It's a draw.");
                break;
            }

            tictac.makeComputerMove();
            tictac.printBoard();

            if (tictac.checkWin('O')) {
                System.out.println("Computer wins! Game over.");
                break;
            }

            if (tictac.isBoardFull()) {
                System.out.println("Game over. It's a draw.");
                break;
            }
        }
    }
}
