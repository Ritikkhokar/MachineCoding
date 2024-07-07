package Veggies;

import Toppings.BaseTopping;

public class ExoticVeggie extends BaseVeggies{
    BaseTopping topping;

    public ExoticVeggie(BaseTopping topping){
        this.topping = topping;
    }
    @Override
    public int cost() {
        return topping.cost() + 170;
    }

}
