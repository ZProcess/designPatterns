package 创建型模式.单例模式;

//饿汉模式--静态代码块
public class Singleton_2 {

    private static Singleton_2 instance;

    static {
        instance = new Singleton_2();
    }

    public static Singleton_2 getInstance(){
        return instance;
    }

    public static void main(String[] args) {
        Singleton_2 singleton2 = Singleton_2.getInstance();
        Singleton_2 singleton3 = Singleton_2.getInstance();
        System.out.println(singleton3 == singleton2);
    }
}
