package service;

/**
 * @author:Fcs
 * @className:Status
 * @description:
 * @date:2021/8/10 13:46
 * @version:0.1
 * @since:1.8
 */
public class Status {
    private final String NAME;
    private Status(String name) {
        this.NAME = name;
    }
    public static final Status FREE = new Status("FREE");
    public static final Status VOCATION = new Status("VOCATION");
    public static final Status BUSY = new Status("BUSY");
    public String getNAME() {
        return NAME;
    }
    @Override
    public String toString() {
        return NAME;
    }
}
