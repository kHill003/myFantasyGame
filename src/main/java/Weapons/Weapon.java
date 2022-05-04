package Weapons;

public  abstract class Weapon {
    private String color;
    private String color1;
    private String color2;

    public Weapon(String color){
        this.color = color;
        this.color1 = color;
        this.color2 = color;

    }
    public String getColor() {
        return color;
    }
    public String getColor1() {
        return color1;
    }
    public String getColor2() {
        return color2;
    }

}


