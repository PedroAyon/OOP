package unidad3.minecraft.item.tool.weapon;

import unidad3.minecraft.block.Block;
import unidad3.minecraft.item.tool.Tool;

public abstract class Weapon extends Tool {

    public Weapon(String name, String texturePath) {
        super(name, texturePath);
    }

    public abstract Integer getDamage();

    @Override
    public void onMine(Block block) {
        System.out.println("Mining with a " + this.getClass().getSimpleName() + " seems to be a bad idea");
    }
}
