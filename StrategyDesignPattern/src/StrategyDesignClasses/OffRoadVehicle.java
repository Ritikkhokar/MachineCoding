package StrategyDesignClasses;

public class OffRoadVehicle extends Vehicle{


//    same code is present in SportVehicle class , so their duplicate code is present
//    @Override
//    public void drive() {
//        System.out.println("Its power drive vehicle");
//    }

    public OffRoadVehicle(){
        super(new PowerDriveStrategy());
    }
}
