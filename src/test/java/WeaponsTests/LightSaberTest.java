package WeaponsTests;

import Components.WeaponDanger;
import Weapons.GlueGun;
import Weapons.LightSaber;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LightSaberTest {

LightSaber lightSaber;
WeaponDanger weaponDanger;

    @Before
    public void before() {
        weaponDanger = new WeaponDanger(90);
        lightSaber = new LightSaber("silver",weaponDanger);
    }

    @Test
    public void getColorWorks(){
        assertEquals("silver", lightSaber.getColor());
    }
    @Test
    public void getDanger(){
        assertEquals(90,weaponDanger.getDangerAmount());
    }
}







