package StrategyDesignClasses;

public class SportVehicle extends Vehicle{
//    @Override
//    public void drive() {
//        System.out.println("Its power drive vehicle");
//    }

    public SportVehicle(){
        super(new PowerDriveStrategy());
    }
}
