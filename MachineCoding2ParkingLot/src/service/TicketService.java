package service;

import dto.ParkingFloor;
import dto.ParkingSlot;
import dto.ParkingTicket;
import dto.Vehicle;
import enums.ParkingStatus;
import enums.VehicleTypes;
import repositry.TicketRepository;
import repositry.VehicleRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TicketService {

  static Map<String, ParkingTicket> parkingTicketMap = TicketRepository.getParkingTicketMap();

    public static ParkingTicket createTicket(ParkingSlot parkingSlot, Vehicle vehicle){
        ParkingTicket parkingTicket = new ParkingTicket(
                parkingSlot.getParkingLotId, parkingSlot.floorNumber, parkingSlot.parkingSlotId
        );
        return parkingTicket;
    }

    public static ParkingTicket getTicketFromTicketId(String ticketId){
        return parkingTicketMap.get(ticketId);
    }

}
