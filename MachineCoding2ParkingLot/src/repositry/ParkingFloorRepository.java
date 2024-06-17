package repositry;

import dto.ParkingFloor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ParkingFloorRepository {
    public static HashMap<String, List<ParkingFloor>> parkingLotToFloorListMap;

    public ParkingFloorRepository(){
       parkingLotToFloorListMap = new HashMap<>();
    }

    public static  Map<String, List<ParkingFloor>> getParkingFloorListByParkingLot(){
        return parkingLotToFloorListMap;
    }
}
