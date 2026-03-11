package java7_DynamicProxy;

/**
 * @author Fcs
 * @description
 * @date 2024-11-07 19:44
 */
// 被代理类
public class SuperMan implements Human{
    @Override
    public String getBelief() {
        return "I believe i can fly";
    }

    @Override
    public void eat(String food) {
        System.out.println("我喜欢吃" + food);
    }
}


class HumanUtil{
    public void method1(){
        System.out.println("****通用方法一****");
    }

    public void method2(){
        System.out.println("****通用方法二****");
    }
}
