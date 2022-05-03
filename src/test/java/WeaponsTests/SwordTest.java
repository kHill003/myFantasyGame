package WeaponsTests;

import Components.WeaponDanger;
import Weapons.GlueGun;
import Weapons.SlingShot;
import Weapons.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SwordTest {
    Sword sword;
    WeaponDanger weaponDanger;

    @Before
    public void before() {
        weaponDanger = new WeaponDanger(70);
        sword = new Sword("gold",weaponDanger);
    }

    @Test
    public void getColorWorks(){
        assertEquals("gold", sword.getColor());
    }
    @Test
    public void getDanger(){
        assertEquals(70,weaponDanger.getDangerAmount());
    }
}



