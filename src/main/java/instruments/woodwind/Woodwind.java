package instruments.woodwind;

import instruments.Instrument;

public abstract class Woodwind extends Instrument {

    public Woodwind(String family, String name, String material, String brand, int serialNumber, double buyPrice, double sellPrice) {
        super(family, name, material, brand, serialNumber, buyPrice, sellPrice);
    }
}
