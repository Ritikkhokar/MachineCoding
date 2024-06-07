package service;

import dto.Auction;
import dto.Buyer;
import repository.AuctionRepository;
import repository.BuyerRepository;

import java.util.ArrayList;
import java.util.List;

public class BuyerService {


    static List<Buyer> buyerList = BuyerRepository.getBuyerList();
    static List<Auction> auctionList = AuctionRepository.getAuctionList();
    public void addBuyer(String name) {
        buyerList.add(new Buyer(name, new ArrayList<Auction>()));
    }

    public static Buyer getBuyerByName(String buyerName){
        for(Buyer buyer : buyerList){
            if(buyerName.equals(buyer.name)){
                return buyer;
            }
        }
        return null;
    }

    public static Auction getAuctionByAuctionName(String auctionName){
        for(Auction auction : auctionList){
            if(auctionName.equals(auction.name)){
                return auction;
            }
        }
        return null;
    }

    public void createBid(String buyerName, String auctionName, Integer bid){
        Buyer buyer = getBuyerByName(buyerName);
        if(buyer == null){
            System.out.println("Buyer is not registered");
            return;
        }
        Auction auction = getAuctionByAuctionName(auctionName);
        if(auction == null ){
            System.out.println("Auction not found");
            return;
        }

        if(!auction.isActive){
            System.out.println("Auction is closed");
            return;
        }
        if(auction.buyerBidInAuction.containsKey(buyer)){
            System.out.println("bid already created");
            return;
        }
        if(bid < auction.minValue || bid > auction.maxValue){
            System.out.println("bid is in invalid range");
            return;
        }

        buyer.participatedAuctions.add(auction);
        if(buyer.participatedAuctions.size()>2){
            buyer.isPreferredBuyer = true;
        }
        auction.buyerBidInAuction.put(buyer, bid);
    }

    public void updateBid(String buyerName, String auctionName, Integer bid){
        Buyer buyer = getBuyerByName(buyerName);
        if(buyer == null){
            System.out.println("Buyer is not registered");
            return;
        }
        Auction auction = getAuctionByAuctionName(auctionName);
        if(auction == null ){
            System.out.println("Auction not found");
            return;
        }
        if(!auction.isActive){
            System.out.println("Auction is closed");
            return;
        }
        if(!auction.buyerBidInAuction.containsKey(buyer)){
            System.out.println("buyer not created the bid till now");
            return;
        }
        if(bid < auction.minValue || bid > auction.maxValue){
            System.out.println("bid is in invalid range");
            return;
        }
        auction.buyerBidInAuction.put(buyer, bid);
    }

    public void withdrawBid(String buyerName, String auctionName){
        Buyer buyer = getBuyerByName(buyerName);
        if(buyer == null){
            System.out.println("Buyer is not registered");
            return;
        }
        Auction auction = getAuctionByAuctionName(auctionName);
        if(auction == null ){
            System.out.println("Auction not found");
            return;
        }
        if(!auction.isActive){
            System.out.println("Auction is closed");
        }
        if(!auction.buyerBidInAuction.containsKey(buyer)){
            System.out.println("buyer not created the bid till now");
        }

        auction.buyerBidInAuction.remove(buyer);
    }

}
