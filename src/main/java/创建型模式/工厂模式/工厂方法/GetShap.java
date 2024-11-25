package 创建型模式.工厂模式.工厂方法;

public class GetShap {
    public static void main(String[] args) {
        FactoryMethod ab;
        ab = new Factory_1Method();
        ab.getShape("RECTANGEL").draw();
    }
}
