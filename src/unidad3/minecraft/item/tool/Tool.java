package unidad3.minecraft.item.tool;

import unidad3.minecraft.block.Block;
import unidad3.minecraft.item.Item;

public abstract class Tool extends Item {
    public Tool(String name, String texturePath) {
        super(name, texturePath);
    }

    public abstract void onMine(Block block);
}
