package test;
import spil.Roll;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Injam DCF
 */
public class RollIT {

    /**
     * Test of terning1 method, of class Roll.
     */
    @Test
    public void testTerning1() {
        System.out.println("terning1");
        Roll instance = new Roll();
        int result = instance.terning1();
        if (result > 6 || result < 1) {
            fail("terning er er ikke begrænset ");
        }
    }

    /**
     * Test of terning2 method, of class Roll.
     */
    @Test
    public void testTerning2() {
        System.out.println("terning2");
        Roll instance = new Roll();
        int result = instance.terning2();
        if (result > 6 || result < 1) {
            fail("terning er er ikke begrænset ");
        }
    }

    /**
     * Test of ekstraRoll method, of class Roll.
     */
    @Test
    public void testEkstraRoll() {
        System.out.println("ekstraRoll");
        int player = 1;
        Roll instance = new Roll();
        int result = instance.ekstraRoll(player);
        if (result < 1) {
            fail("terning er er ikke begrænset ");
        }
    }

}
