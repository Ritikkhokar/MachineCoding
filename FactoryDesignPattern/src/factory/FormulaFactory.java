package factory;

import Formula.Formula;
import Formula.CircleFormula;
import Formula.SquareFormula;
import Formula.RectangleFormula;
import shape.Shape;


public class FormulaFactory extends AbstractFactory{
     String shape;

    FormulaFactory(String str){
        this.shape = str;
    }

    @Override
    public Formula getFormula(){
        switch (shape){
            case "circle" : {
                return new CircleFormula();
            }
            case "square" : {
                return new SquareFormula() {
                };
            }
            case "rectangle" : {
                return new RectangleFormula();
            }
            default:{
                return null;
            }
        }
    }

    @Override
    public Shape getShape() {
        return null;
    }
}
