import accessories.Accessory;
import instruments.Instrument;
import org.junit.Before;
import org.junit.Test;
import shop.Shop;

import java.sql.Array;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;

    @Before
    public void before () {
        ArrayList instrumentsInStock = new ArrayList<Instrument>();
        ArrayList accessoriesInStock = new ArrayList<Accessory>();
        shop = new Shop("Cammy's Music Store", 50000.00, instrumentsInStock, accessoriesInStock);
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

}
