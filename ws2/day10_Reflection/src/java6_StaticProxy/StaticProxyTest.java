package java6_StaticProxy;

import org.junit.Test;

/**
 * @author Fcs
 * @description 静态代理： 特点:代理类和被代理类在编译期间，就确定下来了。
 * @date 2024-11-07 19:33
 */
public class StaticProxyTest {
    @Test
    public void test() {
        // 创建被代理类的对象
//        NikeClothFactory nike = new NikeClothFactory();
        ClothFactory nike = new NikeClothFactory();
        // 创建代理类的对象
//        ProxyClothFactory proxyClothFactory = new ProxyClothFactory(nike);
        ClothFactory proxyClothFactory = new ProxyClothFactory(nike);
        proxyClothFactory.produceCloth();
    }
}
