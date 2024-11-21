package 创建型模式.单例模式;

//饿汉模式
public class Singleton_1 {

    private static Singleton_1 instans = new Singleton_1();

    public static Singleton_1 getInstance(){
        return instans;
    }


    public static void main(String[] args) {
        Singleton_1 singleton1 = Singleton_1.getInstance();
        Singleton_1 singleton2 = Singleton_1.getInstance();
        System.out.println(singleton1 == singleton1);
    }
}
