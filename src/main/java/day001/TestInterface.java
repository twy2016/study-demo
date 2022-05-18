package day001;

/**
 * @author gongpeng
 * @date 2022/5/17 9:54
 */
public interface TestInterface {

    default  void show(){
        System.out.println("show method");
    }

    void say();
}
