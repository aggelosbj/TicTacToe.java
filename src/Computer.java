import java.util.Random;

public class Computer {
    public static int[] getComputerMove(char[][] cs) {
        Random random = new Random();
        int[] move = new int[2];
        do {
            move[0] = random.nextInt(3);
            move[1] = random.nextInt(3);
        } while (!(cs[move[0]][move[1]] == ' '));
        return move;
    }
}
