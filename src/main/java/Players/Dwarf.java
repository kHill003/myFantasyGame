package Players;

import Weapons.Weapons;

import java.util.ArrayList;

public class Dwarf extends Player {
    private ArrayList<Weapons> weapons;
    public Dwarf(String name){
        super(name);
        this.weapons = new ArrayList<>();

    }
    public int getWeaponCount(){
        return this.weapons.size();
    }

    public void addVWeapon(Weapons weapon){
        this.weapons.add(weapon);
    }
}



