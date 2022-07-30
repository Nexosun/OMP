package UE05.Exercise2;

public class BillItem {
    protected double price;
    protected CarComponent item;

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setItem(CarComponent item) {
        this.item = item;
    }

    public CarComponent getItem() {
        return item;
    }
                // toString method needs to be implemented
}
