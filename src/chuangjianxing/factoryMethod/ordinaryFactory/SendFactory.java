package chuangjianxing.factoryMethod.ordinaryFactory;

/**
 * @author xiaowu
 * @create 2019-03-29  15:51
 */

/*
*
* 普通工厂模式：直接传入想要的对象然后通过一个工厂来生产出需要的对象，一个工厂可以产出多种对象
* 多工厂模式：在普通工厂的的基础上把生产每个对象的工厂独立出来生产对象
* 静态工厂模式：在多工厂模式下在加上静态，就可以直接调用，无需实例化工厂类
*
* */
public class SendFactory {
    public Sender produce(String type) {
        if ("mail".equalsIgnoreCase(type)) {
            return new MailSender();
        } else if ("sms".equalsIgnoreCase(type)) {
            return new SmsSender();
        } else {
            System.out.println("请输入存在的类型");
        }
        return null;
    }
}
