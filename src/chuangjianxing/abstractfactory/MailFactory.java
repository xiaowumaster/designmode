package chuangjianxing.abstractfactory;

/**
 * @author xiaowu
 * @create 2019-03-29  16:18
 */
public class MailFactory implements ProduceFactory {
    @Override
    public Sender produce() {

        return new MailSender();
    }
}
