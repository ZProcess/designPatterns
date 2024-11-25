package 创建型模式.工厂模式.工厂方法;

public class Factory_2Method extends FactoryMethod {

    public Shape getShape(String shape){
        if(shape == null){
            return null;
        }
        if(shape.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }
        if(shape.equalsIgnoreCase("RECTANGEL")){
            return new Rectangle();
        }
        return null;
    }
}
