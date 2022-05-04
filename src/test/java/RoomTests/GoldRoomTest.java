package RoomTests;

import Components.WeaponDanger;
import Players.Barbarian;
import Players.Dwarf;
import Rooms.GoldRoom;
import Weapons.GlueGun;
import Weapons.LightSaber;
import Weapons.WaterBalloon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GoldRoomTest {
    Barbarian barbarian;
    GlueGun glueGun;
    LightSaber lightSaber;
    Dwarf dwarf;
    WeaponDanger weaponDanger1;
    WeaponDanger weaponDanger2;
    GoldRoom goldRoom;

    @Before
    public void before() {
        weaponDanger1 = new WeaponDanger(20);
        weaponDanger2 = new WeaponDanger(60);
        glueGun = new GlueGun("purple", weaponDanger1);
        lightSaber = new LightSaber("silver", weaponDanger2);
        dwarf = new Dwarf("Alice");
        barbarian = new Barbarian("Holly");
        goldRoom = new GoldRoom();

    }
    @Test
    public void getNameWorks(){
        assertEquals("Holly", barbarian.getName());
    }
//    @Test
//    public void getColorWorks(){
//        assertEquals("purple", GoldRoom.getWeaponColor1());
//    }
//    @Test
//    public void getDanger(){
//        assertEquals(20,weaponDanger1.getDangerAmount());
//    }
//    @Test
//    public void checkDanger1(){
//        assertEquals(20,goldRoom.getDangerAmount1());
//    }
    @Test
    public void getColorWorksTest(){
        assertEquals("gold", goldRoom.getColorWorks());
    }
    @Test
    public void getColorWorksTest1(){
        assertEquals("red", goldRoom.getColorWorks1());
    }
    @Test
    public void getTestDanger1(){
        assertEquals(50,goldRoom.getDangerAmount1());
    }
    @Test
    public void getTestDanger2(){
        assertEquals(89,goldRoom.getDangerAmount2());
    }
}
