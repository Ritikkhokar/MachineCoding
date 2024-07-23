package Player;

import Board.MainBoard;
import Board.SignEnum;

public class Player {
    SignEnum signEnum;
    String name;
    MainBoard mainBoard;

    public Player(SignEnum signEnum, String name, MainBoard mainBoard){
        this.signEnum = signEnum;
        this.name = name;
        this.mainBoard = mainBoard;
    }

    public SignEnum markSign(int x, int y){
        mainBoard.markPosition(signEnum,x,y);
        SignEnum signEnum1 = mainBoard.executeRules();
        if(signEnum1 != null){
            System.out.println(name+ "win the game");
        }
        return signEnum1;
    }

}
