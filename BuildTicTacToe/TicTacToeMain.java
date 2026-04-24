import java.util.Scanner;

public class TicTacToeMain {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Player player1 = new Player("Player1", 'X');
        Player player2 = new Player("Player2", 'O');
        Game game = new Game(player1, player2);
        // game.startGame();
        while(GameState.PLAYING == game.getGameState()) {
            Player currentPlayer = game.getCurrentPlayer();
            System.out.println("Please give position X for player " + currentPlayer.getName());
            int posx = scn.nextInt();
            System.out.println("Please give position Y for player " + currentPlayer.getName());
            int posy = scn.nextInt();
            game.makeMove(posx, posy);

        }

    }
}

