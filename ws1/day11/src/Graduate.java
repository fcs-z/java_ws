/**
 * @author:Fcs
 * @className:Graduate
 * @description:
 * @date:2021/7/23 11:06
 * @version:0.1
 * @since:1.8
 */
public class Graduate extends Student {
    public String major = "IT";
    public String getinfo(){
        return "Name:" + name + "\nAge:" + age + "\nschool:" + school +
                "\nmajor:"  + major;
    }
}
