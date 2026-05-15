package MachineCoding.BuildConnectFourGame;

import java.util.Scanner;

public class ConnectFourMain {
    public static void main(String[] args) {
        Player player1 = new Player("Ritik", 'X');
        Player player2 = new Player("Rahul", 'O');
        ConnectFourGame game = new ConnectFourGame(player1, player2);
        Scanner scn = new Scanner(System.in);

        while(game.gameState == GameState.PLAYING) {
            Player currentPlayer = game.getCurrentPlayer();
            System.out.println("Please choose the column for " + currentPlayer.name);
            int col = scn.nextInt();
            game.makeMove(col);
            
        }
    }
}
