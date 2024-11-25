package 创建型模式.工厂模式.抽象工厂;

public class FactoryProducer {
    public AbstractFactory getFactory(String name){
        if(name == null){
            return null;
        }
        if(name.equalsIgnoreCase("FACTORY_1")){
            return new Factory_1();
        }
        if(name.equalsIgnoreCase("FACTORY_2")){
            return new Factory_2();
        }
        return null;
    }
}
