/**
 * @author:Fcs
 * @className:LeafTest
 * @description:
 * @date:2021/8/1 10:40
 * @version:0.1
 * @since:1.8
 */
//总结：由父及子，静态先行

public class LeafTest {
    public static void main(String[] args) {
        new Leaf();
        System.out.println();
        //new Leaf();
    }
}
class Root{
    static {
        System.out.println("Root的静态初始化块");
    }
    {
        System.out.println("Root的普通初始化块");
    }
    public Root(){
        System.out.println("Root的无参数构造器");
    }
}

class Mid extends Root{
    static {
        System.out.println("Mid的静态初始化块");
    }
    {
        System.out.println("Mid的普通初始化块");
    }
    public Mid(){
        System.out.println("Mid的无参数构造器");
    }
    public Mid (String msg){
        this();
        System.out.println("Mid的带参数构造器，其参数值：" + msg);
    }
}

class Leaf extends Mid{
    static {
        System.out.println("Leaf的静态初始化块");
    }
    {
        System.out.println("Leaf的普通初始化块");
    }
    public Leaf(){
        super("123");
        System.out.println("Leaf的构造器");
    }
}


