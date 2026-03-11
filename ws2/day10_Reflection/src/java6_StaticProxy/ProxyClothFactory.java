package java6_StaticProxy;

/**
 * @author Fcs
 * @description
 * @date 2024-11-07 19:30
 */

// 代理类
public class ProxyClothFactory implements ClothFactory {

    private ClothFactory factory;

    public ProxyClothFactory(ClothFactory factory) {
        this.factory = factory;
    }

    @Override
    public void produceCloth() {
        System.out.println("代理工厂做一些准备工作");
        factory.produceCloth();
        System.out.println("代理工厂做一些后续的工作");
    }
}
