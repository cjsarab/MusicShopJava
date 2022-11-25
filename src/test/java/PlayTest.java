import instruments.Instrument;
import instruments.woodwind.Flute;
import instruments.woodwind.Woodwind;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayTest {

    Flute flute;

    @Before
    public void before() {
        flute = new Flute("Woodwind", "Flute", "Wood", "Yamaha", 012345, 20.00, 40.00);
    }

    @Test
    public void instrumentCanBePlayed() {
        assertEquals("I'm a flute! Pi pi pi!", flute.play());
    }

    @Test
    public void instrumentHasFamily() {
        assertEquals("Woodwind", flute.getFamily());
    }

    @Test
    public void instrumentHasName() {
        assertEquals("Flute", flute.getName());
    }

    @Test
    public void instrumentHasMaterial() {
        assertEquals("Wood", flute.getMaterial());
    }

    @Test
    public void instrumentHasBrand() {
        assertEquals("Yamaha", flute.getBrand());
    }

    @Test
    public void instrumentHasSerialNumber() {
        assertEquals(012345, flute.getSerialNumber());
    }

    @Test
    public void instrumentHasBuyPrice() {
        assertEquals(20.00, flute.getBuyPrice(), 0.0);
    }

    @Test
    public void instrumentHasSellPrice() {
        assertEquals(40.00, flute.getSellPrice(), 0.0);
    }

}
