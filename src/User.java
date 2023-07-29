import java.util.Scanner;

public class User {

    public static int[] getUserMove() {
        Scanner scanner = new Scanner(System.in);
        int[] move = new int[2];
        System.out.print("Player Move (X): ");
        String input = scanner.nextLine().toUpperCase();
        if (input.length() != 2 || !Character.isLetter(input.charAt(0)) || !Character.isDigit(input.charAt(1))) {
            System.out.println("Invalid Input: Please enter the column and row of your move (Example: A1).");
            return null;
        }
        move[0] = getColumn(input.charAt(0));
        move[1] = getRow(input.charAt(1));
        return move;
    }

    private static int getColumn(char column) {
        switch (column) {
            case 'A':
                return 0;
            case 'B':
                return 1;
            case 'C':
                return 2;
            default:
                return -1;
        }
    }

    private static int getRow(char row) {
        return Character.getNumericValue(row) - 1;
    }
}
