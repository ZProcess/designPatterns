package 创建型模式.单例模式;

//双重锁校验--可能由于重拍导致instance为kong，因此需要增加voliated
public class Singleton_5 {

    private static volatile Singleton_5 instance;

    public static Singleton_5 getInstance(){
        if(instance == null){
            synchronized (Singleton_5.class){
                if(instance == null){
                    return new Singleton_5();
                }
            }
        }
        return instance;
    }
}
