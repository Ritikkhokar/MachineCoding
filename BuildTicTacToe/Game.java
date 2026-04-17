package MachineCoding.BuildTicTacToe;

public class Game {
    Player player1;
    Player player2;
    Board board;
    Player winner;
    Player currentPlayer;
    GameState gameState;

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.board = new Board();
        this.currentPlayer = player1;
        this.gameState = GameState.PLAYING;
    }


    public void makeMove(Player currentPlayer, int posx, int posy){
        board.fillBoard(currentPlayer.symbol, posx, posy);
    }

    public GameState startGame() {
        Scanner scn = new Scanner();
        while(GameState.PLAYING == gameState) {

            System.out.println("Please give position X for player " + currentPlayer.name);
            int posx = scn.nextInt();
            System.out.println("Please give position Y for player " + currentPlayer.name);
            int posy = scn.nextInt();

            // check for valid move
            if(!board.isValidMove(posx, posy)){
                System.out.println("Please give correct position ");
            }

            // make move by curent player
            makeMove(currentPlayer, posx, posy);

            // check is he win
            if(board.checkWin(currentPlayer.getSymbol())){
            gameState = GameState.WON;
            winner = currentPlayer;
            System.out.println("Game Won by Player " + currentPlayer.name)
            return GameState.WON;
            }

            // check is board full
            if(board.isBoardFull()){
                System.out.println("Game Drawn");
                return GameState.DRAW;
            }
            
            // change player for next turn
            currentPlayer = currentPlayer == player1 ? player2 : player1;
        }


}
