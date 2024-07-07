package Toppings;

import Pizza.BasePizza;

public class CheeseTopping extends BaseTopping{
    BasePizza pizzaBase;

    public CheeseTopping(BasePizza pizzaBase){
        this.pizzaBase = pizzaBase;
    }

    public int cost(){
        return pizzaBase.cost() + 45;
    }
}
