package Toppings;

import Pizza.BasePizza;

public class MyoniseTopping extends BaseTopping{
    BasePizza pizzaBase;

    public MyoniseTopping(BasePizza pizzaBase){
        this.pizzaBase = pizzaBase;
    }

    public int cost(){
        return pizzaBase.cost() + 35;
    }
}
