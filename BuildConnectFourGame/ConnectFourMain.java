package MachineCoding.BuildConnectFourGame;

public class ConnectFourMain {
    public static void main(String[] args) {
        Player player1 = new Player("Ritik", 'X');
        Player player2 = new Player("Rahul", 'O');
        ConnectFourGame game = new ConnectFourGame(player1, player2);
        
    }
}
