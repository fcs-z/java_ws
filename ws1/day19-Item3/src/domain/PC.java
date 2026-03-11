package domain;

/**
 * @author Fcs
 * @description
 * @date 2024-10-13 17:15
 */
public class PC implements Equipment{
    private String model;
    private String display;

    @Override
    public String getDescription() {
        return model + "(" + display + ")";
    }

    public PC(String model, String display) {
        this.model = model;
        this.display = display;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }
}
