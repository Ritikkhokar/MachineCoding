package service;

import repository.AuctionRepository;
import repository.BuyerRepository;
import repository.SellerRepository;

public class InMemory {

    static AuctionRepository auctionRepository;
    static BuyerRepository buyerRepository;
    static SellerRepository sellerRepository;

    public InMemory(){
        auctionRepository = new AuctionRepository();
        buyerRepository = new BuyerRepository();
        sellerRepository = new SellerRepository();
    }
}
