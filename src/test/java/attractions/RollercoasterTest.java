package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor1 = new Visitor(10, 138, 5.43);
        visitor2 = new Visitor(15, 201, 14.63);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void hasDefaultPrice(){
        assertEquals(8.40, rollerCoaster.defaultPrice(), 0.01);
    }

    @Test
    public void canGetPriceForVisitor__under200InHeight(){
        assertEquals(8.40, rollerCoaster.priceFor(visitor1), 0.01);
    }

    @Test
    public void canGetPriceForVisitor__over200InHeight(){
        assertEquals(16.80, rollerCoaster.priceFor(visitor2), 0.01);
    }

    @Test
    public void canGetPriceForVisitor__null(){
        assertEquals(0.00, rollerCoaster.priceFor(null), 0.01);
    }

    @Test
    public void visitorCanRide__True(){
        assertEquals(true, rollerCoaster.isAllowedTo(visitor2));
    }

    @Test
    public void visitorCanRide__False(){
        assertEquals(false, rollerCoaster.isAllowedTo(visitor1));
    }
}

