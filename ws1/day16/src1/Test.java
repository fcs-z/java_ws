/**
 * @author:Fcs
 * @className:Test
 * @description:
 * @date:2021/8/3 16:00
 * @version:0.1
 * @since:1.8
 */
public class Test implements C{
    private String name;

    public Test(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //对接口A和接口B都重写了method()
    public void method(){
        //test = new Ball("b");  //final
    }

    public static void main(String[] args) {
        A a = new D();
        a.method();
    }

}

interface  A{
    void method();
}

interface B{
    void method();
}

interface C extends A,B{
    Test test = new Test("a"); //属性
}

class D implements A{
    @Override
    public void method() {
        System.out.println(" A a = new D()");
        System.out.println(" a.method()");
    }
}