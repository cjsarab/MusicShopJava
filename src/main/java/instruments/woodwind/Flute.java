package instruments.woodwind;

public class Flute extends Woodwind {

    public Flute(String family, String name, String material, String brand, int serialNumber, double buyPrice, double sellPrice) {
        super(family, name, material, brand, serialNumber, buyPrice, sellPrice);
    }

    public String play() {
        return "I'm a flute! Pi pi pi!";
    }
}
