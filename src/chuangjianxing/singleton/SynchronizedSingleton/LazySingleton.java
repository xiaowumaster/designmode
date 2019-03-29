package chuangjianxing.singleton.SynchronizedSingleton;

/**
 * @author xiaowu
 * @create 2019-03-29  16:45
 */

/*
*
* 加同步锁

     优点：解决了线程不安全的问题。

     缺点：效率有点低，每次调用实例都要判断同步锁
*
*
* */
public class LazySingleton {
    private static LazySingleton lazySingleton = null;

    private LazySingleton() {

    }

    /*public static synchronized LazySingleton getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }*/
    //也可以写成这种形式
    public static LazySingleton getInstance() {
        synchronized (LazySingleton.class) {
            if (lazySingleton == null) {
                lazySingleton = new LazySingleton();
            }
        }
        return lazySingleton;
    }



}
