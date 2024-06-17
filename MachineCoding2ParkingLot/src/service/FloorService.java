package service;

import dto.ParkingFloor;
import dto.ParkingLot;
import dto.ParkingSlot;
import enums.VehicleTypes;
import repositry.ParkingFloorRepository;
import repositry.ParkingLotRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FloorService {
    static List<ParkingLot> parkingLotList = ParkingLotRepository.getParkingLotList();
    public static Map<String, List<ParkingFloor>> parkingLotToFloorMap = ParkingFloorRepository.getParkingFloorListByParkingLot();

    public void  addFloor(String parkingLotId, Integer numberOfSlots){
        ParkingFloor parkingFloor = new ParkingFloor(parkingLotId,parkingLotToFloorMap.size() + 1);
        if(parkingLotToFloorMap.isEmpty()){
            List<ParkingFloor> existingFloor = new ArrayList<>();
            existingFloor.add(parkingFloor);
            parkingLotToFloorMap.put(parkingLotId, existingFloor);
         }else {
            List<ParkingFloor> existingFloor = parkingLotToFloorMap.get(parkingLotId);
            existingFloor.add(parkingFloor);
            parkingLotToFloorMap.put(parkingLotId, existingFloor);
         }
        ParkingSlotService.addSlotsToFloor(parkingLotToFloorMap.size() + 1, numberOfSlots, parkingLotId);
     }
    
}
