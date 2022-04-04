package unidad3.minecraft.item.tool.weapon;

public class Bow extends Weapon {
    public Integer ammo;
    public Integer chargePercentage;

    public Bow(Integer ammo) {
        super("BOW", "textures/items/tools/weapons/bow.png");
        this.ammo = ammo;
        this.chargePercentage = 0;
    }

    @Override
    public Integer getDamage() {
        if (chargePercentage == 100) return 11;
        else if (chargePercentage > 80) return 8;
        else if (chargePercentage > 50) return 5;
        else if (chargePercentage > 1) return 3;
        else return 0;
    }

    public void setAmmo(Integer ammo) {
        this.ammo = ammo;
    }

    public Integer getAmmo() {
        return ammo;
    }

    public void setChargePercentage(Integer chargePercentage) {
        this.chargePercentage = chargePercentage;
    }

    public Integer getChargePercentage() {
        return chargePercentage;
    }

    public void throwArrow() {
        if (ammo > 0) {
            if (chargePercentage > 0) System.out.println("Arrow launched with " + chargePercentage + "% charge, damage: " + getDamage());
            else System.out.println("No charge");

        } else System.out.println("No arrows left");
    }
}
