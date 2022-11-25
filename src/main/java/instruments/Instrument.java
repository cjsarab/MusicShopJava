package instruments;

import behaviours.IPlay;

public abstract class Instrument implements IPlay {

    private String family;
    private String name;
    private String material;
    private String brand;
    private int serialNumber;
    double buyPrice;
    double sellPrice;

    public Instrument (String family, String name, String material, String brand, int serialNumber, double buyPrice, double sellPrice) {
        this.family = family;
        this.name = name;
        this.material = material;
        this.brand = brand;
        this.serialNumber = serialNumber;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getFamily() {
        return this.family;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMaterial() {
        return material;
    }

    public String getBrand() {
        return brand;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }
}
