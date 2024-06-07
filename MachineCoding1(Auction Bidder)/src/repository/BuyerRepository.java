package repository;

import dto.Buyer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BuyerRepository {
    static List<Buyer> buyerList;
    static Map<Buyer, Integer> buyerBids = new HashMap<>();

    public BuyerRepository(){
        buyerList = new ArrayList<>();
    }

    public static List<Buyer> getBuyerList(){
        return buyerList;
    }
}
