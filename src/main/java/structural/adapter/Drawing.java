package structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class Drawing {

    List<Shape> shapes = new ArrayList<>();

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public List<Shape> getShapes() {
        return shapes;
    }

    public void draw() {
        for(Shape shape:shapes) {
            shape.draw();;
        }
    }
}
