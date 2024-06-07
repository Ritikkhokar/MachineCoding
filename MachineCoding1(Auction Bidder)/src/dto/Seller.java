package dto;

import java.util.List;

public class Seller {
    public String name;
    List<Auction> participatedAuctions;

    public Seller(String name, List<Auction> participatedAuctions){
        this.name = name;
        this.participatedAuctions = participatedAuctions;
    }
}
