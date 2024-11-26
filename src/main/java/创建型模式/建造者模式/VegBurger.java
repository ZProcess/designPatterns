package 创建型模式.建造者模式;

public class VegBurger extends Burger{
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 11f;
    }
}
