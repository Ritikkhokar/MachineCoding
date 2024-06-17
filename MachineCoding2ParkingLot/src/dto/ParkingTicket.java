package dto;

import enums.ParkingTicketStatus;

public class ParkingTicket {
    public String parkingLotId;
    Integer floorNumber;
    String parkingSlotNumber;
    public ParkingTicketStatus ticketStatus;
    public String parkingTicketId;


    public ParkingTicket(String parkingLotId, Integer floorNumber, String parkingSlotNumber){
        this.parkingLotId = parkingLotId;
        this.floorNumber = floorNumber;
        this.parkingSlotNumber = parkingSlotNumber;
        this.ticketStatus = ParkingTicketStatus.NOT_EXPIRED;
        this.parkingTicketId = parkingSlotNumber;
    }
}
