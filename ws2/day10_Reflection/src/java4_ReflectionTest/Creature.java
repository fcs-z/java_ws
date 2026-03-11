package java4_ReflectionTest;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author Fcs
 * @description
 * @date 2024-11-05 21:19
 */
public class Creature<T> implements Serializable {
    private char gender;
    public double weight;

    private void breath(){
        System.out.println("生物呼吸");
    }

    public void eat(){
        System.out.println("生物吃东西");
    }
}
