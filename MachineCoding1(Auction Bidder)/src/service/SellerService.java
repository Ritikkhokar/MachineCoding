package service;

import dto.Seller;
import repository.SellerRepository;

import java.util.ArrayList;
import java.util.List;

public class SellerService {

    List<Seller> sellerList = SellerRepository.getSellerList();

    public void addSeller(String name){
        sellerList.add(new Seller(name, new ArrayList<>()));
    }
}
