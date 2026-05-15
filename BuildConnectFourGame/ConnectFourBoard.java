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

    public boolean checkWin(char symbol){
        for(int i=0;i<6;i++){
            for(int j=0;j<7;j++){
                if(board[i][j] == symbol){
                    // Check horizontally
                    if(j+3<7 && board[i][j+1] == symbol && board[i][j+2] == symbol && board[i][j+3] == symbol) return true;
                    // Check vertically
                    if(i+3<6 && board[i+1][j] == symbol && board[i+2][j] == symbol && board[i+3][j] == symbol) return true;
                    // Check diagonal (bottom-left to top-right)
                    if(i-3>=0 && j+3<7 && board[i-1][j+1] == symbol && board[i-2][j+2] == symbol && board[i-3][j+3] == symbol) return true;
                    // Check diagonal (top-left to bottom-right)
                    if(i+3<6 && j+3<7 && board[i+1][j+1] == symbol && board[i+2][j+2] == symbol && board[i+3][j+3] == symbol) return true;
                }
            }
            
        }
        return false;
    }

    public boolean isBoardFull() {
        for(int j=0;j<7;j++){
            if(board[0][j] == '-') return false;
        }
        return true;
    }





        
}
