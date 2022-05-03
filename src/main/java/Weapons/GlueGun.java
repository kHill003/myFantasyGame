package Weapons;

import Components.WeaponDanger;

public class GlueGun extends Weapons {
    WeaponDanger weaponDanger;

    public GlueGun(String color, WeaponDanger weaponDanger) {
        super(color);
        this.weaponDanger = weaponDanger;
    }
}
