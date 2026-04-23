package MachineCoding.BuildTicTacToe;

import java.util.Scanner;

public class Game {
    Player player1;
    Player player2;
    TicTacToeBoard board;
    Player winner;
    Player currentPlayer;
    GameState gameState;
    Scanner scn;

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.board = new TicTacToeBoard();
        this.currentPlayer = player1;
        this.gameState = GameState.PLAYING;
        this.scn = new Scanner(System.in);
    }

    public getGameState() {
        return gameState;
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




}
