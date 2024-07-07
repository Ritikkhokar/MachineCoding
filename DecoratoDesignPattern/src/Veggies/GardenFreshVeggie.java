package Veggies;

import Toppings.BaseTopping;

public class GardenFreshVeggie extends BaseVeggies{
    BaseTopping topping;

    public GardenFreshVeggie(BaseTopping topping){
        this.topping = topping;
    }
    @Override
    public int cost() {
        return topping.cost() + 100;
    }

}
