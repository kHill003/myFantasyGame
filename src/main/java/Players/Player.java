package Players;

import Weapons.Weapons;

import java.util.ArrayList;

public  abstract class Player {
    private String name;
    private ArrayList<Weapons> weapons;



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
