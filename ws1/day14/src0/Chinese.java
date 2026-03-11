/**
 * @author:Fcs
 * @className:Chinese
 * @description:
 * @date:2021/8/2 10:41
 * @version:0.1
 * @since:1.8
 */
public class Chinese {
    String name;
    int age;
    static String nation;



    // Set  Get
    public static String getNation() {
        return nation;
    }

    public static void setNation(String nation) {
        Chinese.nation = nation;
    }


    //
    public void eat(){

    }
    public static void show(){
        System.out.println("国籍：" + nation);
        System.out.println("国籍：" + Chinese.nation);
    }

    public  void info(){
        System.out.println("name:" + name + ",age:" + age);
        show();
        Chinese.show();
    }


}
