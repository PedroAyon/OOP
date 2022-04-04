package unidad3.minecraft.block;

public enum BlockType {
    WOOD, STONE, OBSIDIAN, GLASS, DIRT, GRASS, SAND, WATER, LAVA, SANDSTONE;
    public String texturePath() {
        return "textures/blocks/" + this.name().toLowerCase() + ".png";
    }
}
