import StrategyDesignClasses.OffRoadVehicle;
import StrategyDesignClasses.PassengerVehicle;
import StrategyDesignClasses.SportVehicle;
import StrategyDesignClasses.Vehicle;

import java.util.Vector;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        Vehicle v1 = new OffRoadVehicle();
        Vehicle v2 = new PassengerVehicle();
        Vehicle v3 = new SportVehicle();

        v1.drive();
        v2.drive();
        v3.drive();
    }
}