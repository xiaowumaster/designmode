package chuangjianxing.abstractfactory;

/**
 * @author xiaowu
 * @create 2019-03-29  16:14
 */
public class SmsFactory implements ProduceFactory {

    @Override
    public Sender produce() {

        return new SmsSender();
    }
}
