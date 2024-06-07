package dto;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Buyer {
    public String name;
    public List<Auction> participatedAuctions;
    public boolean isPreferredBuyer;
    public Buyer(String name, List<Auction> participatedAuctions) {
        this.name = name;
        this.participatedAuctions = participatedAuctions;
    }
}

