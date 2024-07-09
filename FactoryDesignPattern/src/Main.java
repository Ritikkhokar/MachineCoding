import factory.AbstractFactory;
import factory.FactoryCreater;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        AbstractFactory abstractFactory1 = FactoryCreater.getFactory("shape", "circle");
        AbstractFactory abstractFactory2 = FactoryCreater.getFactory("formula", "circle");
        AbstractFactory abstractFactory3 = FactoryCreater.getFactory("shape", "square");
        AbstractFactory abstractFactory4 = FactoryCreater.getFactory("formula", "square");

        abstractFactory1.getShape().draw();
        abstractFactory2.getFormula().getFormula();
        abstractFactory3.getShape().draw();
        abstractFactory4.getFormula().getFormula();


    }
}