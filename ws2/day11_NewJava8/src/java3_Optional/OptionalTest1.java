package java3_Optional;

import org.junit.Test;

import java.util.Optional;

/**
 * @author Fcs
 * @description
 * @date 2024-11-11 22:22
 */
public class OptionalTest1 {
    @Test
    public void test1() {
//        Boy boy = null;
//        Boy boy = new Boy();
        Boy boy = new Boy(new Girl("Tom and Jerry"));
        String girlName = getGirlName(boy);
        System.out.println(girlName);
    }

    // 使用Optional优化后
    public String getGirlName(Boy boy){
        Optional<Boy> optionalBoy = Optional.ofNullable(boy);

        // 此时的boy1一定非空
        Boy boy1 = optionalBoy.orElse(new Boy(new Girl("Tom")));
        Girl girl = boy1.getGirl();

        // 此时的girl1一定非空
        Optional<Girl> optionalGirl = Optional.ofNullable(girl);
        Girl girl1 = optionalGirl.orElse(new Girl("Jerry"));
        return girl1.getName();
    }

    // 优化后
    /*public String getGirlName(Boy boy){
        if(boy != null){
            Girl girl = boy.getGirl();
            if(girl != null){
                return girl.getName();
            }
        }
        return null;
    }*/

    // 以前
/*    public String getGirlName(Boy boy){
        return boy.getGirl().getName();
    }*/
}
