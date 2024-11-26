package 创建型模式.工厂模式.抽象工厂;

public class Factory_2 extends AbstractFactory {

    public Shape getShape(String shape){
        if(shape == null){
            return null;
        }
        if(shape.equalsIgnoreCase("CIRCLE")){
            return new Circle2();
        }
        if(shape.equalsIgnoreCase("RECTANGEL")){
            return new Rectangle2();
        }
        return null;
    }
}
