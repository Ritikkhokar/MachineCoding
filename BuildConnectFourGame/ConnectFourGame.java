package MachineCoding.BuildConnectFourGame;

public class ConnectFourGame {
    Player player1;
    Player player2;
    ConnectFourBoard board;
    GameState gameState;

    public ConnectFourGame(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        board = new ConnectFourBoard();
        gameState = GameState.PLAYING;
    }

    
}
