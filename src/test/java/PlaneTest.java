import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane planeA;
    Plane planeB;


    @Before
    public void setup(){
        planeA = new Plane(PlaneType.BOEING747, "JT182");
        planeB = new Plane(PlaneType.TEST_TYPE, "TEST");
    }



    @Test
    public void canHaveType(){
        assertEquals(PlaneType.BOEING747, planeA.getType());
    }

    @Test
    public void canBeServicedForUse() {
        planeA.makeAvailable();
        assertEquals(true, planeA.isServiced());
    }

    @Test
    public void canBeGrounded(){
        planeA.makeAvailable();
        planeA.ground();
        assertEquals(false, planeA.isServiced());
    }

    @Test
    public void hasBaggageLimit() {
        assertEquals(80, planeB.getTotalWeightLimit());
    }


}
