package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {
    Playground playground;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void setUp() throws Exception {
        playground = new Playground("Fun Zone", 7);
        visitor1 = new Visitor(20, 186, 25.43);
        visitor2 = new Visitor(10, 143, 14.63);
    }

    @Test
    public void hasName() {
        assertEquals("Fun Zone", playground.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(7, playground.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, playground.getVisitCount());
    }

    @Test
    public void visitorCanEnter__True(){
        assertEquals(true, playground.isAllowedTo(visitor2));
    }

    @Test
    public void visitorCanEnter__False(){
        assertEquals(false, playground.isAllowedTo(visitor1));
    }
}
