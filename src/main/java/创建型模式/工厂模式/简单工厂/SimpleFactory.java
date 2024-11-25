package 创建型模式.工厂模式.简单工厂;

public class SimpleFactory {

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
