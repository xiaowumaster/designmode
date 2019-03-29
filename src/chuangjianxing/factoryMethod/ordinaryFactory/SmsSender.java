package chuangjianxing.factoryMethod.ordinaryFactory;

/**
 * @author xiaowu
 * @create 2019-03-29  15:50
 */
public class SmsSender implements Sender {
    @Override
    public void send() {
        System.out.println("this is smssender");
    }
}
