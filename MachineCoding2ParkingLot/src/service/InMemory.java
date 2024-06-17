package service;

import repositry.*;

public class InMemory {
    ParkingLotRepository parkingLotRepository;
    VehicleRepository vehicleRepository;
    TicketRepository ticketRepository;
    ParkingFloorRepository parkingFloorRepository;
    ParkingSlotRepository parkingSlotRepository;

   public InMemory(){
       this.parkingLotRepository = new ParkingLotRepository();
       this.vehicleRepository = new VehicleRepository();
       this.ticketRepository = new TicketRepository();
       this.parkingFloorRepository = new ParkingFloorRepository();
       this.parkingSlotRepository = new ParkingSlotRepository();
   }
}
