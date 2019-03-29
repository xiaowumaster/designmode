package chuangjianxing.singleton.DoubleCheckedSingleton;

/**
 * @author xiaowu
 * @create 2019-03-29  16:45
 */

/*
*
* 双重检验锁

      要优化（2）中因为每次调用实例都要判断同步锁的问题，很多人都使用下面的一种双重判断校验的办法。

     优点：在并发量不多，安全性不高的情况下或许能很完美运行单例模式

    缺点：不同平台编译过程中可能会存在严重安全隐患。
*
*
* */
public class LazySingleton {
    private static LazySingleton lazySingleton = null;

    private LazySingleton() {

    }

    public static LazySingleton getInstance() {
        if (lazySingleton == null) {
            synchronized (LazySingleton.class) {
                if (lazySingleton == null) {
                    lazySingleton = new LazySingleton();
                }
            }
        }
        return lazySingleton;
    }



}
