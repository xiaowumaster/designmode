package jiegouxing.adapter.classadapter;

/**
 * @author xiaowu
 * @create 2019-04-01  17:24
 */
/*
 * 有一个Source类，拥有一个方法，待适配，目标接口是Targetable，通过Adapter类，将Source的功能扩展到Targetable里
 * */
public class Test {
    public static void main(String[] args) {
        Targetable target = new Adapter();
        target.method1();
        target.method2();
    }
}
