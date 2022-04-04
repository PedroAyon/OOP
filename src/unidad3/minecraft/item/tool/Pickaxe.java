package unidad3.minecraft.item.tool;

import unidad3.minecraft.block.Block;
import unidad3.minecraft.block.BlockType;

public class Pickaxe extends Tool {

    public ToolType type;

    public Pickaxe(ToolType type) {
        super("Pickaxe", "textures/items/tools/pickaxe.png");
        this.type = type;
    }

    @Override
    public void onMine(Block block) {
        if (block.getType() == BlockType.OBSIDIAN && !(type == ToolType.DIAMOND || type == ToolType.NETHERITE))
            System.out.println("You can't mine obsidian with a " + type + " pickaxe");
        else System.out.println(block.getType().name() + " was mined by " + this.name);
    }
}
