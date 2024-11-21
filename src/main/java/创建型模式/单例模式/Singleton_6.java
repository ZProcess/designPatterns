package 创建型模式.单例模式;

//内部类
public class Singleton_6 {

    private static class InnerClass{
        private static final Singleton_6 instance = new Singleton_6();
    }

    public static Singleton_6 getInstance(){
        return InnerClass.instance;
    }
}
