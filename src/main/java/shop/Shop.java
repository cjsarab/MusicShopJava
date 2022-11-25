package shop;

import accessories.Accessory;
import instruments.Instrument;

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
}
