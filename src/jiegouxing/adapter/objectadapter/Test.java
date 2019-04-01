package jiegouxing.adapter.objectadapter;

/**
 * @author xiaowu
 * @create 2019-04-01  17:44
 */
public class Test {
    public static void main(String[] args) {
        Sourceable source1 = new SourceSub1();
        Sourceable source2 = new SourceSub2();

        source1.method1();
        source1.method2();
        source2.method1();
        source2.method2();
    }
}
