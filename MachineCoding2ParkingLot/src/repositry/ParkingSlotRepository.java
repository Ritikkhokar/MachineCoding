package repositry;

import dto.ParkingFloor;
import dto.ParkingSlot;
import dto.Vehicle;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ParkingSlotRepository {
    public static Map<Integer, List<ParkingSlot>> parkingFloorToSlotListMap;

    public ParkingSlotRepository(){
        parkingFloorToSlotListMap = new HashMap<>();
    }

    public static Map<Integer, List<ParkingSlot>> getParkingSlotListByParkingFloor(){
        return parkingFloorToSlotListMap;
    }


}
