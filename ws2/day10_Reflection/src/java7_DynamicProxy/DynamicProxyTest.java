package java7_DynamicProxy;

import java6_StaticProxy.ClothFactory;
import java6_StaticProxy.NikeClothFactory;
import org.junit.Test;

/**
 * @author Fcs
 * @description
 * @date 2024-11-07 19:43
 */

//要想实现动态代理，需要解决的问题?
//问题一:如何根据加载到内存中的被代理类，动态的创建一个代理类及其对象。
//问题二:当通过代理类的对象调用方法时，如何动态的去调用被代理类中的同名方法
public class DynamicProxyTest {
    @Test
    public void test() {
        SuperMan superMan = new SuperMan();
        // proxyInstance:代理类的对象
        Human proxyInstance = (Human) ProxyFactory.getProxyInstance(superMan);
        // 当通过代理类对象调用方法时，会自动的调用被代理类中同名的方法
        String belief = proxyInstance.getBelief(); // ****通用方法一****   ****通用方法二****
        System.out.println(belief);   // I believe i can fly
        proxyInstance.eat("火锅"); // ****通用方法一****   我喜欢吃火锅   ****通用方法二****

        System.out.println();

        NikeClothFactory nikeClothFactory = new NikeClothFactory();
        ClothFactory proxyClothFactory = (ClothFactory) ProxyFactory.getProxyInstance(nikeClothFactory);
        proxyClothFactory.produceCloth(); // ****通用方法一****   Nike生产一些衣服   ****通用方法二****
    }
}
