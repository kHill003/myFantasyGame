package WeaponsTests;

import Components.WeaponDanger;
import Weapons.LightSaber;
import Weapons.SlingShot;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SlingShotTest {


    SlingShot slingShot;

    WeaponDanger weaponDanger;

    @Before
    public void before() {
        weaponDanger = new WeaponDanger(40);
        slingShot = new SlingShot("brown", weaponDanger);
    }

    @Test
    public void getColorWorks() {
        assertEquals("brown", slingShot.getColor());
    }

    @Test
    public void getDanger() {
        assertEquals(40, weaponDanger.getDangerAmount());
    }
}




