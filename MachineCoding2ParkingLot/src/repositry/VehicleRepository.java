package repositry;

import dto.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VehicleRepository {
    static Map<String , ParkingSlot> ticketToSlotMap;


    public VehicleRepository(){
        ticketToSlotMap = new HashMap<>();
    }

    public static Map<String , ParkingSlot> getticketToSlotMap(){
        return ticketToSlotMap;
    }


}
