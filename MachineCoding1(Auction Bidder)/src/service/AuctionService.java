package service;

import dto.Auction;
import dto.Buyer;
import dto.Seller;
import repository.AuctionRepository;
import repository.SellerRepository;

import java.security.Key;
import java.util.*;

import static service.BuyerService.getAuctionByAuctionName;

public class AuctionService {

    static List<Auction> auctionList = AuctionRepository.getAuctionList();
    static List<Seller> sellerList = SellerRepository.getSellerList();

    public Seller getSellerByName(String sellerName){
        for(Seller seller : sellerList){
            if(sellerName.equals(seller.name)){
                return seller;
            }
        }
        return null;
    }

    public void createAuction(String name, Integer minimumBid, Integer maximumBid, String sellerName){
        Seller seller = getSellerByName(sellerName);
        if(seller == null){
            System.out.println("Seller is not registered");
            return;
        }
        Auction auction = getAuctionByAuctionName(name);
        if(auction != null ){
            System.out.println("Auction already created");
            return;
        }
        auctionList.add(new Auction(name, sellerName,true, minimumBid, maximumBid,new HashMap<>()));
    }

     public void closeAuction(String auctionName){
         Auction auction = getAuctionByAuctionName(auctionName);
         if(auction == null ){
             System.out.println("Auction not found");
             return;
         }
         if(!auction.isActive){
             System.out.println("Auction is already closed");
         }
         int max = auction.minValue;
         Map.Entry<Buyer,Integer> winner = null;
         auction.buyerBidInAuction = removeDuplicates(auction.buyerBidInAuction);
         for(Map.Entry<Buyer,Integer> entry : auction.buyerBidInAuction.entrySet()){
             if(entry.getValue()>max){
                 winner = entry;
                 max = entry.getValue();
             }
         }
         auction.isActive = false;
         if(winner == null){
             System.out.println("No Winner");
         }else{
             System.out.println("winner is " + winner.getKey().name);
             System.out.println("winner bid is " + winner.getValue());
         }

     }

     public static HashMap<Buyer, Integer> removeDuplicates(HashMap<Buyer, Integer>map){
         HashMap<Integer, Integer> bidFrequency = new HashMap<Integer, Integer>();
        for(Map.Entry<Buyer, Integer> entry : map.entrySet()){
          if(!bidFrequency.containsKey(entry.getValue())){
              bidFrequency.put(entry.getValue(), 1);
          }else{
              bidFrequency.put(entry.getValue(), bidFrequency.get(entry.getValue()) + 1);
          }
        }

        HashMap<Buyer, Integer> uniqueBidBuyers = new HashMap<>();
        for(Map.Entry<Buyer, Integer> entry : map.entrySet()){
            int frequency = bidFrequency.get(entry.getValue());
            if(frequency == 1){
                uniqueBidBuyers.put(entry.getKey(), entry.getValue());
            }
        }
        return uniqueBidBuyers;

     }
}
