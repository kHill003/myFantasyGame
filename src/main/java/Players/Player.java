package Players;

import Weapons.Weapon;

import java.util.ArrayList;

public  abstract class Player {
    private String name;
    private ArrayList<Weapon> weapons;



    public Player(String name){
      this.name = name;
      this.weapons = new ArrayList<>();
    }
    public String getName() {
        return name;
    }
    public int WeaponCount(){
        return this.weapons.size();
    }

}
