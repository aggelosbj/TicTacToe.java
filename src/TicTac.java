
public class TicTac {

	private static char[][] board = new char[3][3];
	 

	
	public static char[][] getBoard() {
		return board;
		
		
	}
	public static void setBoard(char[][] board) {
		TicTac.board = board;
	}
	
	public  void iniBoard() {
		for (int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				board[i][j] = ' ';
			}
		}
	}
	public void printBoard(){
		System.out.println("**********");
		System.out.println("Tic-Tac-Toe!");
		System.out.println("**********");
		System.out.println(" A B C");
		for (int i=0; i<3; i++) {
			System.out.print((i+1) + " ");
			for (int j=0; j<3; j++) {
				System.out.print("|" + board[i][j]);
			}
			System.out.println("|");
		}
	}
	
	public boolean isValidmove(int row, int col) {
		return row>= 0 && row < 3 && col>=0 && col < 3 && board[row][col] == ' ';
	}
	public void makeMove(int row, int col,char symbol) {
		board[row][col] = symbol;
	}
	
	public void makeComputerMove() {
		int[] computerMove = Computer.getComputerMove(getBoard());
		int row = computerMove[1];
		int col = computerMove[0];
		makeMove(row, col, 'O');
	}
	
	public boolean checkWin(char symbol) {
	    for (int i = 0; i < 3; i++) {
	        if (board[i][0] == symbol && board[i][1] == symbol && board[i][2] == symbol) {
	            return true;
	        }
	        if (board[0][i] == symbol && board[1][i] == symbol && board[2][i] == symbol) {
	            return true;
	        }
	    }

	    if (board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol) {
	        return true;
	    }

	    return board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol;
	}
	
	public boolean isBoardFull() {
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(board[i][j] == ' ') {
					return false;
				}
			}
		}
		return true;
	}
}
