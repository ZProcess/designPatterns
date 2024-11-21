package 创建型模式.单例模式;

//懒汉模式--线程不安全
public class Singleton_3 {

    private static Singleton_3 instance;

    public static Singleton_3 getInstance(){
        if(instance == null){
            return new Singleton_3();
        }
        return instance;
    }
}
