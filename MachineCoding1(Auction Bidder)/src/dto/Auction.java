package dto;

import java.util.HashMap;

public class Auction {
    public String name;
    public String seller;
    public Boolean isActive;
    public Integer minValue;
    public Integer maxValue;
    public HashMap<Buyer,Integer> buyerBidInAuction = new HashMap<>();

    public Auction(
            String name, String winner, Boolean isActive,
            Integer minValue, Integer maxValue, HashMap<Buyer,Integer> buyerBidInAuction
    ){
        this.name = name;
        this.maxValue = maxValue;
        this.minValue = minValue;
        this.seller = winner;
        this.isActive = isActive;
        this.buyerBidInAuction = buyerBidInAuction;
    }
}
