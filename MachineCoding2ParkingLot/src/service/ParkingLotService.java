package service;

import dto.ParkingFloor;
import dto.ParkingLot;
import dto.ParkingSlot;
import enums.VehicleTypes;
import repositry.ParkingFloorRepository;
import repositry.ParkingLotRepository;
import repositry.ParkingSlotRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingLotService {

    List<ParkingLot> parkingLotList = ParkingLotRepository.getParkingLotList();
    Map<Integer, List<ParkingSlot>> parkingFloorToSlotListMap = ParkingSlotRepository.parkingFloorToSlotListMap;
    HashMap<String, List<ParkingFloor>> parkingLotToFloorListMap = ParkingFloorRepository.parkingLotToFloorListMap;

    public void createParkingLot(String parkingLotId, Integer numberOfFloors, Integer numberOfSlotsPerFloor){
        ParkingLot parkingLot = new ParkingLot(parkingLotId);
        for(int i=1;i<=numberOfFloors;i++){
            ParkingFloor parkingFloor = new ParkingFloor(parkingLotId,i);
            ParkingSlotService.addSlotsToFloor(i,numberOfSlotsPerFloor, parkingLotId);
            if(!parkingLotToFloorListMap.containsKey(parkingLotId)){
                List<ParkingFloor> temp = new ArrayList<>();
                temp.add(parkingFloor);
                parkingLotToFloorListMap.put(parkingLotId, temp);
            }else{
                List<ParkingFloor> existingList = parkingLotToFloorListMap.get(parkingLotId);
                existingList.add(parkingFloor);
                parkingLotToFloorListMap.put(parkingLotId, existingList);
            }
        }
        parkingLotList.add(parkingLot);
    }



}
