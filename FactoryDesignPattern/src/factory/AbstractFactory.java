package factory;

import Formula.Formula;
import shape.Shape;

public abstract class AbstractFactory {
    public abstract Formula getFormula();
    public abstract Shape getShape();
}
