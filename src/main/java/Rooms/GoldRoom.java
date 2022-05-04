package Rooms;

import Components.WeaponDanger;
import Players.Barbarian;
import Players.Dwarf;
import Weapons.GlueGun;
import Weapons.LightSaber;
import Weapons.Weapon;

public class GoldRoom {
    Barbarian barbarian;
    GlueGun glueGun;
    LightSaber lightSaber;
    Dwarf dwarf;
    WeaponDanger weaponDanger1;
    WeaponDanger weaponDanger2;




   public GoldRoom( ) {
       weaponDanger1 = new WeaponDanger(50);
       weaponDanger2 = new WeaponDanger(89);
       this.barbarian = new Barbarian("Tim");
       this.dwarf = new Dwarf("James");
       this.glueGun = new GlueGun("red", weaponDanger1);
       this.lightSaber = new LightSaber("gold",weaponDanger2);

   }

    public String getColorWorks(){
      String x =  lightSaber.getColor();
      return lightSaber.getColor();
    }
    public String getColorWorks1(){
        String z =  lightSaber.getColor();
        return glueGun.getColor1();
    }
    public int getDangerAmount1(){
       int x = weaponDanger1.getDangerAmount();
       System.out.print(x);
      return weaponDanger1.getDangerAmount();
   }
    public int getDangerAmount2(){
        int x = weaponDanger2.getDangerAmount();
        System.out.print(x);
        return weaponDanger2.getDangerAmount();
    }
}



