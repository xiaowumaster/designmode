package chuangjianxing.factoryMethod.staticFactory;

/**
 * @author xiaowu
 * @create 2019-03-29  15:49
 */
public class MailSender implements Sender {
    @Override
    public void send() {
        System.out.println("this is mailsender");
    }
}
