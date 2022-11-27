package people;

import accessories.Accessory;
import instruments.Instrument;

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

    public void addInstrument(Instrument instrument) {
        this.ownedInstruments.add(instrument);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public ArrayList<Instrument> getOwnedInstruments() {
        return ownedInstruments;
    }

    public void setOwnedInstruments(ArrayList<Instrument> ownedInstruments) {
        this.ownedInstruments = ownedInstruments;
    }

    public ArrayList<Accessory> getOwnedAccessories() {
        return ownedAccessories;
    }

    public void setOwnedAccessories(ArrayList<Accessory> ownedAccessories) {
        this.ownedAccessories = ownedAccessories;
    }
}
