package InterfaceTests;

import Components.WeaponDanger;
import Weapons.GlueGun;
import Weapons.WaterBalloon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class IFightTest {
    GlueGun glueGun;
    WaterBalloon waterBalloon;
    WeaponDanger weaponDanger1;
    WeaponDanger weaponDanger2;

    @Before
    public void before() {
        weaponDanger1 = new WeaponDanger(60);
        weaponDanger2 = new WeaponDanger(70);
        glueGun = new GlueGun("purple", weaponDanger1);
        waterBalloon = new WaterBalloon("green", weaponDanger2);
    }

    @Test
    public void getColorWorks() {
        assertEquals("purple", glueGun.getColor());
    }

    @Test
    public void getDanger1() {
        assertEquals(60, weaponDanger1.getDangerAmount());
    }

    @Test
    public void getDanger2() {
        assertEquals(70, weaponDanger2.getDangerAmount());

    }
}







