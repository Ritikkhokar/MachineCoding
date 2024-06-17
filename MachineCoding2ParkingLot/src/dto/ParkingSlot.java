package dto;

import enums.ParkingStatus;
import enums.VehicleTypes;

public class ParkingSlot {
    public VehicleTypes type;
    public String parkingSlotId;
    public String getParkingLotId;
    public Integer floorNumber;
    public ParkingStatus parkingStatus;


    public ParkingSlot(VehicleTypes type, String parkingSlotId, Integer floorNumber, String parkingLotId){
        this.type = type;
        this.parkingSlotId = parkingSlotId;
        this.floorNumber = floorNumber;
        this.parkingStatus = ParkingStatus.UNOCCUPIED;
        this.getParkingLotId = parkingLotId;
    }
}
