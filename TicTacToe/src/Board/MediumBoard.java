package Board;

public class MediumBoard implements MainBoard{

    SignEnum[][] board;

    public MediumBoard(int x){
        board = new SignEnum[x][x];
    }
    @Override
    public SignEnum executeRules() {
//        rows check
        for(int i=0;i< board.length;i++){
            boolean win = true;
            for(int j=1;j< board[0].length;j++){
                if(board[i][j] != board[i][j-1]){
                    win = false;
                    break;
                }
            }
            if(win){
                return board[i][0];
            }
        }

//        column check
        for(int i=0;i< board.length;i++){
            boolean win = true;
            for(int j=1;j< board[0].length;j++){
                if(board[j][i] != board[j-1][i]){
                    win = false;
                    break;
                }
            }
            if(win){
                return board[0][i];
            }
        }

//        diagonal check
        boolean diagonal = true;
        for(int i=1;i< board.length;i++){
            if(board[i][i] != board[i-1][i-1]){
                diagonal = false;
                break;
            }
        }
        if(diagonal){
            return board[0][0];
        }
        diagonal = true;

//        int a =1;
//        int b= board.length-1;
//        for(int i=1;i<board.length;i++){
//            if(board[a][b] != board[a-i][b+i]){
//                diagonal = false;
//            }
//        }
//
//        if(diagonal){
//            return board[0][0];
//        }
        return null;
    }

    @Override
    public void markPosition(SignEnum sign, int x, int y) {
       if(board[x][y] == null){
           board[x][y] = sign;
       }else{
           System.out.println("Position already filled ");
       }
       display();
    }

    public void display(){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                System.out.print(board[i][j] + "|");
            }
            System.out.println();
            System.out.println();
        }
    }
}
