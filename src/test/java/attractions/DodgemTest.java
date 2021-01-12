package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class DodgemTest {

    Dodgems dodgems;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void setUp() throws Exception {
        dodgems = new Dodgems("Bumper Cars", 5);
        visitor1 = new Visitor(10, 146, 5.43);
        visitor2 = new Visitor(15, 201, 14.63);

    }


    @Test
    public void hasName() {
        assertEquals("Bumper Cars", dodgems.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(5, dodgems.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, dodgems.getVisitCount());
    }

    @Test
    public void hasDefaultPrice(){
        assertEquals(4.50, dodgems.defaultPrice(), 0.01);
    }

    @Test
    public void canGetPriceForVisitor__under12YearsOld(){
        assertEquals(2.25, dodgems.priceFor(visitor1), 0.01);
    }

    @Test
    public void canGetPriceForVisitor__over12YearsOld(){
        assertEquals(4.50, dodgems.priceFor(visitor2), 0.01);
    }

    @Test
    public void canGetPriceForVisitor__null(){
        assertEquals(0.00, dodgems.priceFor(null), 0.01);
    }


}
