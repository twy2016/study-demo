package day002;

/**
 * @author gongpeng
 * @date 2022/5/18 17:31
 */
public class Demo implements InterfaceDemo {

    @Override
    public void say() {
        System.out.println("demo say method");
    }

    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.show();
        demo.say();
    }
}
