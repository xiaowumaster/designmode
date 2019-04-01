package chuangjianxing.singleton.internalclassSingleton;

/**
 * @author xiaowu
 * @create 2019-03-29  17:07
 */
/*
*
*
* 内部类的实现

      优点：延迟加载，线程安全（java中class加载时互斥的），也减少了内存消耗。
*
*
* */
public class SingletonInner {
    private static class SingletonHolder {
        private static SingletonInner instance = new SingletonInner();
    }

    /**
     * 私有的构造函数
     */
    private SingletonInner() {

    }

    public static SingletonInner getInstance() {
        return SingletonHolder.instance;
    }

    protected void method() {
        System.out.println("SingletonInner");
    }
}
