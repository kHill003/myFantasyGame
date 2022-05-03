package WeaponsTests;

import Components.WeaponDanger;
import Weapons.Sword;
import Weapons.WaterBalloon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBalloonTest {
  WaterBalloon waterBalloon;
    WeaponDanger weaponDanger;

    @Before
    public void before() {
        weaponDanger = new WeaponDanger(20);
        waterBalloon = new WaterBalloon("orange",weaponDanger);
    }

    @Test
    public void getColorWorks(){
        assertEquals("orange", waterBalloon.getColor());
    }
    @Test
    public void getDanger(){
        assertEquals(20,weaponDanger.getDangerAmount());
    }
}




