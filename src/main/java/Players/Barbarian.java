package Players;

import Weapons.Weapon;

import java.util.ArrayList;

public class Barbarian extends Player{
    private ArrayList<Weapon>weapons;

    public Barbarian(String name){
        super(name);
        this.weapons = new ArrayList<>();

    }
  public int getWeaponCount(){
      return this.weapons.size();
  }

  public void addVWeapon(Weapon weapon){
     this.weapons.add(weapon);
    }

}


