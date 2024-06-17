package dto;


import java.util.List;

public class ParkingFloor {
    String parkingLotId;
    Integer floorNumber;

    public ParkingFloor(String parkingLotId, Integer floorNumber){
        this.parkingLotId = parkingLotId;
        this.floorNumber = floorNumber;
    }
}
