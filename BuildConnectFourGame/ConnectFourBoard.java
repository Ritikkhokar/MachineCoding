package MachineCoding.BuildConnectFourGame;

public class ConnectFourBoard {
    char[][] board;

    public ConnectFourBoard() {
        board = new char[6][7];
        for(int i=0;i<6;i++){
            for(int j=0;j<7;j++){
                board[i][j] = '-';
            }
        }
    }

    public boolean isValidMove(int column) {
        if(column<1 || column>7)return false;
        if(board[0][column-1] != '-') return false;
        return true;
    }

    public boolean makeMove(int col, char symbol){
        for(int i=5;i>=0;i--){
            if(board[i][col-1] == '-'){
                board[i][col-1] = symbol;
                return true;
            }
        }
        return false;
    }
    




        
}
