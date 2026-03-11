import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WrapperTest {
    @Test
    public void BaoZhuangTest(){
        int i = 1;
        Integer in1 = new Integer(i);
        System.out.println(in1);
        System.out.println(in1.toString());

        Integer in2 = i + 1;
        System.out.println(in2);

    }
}