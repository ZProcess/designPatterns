package 创建型模式.工厂模式.抽象工厂;

public class GetShap {
    public static void main(String[] args) {
        FactoryProducer fp = new FactoryProducer();
        AbstractFactory factory1  = fp.getFactory("FACTORY_1");
        factory1.getShape("RECTANGEL").draw();
    }
}
