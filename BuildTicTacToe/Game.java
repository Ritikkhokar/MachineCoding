package MachineCoding.BuildTicTacToe;

import java.util.Scanner;

public class Game {
    private Player player1;
    private Player player2;
    private TicTacToeBoard board;
    private Player winner;
    private Player currentPlayer;
    private GameState gameState;

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.board = new TicTacToeBoard();
        this.currentPlayer = player1;
        this.gameState = GameState.PLAYING;
    }

    public GameStategetGameState() {
        return gameState;
    }

    public Player getWinner() {
    return winner;
    }



    public void makeMove(Player currentPlayer, int posx, int posy){
        if(!board.isValidMove(posx, posy)){
                System.out.println("Please give correct position ");
                return;
        }

        board.placePosition(posx-1, posy-1, currentPlayer.getSymbol());

         // check is he win
        if(board.checkWin(currentPlayer.getSymbol())){
            gameState = GameState.WON;
            winner = currentPlayer;
            System.out.println("Game Won by Player " + currentPlayer.name);
            return;
        }

        if(board.isBoardFull()){
                System.out.println("Game Drawn");
                gameState = GameState.DRAW;
                return;
        }

            // change player for next turn
        currentPlayer = currentPlayer == player1 ? player2 : player1;
        return;
    }
    
    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    
    // In Game
    public void reset() {
    this.board = new TicTacToeBoard();
    this.currentPlayer = player1;
    this.gameState = GameState.PLAYING;
    this.winner = null;
    }


}
