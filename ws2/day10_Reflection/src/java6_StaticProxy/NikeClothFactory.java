package java6_StaticProxy;

/**
 * @author Fcs
 * @description
 * @date 2024-11-07 19:34
 */
// 被代理类
public class NikeClothFactory implements ClothFactory{

    @Override
    public void produceCloth() {
        System.out.println("Nike生产一些衣服");
    }
}
