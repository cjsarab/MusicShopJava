package shop;

import accessories.Accessory;
import instruments.Instrument;
import instruments.woodwind.Flute;

import java.util.ArrayList;

public class Shop {
    private String name;
    private double till;
    private ArrayList<Instrument> instrumentsInStock;
    private ArrayList<Accessory> accessoriesInStock;

    public Shop(String name, double till, ArrayList<Instrument> instrumentsInStock, ArrayList<Accessory> accessoriesInStock) {
        this.name = name;
        this.till = till;
        this.instrumentsInStock = instrumentsInStock;
        this.accessoriesInStock = accessoriesInStock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTill() {
        return till;
    }

    public void setTill(double till) {
        this.till = till;
    }

    public ArrayList<Instrument> getInstrumentsInStock() {
        return instrumentsInStock;
    }

    public void setInstrumentsInStock(ArrayList<Instrument> instrumentsInStock) {
        this.instrumentsInStock = instrumentsInStock;
    }

    public ArrayList<Accessory> getAccessoriesInStock() {
        return accessoriesInStock;
    }

    public void setAccessoriesInStock(ArrayList<Accessory> accessoriesInStock) {
        this.accessoriesInStock = accessoriesInStock;
    }

    public void buyInstrument(Instrument instrument) {
        double till = this.getTill();
        double price = instrument.getBuyPrice();
        if (till >= price) {
            till -= price;
            this.setTill(till);
            instrumentsInStock.add(instrument);
        }
    }

    public void sellInstrument(Instrument instrument) {
        if (this.instrumentsInStock.contains(instrument)) {
            this.instrumentsInStock.remove(instrument);
        }

    }

}
