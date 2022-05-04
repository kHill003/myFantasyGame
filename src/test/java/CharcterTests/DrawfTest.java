package CharcterTests;

import Players.Dwarf;
import Weapons.Weapons;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import Weapons.GlueGun;

public class DrawfTest
{
    Dwarf dwarf;
    Weapons weapons;
    GlueGun glueGun;

    @Before
    public void before() {
        dwarf = new Dwarf("Tim");
    }
    @Test
    public void getNameWorks(){
        assertEquals("Tim", dwarf.getName());
    }
    @Test
    public void canWeaponCount(){
        assertEquals(0, dwarf.getWeaponCount());
    }
    @Test
    public void canAddWeapon(){
        dwarf.addVWeapon(glueGun);
        assertEquals(1, dwarf.getWeaponCount());}
}


