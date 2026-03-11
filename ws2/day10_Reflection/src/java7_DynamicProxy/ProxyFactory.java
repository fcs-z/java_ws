package java7_DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author Fcs
 * @description
 * @date 2024-11-07 19:49
 */
// 代理类
public class ProxyFactory {
    // 调用此方法，返回一个代理类的对象。   解决问题一
    public static Object getProxyInstance(Object obj){ // obj：被代理类的对象
        MyInvocationHandler handler = new MyInvocationHandler();

        handler.bind(obj);

        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(),handler);
    }
}

class MyInvocationHandler implements InvocationHandler {
    private Object obj; // 需要使用被代理类的对象进行赋值

    public void bind(Object obj){
        this.obj = obj;
    }

    // 当我们通过代理类的对象，调用方法a时，就会自动的调用如下的方法:invoke()
    // 将被代理类要执行的方法a的功能就声明在invoke()中
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        HumanUtil util = new HumanUtil();
        util.method1();


        // method:即为代理类对象调用的方法，此方法也就作为了被代理类对象要调用的方法
        // obj:被代理类的对象
        Object returnInvoke = method.invoke(obj, args);

        util.method2();

        // 上述方法的返回值 作为 当前类中invoke()的返回值
        return returnInvoke;
    }
}
