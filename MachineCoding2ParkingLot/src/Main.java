import dto.Vehicle;
import enums.VehicleTypes;
import repositry.VehicleRepository;
import service.*;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
        InMemory inMemory = new InMemory();
        FloorService floorService = new FloorService();
        ParkingSlotService parkingSlotService = new ParkingSlotService();
        ParkingLotService parkingLotService = new ParkingLotService();
        TicketService ticketService = new TicketService();
        VeicleService veicleService = new VeicleService();

        Scanner scn = new Scanner(System.in);


        while(true) {
            String input = scn.nextLine();
            input = input.trim();
            String[] inputArray = input.split(" ");
            try {
                switch (inputArray[0]) {
                    case "create_parking_lot": {
                        parkingLotService.createParkingLot(inputArray[1], Integer.parseInt(inputArray[2]),
                                Integer.parseInt(inputArray[3]));
                    }
                    break;
                    case "display": {
                        switch (inputArray[1]){
                            case "free_slots": {
                                parkingSlotService.displayFreeSlotsPerFloorForAVehicleType(VehicleTypes.valueOf(inputArray[2]));
                            break;
                            }
                            case "occupied_slots": {
                                parkingSlotService.displayOccupiedSlotsPerFloorForAVehicleType(VehicleTypes.valueOf(inputArray[2]));
                            break;
                            }
                        }

                    }
                    break;
                    case "park_vehicle": {
                        veicleService.parkVehicle(VehicleTypes.valueOf(inputArray[1]), inputArray[2], inputArray[3]);
                    }
                    break;
                    case "unpark_vehicle" : {
                        veicleService.unParkVehicle(inputArray[1]);
                    }
                    break;
                    default: {
                        System.out.println("Invalid command");
                    }
                }
            } catch (Exception e) {
                System.out.println("Error while running command -> " + inputArray[0]);
            }

        }
    }

}