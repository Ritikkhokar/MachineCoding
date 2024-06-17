package service;

import dto.ParkingSlot;
import dto.ParkingTicket;
import dto.Vehicle;
import enums.ParkingStatus;
import enums.ParkingTicketStatus;
import enums.VehicleTypes;
import repositry.TicketRepository;
import repositry.VehicleRepository;

import javax.swing.text.StringContent;
import java.util.Map;

public class VeicleService {

    static Map<String, ParkingSlot> ticketToSlotMap = VehicleRepository.getticketToSlotMap();
    static Map<String, ParkingTicket> parkingTicketMap = TicketRepository.getParkingTicketMap();

    public  void parkVehicle(VehicleTypes vehicleType, String regNumber, String color){
        Vehicle vehicle = new Vehicle(vehicleType, regNumber, color);
        ParkingSlot parkingSlot = ParkingSlotService.findAvailableSlot(vehicleType);
        if(parkingSlot != null){
            ParkingTicket parkingTicket= TicketService.createTicket(parkingSlot,vehicle);
            parkingTicketMap.put(parkingTicket.parkingTicketId, parkingTicket);
            parkingSlot.parkingStatus = ParkingStatus.OCCUPIED;
            ticketToSlotMap.put(parkingTicket.parkingTicketId, parkingSlot);
        }else{
            System.out.println("Slots are not available");
        }
    }

    public void unParkVehicle(String tickedId){
        ParkingSlot parkingSlot = ticketToSlotMap.get(tickedId);
        if(parkingSlot != null && parkingSlot.parkingStatus == ParkingStatus.OCCUPIED){
            parkingSlot.parkingStatus = ParkingStatus.UNOCCUPIED;
           ParkingTicket parkingTicket = TicketService.getTicketFromTicketId(tickedId);
           parkingTicket.ticketStatus = ParkingTicketStatus.EXPIRED;
        }else{
            System.out.println("No parked vehicle on this ticket");
        }
    }



}
