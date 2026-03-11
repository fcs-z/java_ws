package domain;

/**
 * @author Fcs
 * @description
 * @date 2024-10-13 17:22
 */
public class NoteBook implements Equipment{
    private String model;
    private double price;

    @Override
    public String getDescription() {
        return model + "(" + price + ")";
    }

    public NoteBook(String model, double price) {
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}
