package java2_InterfacePeivateMethod;

/**
 * @author Fcs
 * @description
 * @date 2024-11-13 8:20
 */
public interface MyInterface {
    //如下三个方法的权限修饰符都是public

    void methodAbstratct();

    static void methodStatic() {
        System.out.println("接口中的静态方法");
    }

    default void methodDefault() {
        System.out.println("接口中的默认方法");
        // 调用私有方法
        methodPrivate();
    }

    // 私有方法
    private void methodPrivate() {
        System.out.println("接口中的私有方法");
    }
}
