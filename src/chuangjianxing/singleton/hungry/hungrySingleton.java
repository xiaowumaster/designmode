package chuangjianxing.singleton.hungry;

/**
 * @author xiaowu
 * @create 2019-03-29  16:42
 */
public class hungrySingleton {
    private static hungrySingleton hungrySingleton = new hungrySingleton();

    private hungrySingleton() {

    }

    public static hungrySingleton getInstance() {
        if (hungrySingleton == null) {
            hungrySingleton = new hungrySingleton();
        }
        return hungrySingleton;
    }
}
