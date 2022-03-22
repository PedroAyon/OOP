package unidad3.shapes.model.shapes.shape3d;

import unidad3.shapes.model.shapes.shape3d.cube.Cube;
import unidad3.shapes.model.shapes.shape3d.cube.GraphicCube;
import unidad3.shapes.model.shapes.shape3d.pyramid.GraphicPyramid;
import unidad3.shapes.model.shapes.shape3d.pyramid.Pyramid;
import unidad3.shapes.model.shapes.shape3d.sphere.GraphicSphere;
import unidad3.shapes.model.shapes.shape3d.sphere.Sphere;
import unidad3.shapes.utils.GetColor;
import unidad3.shapes.utils.GetInt;

public class Shape3DFactory {
    public static Shape3D create(boolean graphic, GetInt getInt, GetColor getColor) {
        int type = getInt.get("""
                1 - Cube
                2 - Pyramid
                3 - Sphere
                """);
        if (graphic) {
            return switch (type) {
                case 1 -> new GraphicCube(getInt, getColor);
                case 2 -> new GraphicPyramid(getInt, getColor);
                case 3 -> new GraphicSphere(getInt, getColor);
                default -> new Shape3D("Nothing" ,getInt, getColor);
            };
        } else {
            return switch (type) {
                case 1 -> new Cube(getInt, getColor);
                case 2 -> new Pyramid(getInt, getColor);
                case 3 -> new Sphere(getInt, getColor);
                default -> new Shape3D("Nothing" ,getInt, getColor);
            };
        }
    }
}
