import accessories.Accessory;
import instruments.Instrument;
import instruments.woodwind.Flute;
import org.junit.Before;
import org.junit.Test;
import people.Customer;
import shop.Shop;

import java.sql.Array;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Flute flute;
    Customer customerRich;
    Customer customerPoor;

    @Before
    public void before () {
        ArrayList instrumentsInStock = new ArrayList<Instrument>();
        ArrayList accessoriesInStock = new ArrayList<Accessory>();
        ArrayList ownedAccessories = new ArrayList<Accessory>();
        ArrayList ownedInstruments = new ArrayList<Accessory>();

        ArrayList<Accessory> expectedAccessoriesInStock = new ArrayList<Accessory>();
        shop = new Shop("Cammy's Music Store", 50000.00, instrumentsInStock, accessoriesInStock);
        flute = new Flute("Woodwind", "Flute", "Wood", "Yamaha", 012345, 20.00, 40.00);
        customerRich = new Customer("Richard", 300.00, ownedInstruments, ownedAccessories);
        customerPoor = new Customer("Mr. Poor", 5.00, ownedInstruments, ownedAccessories);
    }

    @Test
    public void shopHasName() {
        assertEquals("Cammy's Music Store", shop.getName());
    }

    @Test
    public void shopHasTill() {
        assertEquals(50000.00, shop.getTill(), 0.0);
    }

    @Test
    public void shopHasInstrumentsInStock() {
        ArrayList<Instrument> expectedInstrumentsInStock = new ArrayList<Instrument>();
        assertEquals(expectedInstrumentsInStock, shop.getInstrumentsInStock());
    }

    @Test
    public void shopHasAccessoriesInStock() {
        ArrayList<Accessory> expectedAccessoriesInStock = new ArrayList<Accessory>();
        assertEquals(expectedAccessoriesInStock, shop.getAccessoriesInStock());
    }

    @Test
    public void shopCanBuyInstrument() {
        shop.buyInstrument(flute);
        ArrayList<Instrument> expectedInstrumentsInStock = new ArrayList<Instrument>();
        expectedInstrumentsInStock.add(flute);
        assertEquals(expectedInstrumentsInStock, shop.getInstrumentsInStock());
        assertEquals(49980.00, shop.getTill(), 0.0);
    }

    @Test
    public void shopCantBuyInstrumentIfInsufficientFunds() {
        shop.setTill(19.00);
        shop.buyInstrument(flute);
        ArrayList<Instrument> expectedInstrumentsInStock = new ArrayList<Instrument>();
        assertEquals(expectedInstrumentsInStock, shop.getInstrumentsInStock());
        assertEquals(19.00, shop.getTill(), 0.0);
    }

    @Test
    public void shopCanSellInstrumentToCustomer() {
        ArrayList instrumentsInStock = new ArrayList<Instrument>();
        instrumentsInStock.add(flute);
        shop.setInstrumentsInStock(instrumentsInStock);
        ArrayList<Instrument> expectedInstrumentsInStock = new ArrayList<Instrument>();
        expectedInstrumentsInStock.add(flute);
        shop.sellInstrument(flute);
        expectedInstrumentsInStock.remove(flute);
        assertEquals(expectedInstrumentsInStock, shop.getInstrumentsInStock());

    }

}
