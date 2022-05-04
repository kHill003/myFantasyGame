package CharcterTests;

import Players.Troll;
import org.junit.Before;
import org.junit.Test;
import Weapons.WaterBalloon;

import static org.junit.Assert.assertEquals;

public class TrollTest {
    Troll troll;
    WaterBalloon waterBalloon;

    @Before
    public void before() {
      troll = new Troll("Boris");
    }
    @Test
    public void getNameWorks(){
        assertEquals("Boris", troll.getName());
    }
    @Test
    public void canWeaponCount(){
        assertEquals(0, troll.getWeaponCount());
    }
    @Test
    public void canAddWeapon(){
       troll.addVWeapon(waterBalloon);
        assertEquals(1, troll.getWeaponCount());}
}

