package MachineCoding.BuildTicTacToe;

public class Board {
    char[][] board;

    public Board() {
        board = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    public boolean isValidMove(int x, int y) {
        if(x>3 || x<1 || y>3 || y<1 )return false;
        return board[x-1][y] == '-';
    }
    
    public boolean checkWin(char symbol){
        // rows check
        for(int i=0;i<3;i++){
            if(board[i][0] == symbol && board[i][1] == symbol && board[i][2] == symbol){
                return true;
            }
        }

        // columns check
        for(int i=0;i<3;i++){
            if(board[0][i] == symbol && board[1][i] == symbol && board[2][i] == symbol){
                return true;
            }
        }

        // diagonal check
        if((board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol)||
         (board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol)){
            return true;
        }
        return false;
    }

    public static void fillBoard(char symbol, int x, int y){
        board[x][y] = symbol;
    }

}
