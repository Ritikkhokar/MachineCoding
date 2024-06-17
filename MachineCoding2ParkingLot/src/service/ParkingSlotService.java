package service;

import dto.ParkingFloor;
import dto.ParkingLot;
import dto.ParkingSlot;
import enums.ParkingStatus;
import enums.VehicleTypes;
import repositry.ParkingFloorRepository;
import repositry.ParkingLotRepository;
import repositry.ParkingSlotRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ParkingSlotService {
    public static Map<Integer, List<ParkingSlot>> parkingFloorToSlotListMap = ParkingSlotRepository.getParkingSlotListByParkingFloor();

    public static void addSlotsToFloor(Integer floor, Integer numberOfSlots, String parkingLotId) {
        for (int j = 1; j <= numberOfSlots; j++) {
            ParkingSlot parkingSlot = null;
            if (j == 1) {
                parkingSlot = new ParkingSlot(
                        VehicleTypes.TRUCK, parkingLotId + "_" + floor+ '_' + j, floor, parkingLotId
                );
            } else if (j == 2 || j == 3) {
                parkingSlot = new ParkingSlot(
                        VehicleTypes.BIKE, parkingLotId + "_" + floor+ '_' + j, floor, parkingLotId
                );
            } else {
                parkingSlot = new ParkingSlot(
                        VehicleTypes.CAR, parkingLotId + "_" + floor+ '_' + j, floor, parkingLotId
                );
            }
            if (!parkingFloorToSlotListMap.containsKey(floor)) {
                List<ParkingSlot> temp = new ArrayList<>();
                temp.add(parkingSlot);
                parkingFloorToSlotListMap.put(floor, temp);
            } else {
                List<ParkingSlot> existingList = parkingFloorToSlotListMap.get(floor);
                existingList.add(parkingSlot);
                parkingFloorToSlotListMap.put(floor, existingList);
            }
        }
    }

    public void displayFreeSlotsPerFloorForAVehicleType(VehicleTypes vehicleType) {
        int freeSlots = 0;
        for (Map.Entry<Integer, List<ParkingSlot>> entry : parkingFloorToSlotListMap.entrySet()) {
            for (ParkingSlot parkingSlot : entry.getValue()) {
                if (
                        parkingSlot.type == vehicleType
                                && parkingSlot.parkingStatus == ParkingStatus.UNOCCUPIED) {
                    freeSlots++;
                }
            }
            System.out.println("Floor Number :" + entry.getKey() + "-> Free slots " + freeSlots);
            freeSlots = 0;
        }
    }

    public void displayOccupiedSlotsPerFloorForAVehicleType(VehicleTypes vehicleType) {
        int occupiedSlots = 0;
        for (Map.Entry<Integer, List<ParkingSlot>> entry : parkingFloorToSlotListMap.entrySet()) {
            for (ParkingSlot parkingSlot : entry.getValue()) {
                if (
                        parkingSlot.type == vehicleType
                                && parkingSlot.parkingStatus == ParkingStatus.OCCUPIED) {
                    occupiedSlots++;
                }
            }
            System.out.println("Floor Number :" + entry.getKey() + "-> Occupied slots" + occupiedSlots);
            occupiedSlots = 0;
        }
    }

    public static ParkingSlot findAvailableSlot(VehicleTypes vehicleType) {
        for (int i = 1; i <= parkingFloorToSlotListMap.size(); i++) {
            List<ParkingSlot> parkingSlotsList = parkingFloorToSlotListMap.get(i);
            for (ParkingSlot parkingSlot : parkingSlotsList) {
                if (parkingSlot.type == vehicleType && parkingSlot.parkingStatus == ParkingStatus.UNOCCUPIED) {
                    return parkingSlot;
                }
            }
        }
        return null;
    }


}
