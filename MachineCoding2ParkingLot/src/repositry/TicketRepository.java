package repositry;

import dto.ParkingSlot;
import dto.ParkingTicket;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TicketRepository {
    static Map<String, ParkingTicket> parkingTicketMap;


    public TicketRepository(){
        parkingTicketMap = new HashMap<>();
    }

    public static Map<String, ParkingTicket> getParkingTicketMap(){
        return parkingTicketMap;
    }


}
