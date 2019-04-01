package jiegouxing.adapter.classadapter;

/**
 * @author xiaowu
 * @create 2019-04-01  17:22
 */

public class Adapter extends Source implements Targetable {
    @Override
    public void method2() {
        System.out.println("this is targetable method");
    }
}
