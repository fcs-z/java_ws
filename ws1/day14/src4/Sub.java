/**
 * @author:Fcs
 * @className:Sub
 * @description:
 * @date:2021/8/1 10:50
 * @version:0.1
 * @since:1.8
 */
class Super{
    static {
        System.out.println("111");
    }
    {
        System.out.println("222");
    }

    public Super() {
        System.out.println("333");
    }
}
public class Sub extends Super{
    static {
        System.out.println("444");
    }
    {
        System.out.println("555");
    }

    public Sub() {
        System.out.println("666");
    }

    public static void main(String[] args) {
        System.out.println("777");  //先 111  444  后777
        System.out.println();
        new Sub();
        System.out.println();

        new Sub();
        System.out.println();
        new Super();
    }
}
