import Pizza.NormalBase;
import Pizza.PanBase;
import Toppings.CheeseTopping;
import Toppings.MyoniseTopping;
import Veggies.ExoticVeggie;
import Veggies.GardenFreshVeggie;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
        CheeseTopping cheeseTopping = new CheeseTopping(new PanBase());
        MyoniseTopping myoniseTopping = new MyoniseTopping(new NormalBase());
        System.out.println("CheeseTopping cost ->" + cheeseTopping.cost());
        System.out.println("MyoniseTopping cost ->" + myoniseTopping.cost());


        ExoticVeggie exoticVeggie  = new ExoticVeggie(new CheeseTopping(new PanBase()));
        GardenFreshVeggie gardenFreshVeggie  = new GardenFreshVeggie(new MyoniseTopping(new NormalBase()));
        System.out.println("exoticVeggie cost ->" + exoticVeggie.cost());
        System.out.println("gardenFreshVeggie cost ->" + gardenFreshVeggie.cost());
    }
}