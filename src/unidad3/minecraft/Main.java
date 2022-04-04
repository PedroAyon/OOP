package unidad3.minecraft;

import unidad3.minecraft.block.Block;
import unidad3.minecraft.block.Obsidian;
import unidad3.minecraft.block.Stone;
import unidad3.minecraft.item.tool.Pickaxe;
import unidad3.minecraft.item.tool.Tool;
import unidad3.minecraft.item.tool.ToolType;
import unidad3.minecraft.item.tool.weapon.Bow;
import unidad3.minecraft.item.tool.weapon.Sword;
import unidad3.minecraft.item.tool.weapon.Weapon;

public class Main {
    public static void main(String[] args) {
        Block obsidian = new Obsidian(new Coordinates(0, 0, 0));
        Block stone = new Stone(new Coordinates(0, 1, 0));
        Tool ironPickaxe = new Pickaxe(ToolType.IRON);
        Tool diamondPickaxe = new Pickaxe(ToolType.DIAMOND);
        Weapon diamondSword = new Sword(ToolType.DIAMOND);
        Bow bow = new Bow(64);

        ironPickaxe.onMine(obsidian);
        diamondPickaxe.onMine(obsidian);
        diamondSword.onMine(stone);
        System.out.println("My diamond sword has " + diamondSword.getDamage() + " points of damage");

        bow.throwArrow();
        bow.setChargePercentage(100);
        bow.throwArrow();
    }
}
