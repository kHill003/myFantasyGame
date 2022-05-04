package CharcterTests;

import Players.Barbarian;
import Weapons.Weapons;
import org.junit.Before;
import org.junit.Test;

import Weapons.LightSaber;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {
  Barbarian barbarian;
  Weapons   weapons;
  LightSaber lightSaber;


    @Before
    public void before() {
        barbarian = new Barbarian("Harry");
    }

    @Test
    public void getNameWorks(){
        assertEquals("Harry", barbarian.getName());
    }

    @Test
    public void canWeaponCount(){
        assertEquals(0, barbarian.getWeaponCount());
    }
    @Test
    public void canAddWeapon(){
        barbarian.addVWeapon(lightSaber);
        assertEquals(1, barbarian.getWeaponCount());}
    }
   // @Test
    //public void canAddCar(){
     //   customer.addVehicle(car);
      //  assertEquals(1, customer.getVehicleCount());
    //}

