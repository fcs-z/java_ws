package java3_CustomGeneric;

/**
 * @author Fcs
 * @description
 * @date 2024-10-29 8:58
 */
public class SubOrder extends Order<String>{
    public SubOrder() {
    }

    public SubOrder(String name, String orderT) {
        super(name, orderT);
    }
}
