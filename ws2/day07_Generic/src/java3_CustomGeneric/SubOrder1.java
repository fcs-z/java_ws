package java3_CustomGeneric;

/**
 * @author Fcs
 * @description
 * @date 2024-10-29 9:01
 */
public class SubOrder1<T> extends Order<T>{
    public SubOrder1() {
    }

    public SubOrder1(String name, T orderT) {
        super(name, orderT);
    }
}
