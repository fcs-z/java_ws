package java2_InterfacePeivateMethod;


import org.junit.Test;

/**
 * @author Fcs
 * @description
 * @date 2024-11-13 8:21
 */
public class MyInterfaceImpl implements  MyInterface{
    // 之前的
    @Override
    public void methodAbstratct() {
        System.out.println("实现类实现的抽象方法");
    }

    // 现在学习的
    @Override
    public void methodDefault() {
        System.out.println("实现类实现的默认方法");
    }


    @Test
    public void test() {
        // 接口中的静态方法只能出接口自己调用
        MyInterface.methodStatic();        // 接口中的静态方法
        // 接口的实现类不能调用接口的静态方法
        // MyInterfaceImpl.methodStatic();

        // 对象调用接口中的默认方法
        MyInterfaceImpl impl = new MyInterfaceImpl();
        impl.methodDefault();         // 若没有重写methodDefault()：接口中的默认方法 接口中的私有方法
                                    // 若重写了methodDefault()：实现类实现的默认方法

        // 接口的私有方法不能在外部调用
        // impl.methodPrivate();
    }


}
