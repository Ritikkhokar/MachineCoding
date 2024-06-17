package repositry;

import dto.ParkingFloor;
import dto.ParkingLot;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ParkingLotRepository {
    public static List<ParkingLot> parkingLotList;

    public ParkingLotRepository(){
        parkingLotList = new ArrayList<>();
    }

    public static List<ParkingLot> getParkingLotList(){
        return parkingLotList;
    }
}
