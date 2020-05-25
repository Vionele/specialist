package ex.sveta.specialist;

import java.util.List;

public class Canvas {

    private List<Shape> shapes;

    public Canvas(List<Shape> shapes) {
        this.shapes = shapes;
    }

    public Canvas() {
    }

    public List<Shape> getShapes() {
        return shapes;
    }

    public void setShapes(List<Shape> shapes) {
        this.shapes = shapes;
    }

    public void draw() {
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
