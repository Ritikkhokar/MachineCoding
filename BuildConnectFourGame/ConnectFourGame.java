package MachineCoding.BuildConnectFourGame;

public class ConnectFourGame {
    Player player1;
    Player player2;
    ConnectFourBoard board;
    GameState gameState;
    Player currentPlayer;

    public ConnectFourGame(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        board = new ConnectFourBoard();
        gameState = GameState.PLAYING;
        this.currentPlayer = player1;
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }
    public GameState getGameState() {
        return gameState;
    }

    public void makeMove(int col){
        if(board.isValidMove(col)) {
                board.makeMove(col, currentPlayer.symbol);
                if(board.checkWin(currentPlayer.symbol)){
                    gameState = GameState.WON;
                    System.out.println(currentPlayer.name + " wins!");
                    return;
                } else if(board.isBoardFull()){
                    gameState = GameState.DRAW;
                    System.out.println("It's a draw!");
                    return;
                } else {
                    // Switch player
                    currentPlayer = (currentPlayer == player1) ? player2 : player1;
                }
            } else {
                System.out.println("Invalid move, try again.");
                return;
            }
    }


}
