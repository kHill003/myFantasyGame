package WeaponsTests;

import Components.WeaponDanger;
import Players.Barbarian;
import Weapons.GlueGun;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GlueGunTest {
    GlueGun glueGun;
    WeaponDanger weaponDanger;

    @Before
    public void before() {
        weaponDanger = new WeaponDanger(60);
        glueGun = new GlueGun("purple",weaponDanger);
        }

    @Test
    public void getColorWorks(){
        assertEquals("purple", glueGun.getColor());
    }
    @Test
    public void getDanger(){
        assertEquals(60,weaponDanger.getDangerAmount());
    }
}



