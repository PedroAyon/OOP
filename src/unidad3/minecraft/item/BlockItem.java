package unidad3.minecraft.item;

import unidad3.minecraft.block.BlockType;

public class BlockItem extends Item {
    public BlockType type;

    public BlockItem(String name, String texturePath, BlockType type) {
        super(name, texturePath);
        this.type = type;
    }
}
