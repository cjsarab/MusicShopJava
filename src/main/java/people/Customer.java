package people;

import accessories.Accessory;
import instruments.Instrument;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Customer {

    private String name;
    private double money;
    private ArrayList<Instrument> ownedInstruments;
    private ArrayList<Accessory> ownedAccessories;

    public Customer(String name, double money, ArrayList<Instrument> ownedInstruments, ArrayList<Accessory> ownedAccessories) {
        this.name = name;
        this.money = money;
        this.ownedInstruments = ownedInstruments;
        this.ownedAccessories = ownedAccessories;
    }
}
