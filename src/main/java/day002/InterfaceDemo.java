package day002;

/**
 * @author gongpeng
 * @date 2022/5/18 17:23
 */
public interface InterfaceDemo {

    default void show(){
        System.out.println("show method");
    }

    void say();
}
