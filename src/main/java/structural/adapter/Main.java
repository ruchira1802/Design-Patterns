package structural.adapter;

import structural.adapterAdaptee.Rhombus;

//https://dzone.com/articles/adapter-design-pattern-in-java
//The Adapter pattern uses an adapter as a bridge between two interfaces.
public class Main {

    public static void main(String[] args) {
        Drawing drawing = new Drawing();

        Square square = new Square();
        Rectangle rectangle = new Rectangle();
        GeometricalShapeAdapter geometricalShapeAdapter = new GeometricalShapeAdapter(new Rhombus(1,1));
        drawing.addShape(square);
        drawing.addShape(rectangle);
        drawing.addShape(geometricalShapeAdapter);
        drawing.draw();
    }
}
