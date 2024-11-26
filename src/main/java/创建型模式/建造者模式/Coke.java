package 创建型模式.建造者模式;

public class Coke extends ColdDrink{
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 3.0f;
    }
}
