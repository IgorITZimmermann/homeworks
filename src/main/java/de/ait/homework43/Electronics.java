package de.ait.homework43;

public class Electronics  extends Product{

    private String brand;

    public Electronics(String name, double price, String brand) {
        super(name, price);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public String getDescription() {
        return "Electronics: " + getName() + " brand: " + brand + " price: " + getPrice();
    }
}
