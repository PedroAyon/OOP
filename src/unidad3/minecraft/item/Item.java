package unidad3.minecraft.item;

public abstract class Item {
    public String name;
    private final String texturePath;

    public Item(String name, String texturePath) {
        this.name = name;
        this.texturePath = texturePath;
    }
}
