package factory;

import Formula.Formula;
import shape.Circle;
import shape.Rectangle;
import shape.Shape;
import shape.Square;

public class ShapeFactory extends AbstractFactory{
     String shape;

    ShapeFactory(String str){
        this.shape = str;
    }

    @Override
    public Formula getFormula() {
        return null;
    }

    @Override
    public Shape getShape(){
        switch (shape){
            case "circle" : {
                return new Circle();
            }
            case "square" : {
                return new Square() {
                };
            }
            case "rectangle" : {
                return new Rectangle();
            }
            default:{
                return null;
            }
        }
    }

}
