import Board.MainBoard;
import Board.MediumBoard;
import Board.SignEnum;
import Player.Player;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
        MainBoard playingBoard = new MediumBoard(3);
        Player p1 = new Player(SignEnum.X,"Ritik",playingBoard);
        Player p2 = new Player(SignEnum.O,"Rishabh",playingBoard);
        SignEnum ans = null;
        Scanner scn = new Scanner(System.in);
        int x=0;
        int y=0;
        while(true){
            System.out.println("enter the value of x cordinate for player1");
             x = scn.nextInt();
            System.out.println("enter the value of y cordinate for player1");
             y= scn.nextInt();
            ans = p1.markSign(x,y);
            if(ans != null){
                return;
            }
            System.out.println("enter the value of x cordinate for player2");
            x = scn.nextInt();
            System.out.println("enter the value of y cordinate for player2");
            y= scn.nextInt();
            ans = p2.markSign(x,y);
            if(ans != null){
                return;
            }

        }
    }
}