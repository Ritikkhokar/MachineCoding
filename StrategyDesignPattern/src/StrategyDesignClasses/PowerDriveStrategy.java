package StrategyDesignClasses;

public class PowerDriveStrategy implements DriveStrategy{

    @Override
    public void drive() {
        System.out.println("Its a power drive Strategy");
    }
}
