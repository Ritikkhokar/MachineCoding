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


}
