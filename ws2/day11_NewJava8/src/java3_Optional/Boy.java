package java3_Optional;

/**
 * @author Fcs
 * @description
 * @date 2024-11-11 22:14
 */
public class Boy {
    private Girl girl;

    public Boy() {
    }
    public Boy(Girl girl) {
        this.girl = girl;
    }

    public Girl getGirl() {
        return girl;
    }

    public void setGirl(Girl girl) {
        this.girl = girl;
    }

    @Override
    public String toString() {
        return "Boy{" +
                "girl=" + girl +
                '}';
    }
}
