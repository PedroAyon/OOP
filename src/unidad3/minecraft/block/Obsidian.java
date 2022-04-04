package unidad3.minecraft.block;

import unidad3.minecraft.Coordinates;

public class Obsidian extends Block {
    public Obsidian(Coordinates coordinates) {
        super(BlockType.OBSIDIAN, 100, coordinates, "textures/blocks/obsidian.png");
    }
}
