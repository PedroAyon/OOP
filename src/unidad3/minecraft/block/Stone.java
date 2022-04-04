package unidad3.minecraft.block;

import unidad3.minecraft.Coordinates;

public class Stone extends Block{
    public Stone(Coordinates coordinates) {
        super(BlockType.STONE, 20, coordinates, "textures/blocks/stone.png");
    }
}
