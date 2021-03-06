package unidad3.shapes.model.shapes;

import unidad3.shapes.model.shapes.shape2d.Shape2DFactory;
import unidad3.shapes.model.shapes.shape3d.Shape3DFactory;
import unidad3.shapes.utils.GetColor;
import unidad3.shapes.utils.GetInt;

public class ShapeFactory {
    public static Shape create(boolean graphic, GetInt getInt, GetColor getColor) {
        int type = getInt.get("""
                2 - 2D Shape
                3 - 3D Shape
                """);
        return switch (type) {
            case 2 -> Shape2DFactory.create(graphic, getInt, getColor);
            case 3 -> Shape3DFactory.create(graphic, getInt, getColor);
            default -> null;
        };
    }
}
