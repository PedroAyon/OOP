package unidad3.minecraft.block;

import unidad3.minecraft.Coordinates;
import unidad3.minecraft.item.BlockItem;

public class Block {
    BlockType type;
    Integer miningPercentage;
    Integer hardness;
    Coordinates coordinates;
    String texturePath;

    public Block(BlockType type, Integer hardness, Coordinates coordinates, String texturePath) {
        this.type = type;
        this.miningPercentage = 0;
        this.hardness = hardness;
        this.coordinates = coordinates;
        this.texturePath = texturePath;
    }

    public BlockType getType() {
        return type;
    }

    public Integer getMiningPercentage() {
        return miningPercentage;
    }

    public Integer getHardness() {
        return hardness;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public void setMiningPercentage(Integer miningPercentage) {
        this.miningPercentage = miningPercentage;
    }

    public void setHardness(Integer hardness) {
        this.hardness = hardness;
    }

    @Override
    public String toString() {
        return "Block{" +
                "type=" + type +
                ", miningPercentage=" + miningPercentage +
                ", hardness=" + hardness +
                ", coordinates=" + coordinates +
                '}';
    }
}