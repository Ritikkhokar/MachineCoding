
import service.AuctionService;
import service.BuyerService;
import service.InMemory;
import service.SellerService;

import java.util.*;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
        InMemory inMemory = new InMemory();
        BuyerService buyerService = new BuyerService();
        SellerService sellerService = new SellerService();
        AuctionService auctionService = new AuctionService();
        Scanner scn = new Scanner(System.in);


        while(true) {
            String input = scn.nextLine();
            input = input.trim();
            String[] inputArray = input.split(" ");
            try {
                switch (inputArray[0]) {
                    case "ADD_BUYER": {
                        buyerService.addBuyer(inputArray[1]);
                    }
                    break;
                    case "ADD_SELLER": {
                        sellerService.addSeller(inputArray[1]);
                    }
                    break;
                    case "CREATE_AUCTION": {
                        auctionService.createAuction(
                                inputArray[1], Integer.parseInt(inputArray[2]),
                                Integer.parseInt(inputArray[3]), inputArray[4]
                        );
                    }
                    break;
                    case "CREATE_BID" : {
                        buyerService.createBid(inputArray[1], inputArray[2], Integer.parseInt(inputArray[3]));
                    }
                    break;

                    case "UPDATE_BID" : {
                        buyerService.updateBid(inputArray[1], inputArray[2], Integer.parseInt(inputArray[3]));
                    }
                    break;
                    case "WITHDRAW_BID" : {
                        buyerService.withdrawBid(inputArray[1], inputArray[2]);
                    }
                    break;
                    case "CLOSE_AUCTION" : {
                        auctionService.closeAuction(inputArray[1]);

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
