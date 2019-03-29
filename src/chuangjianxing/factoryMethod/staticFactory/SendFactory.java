package chuangjianxing.factoryMethod.staticFactory;

/**
 * @author xiaowu
 * @create 2019-03-29  15:51
 */
public class SendFactory {

    public static Sender produceMail() {
        return new MailSender();
    }

    public static Sender produceSms() {
        return new SmsSender();
    }
}
