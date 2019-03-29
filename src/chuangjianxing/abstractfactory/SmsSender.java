package chuangjianxing.abstractfactory;
/**
 * @author xiaowu
 * @create 2019-03-29  15:50
 */
public class SmsSender extends Sender {

    @Override
    public void send() {
        System.out.println("this is smssender");
    }
}
