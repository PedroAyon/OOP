package unidad3.minecraft.item.tool.weapon;

import unidad3.minecraft.item.tool.ToolType;

public class Sword extends Weapon {
    public ToolType type;

    public Sword(ToolType type) {
        super(type.name().toLowerCase(), "textures/items/tools/weapons/sword.png");
        this.type = type;
    }

    @Override
    public Integer getDamage() {
        return switch (type) {
            case WOOD, GOLD -> 4;
            case STONE -> 5;
            case IRON -> 6;
            case DIAMOND -> 7;
            case NETHERITE -> 8;
        };
    }
}
