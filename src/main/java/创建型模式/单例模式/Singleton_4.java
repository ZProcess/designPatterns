package 创建型模式.单例模式;

//懒汉模式--线程安全
public class Singleton_4 {

    private static Singleton_4 instance;

    public static synchronized Singleton_4 getInstance(){
        if(instance == null){
            return new Singleton_4();
        }
        return instance;
    }

}
