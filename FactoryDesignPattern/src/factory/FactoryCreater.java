package factory;

public class FactoryCreater {

    public static AbstractFactory getFactory(String requirement, String name){
        switch (requirement){
            case "shape":{
                return new ShapeFactory(name);
            }
            case "formula":{
                return new FormulaFactory(name);
            }
            default:return null;
        }
    }
}
