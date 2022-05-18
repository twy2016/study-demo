package day001;

/**
 * @author gongpeng
 * @date 2022/5/17 9:56
 */
public class TestClass implements TestInterface{

    @Override
    public void show() {
        System.out.println("test show method");
    }

    @Override
    public void say() {
        System.out.println("test say method");
    }

    public static void main(String[] args) {
        TestClass testClass = new TestClass();
        testClass.show();
        testClass.say();
    }
}
