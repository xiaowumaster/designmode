package chuangjianxing.singleton.lazy;

/**
 * @author xiaowu
 * @create 2019-03-29  16:45
 */
public class LazySingleton {
    private static LazySingleton lazySingleton = null;

    private LazySingleton() {

    }

    public static LazySingleton getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
