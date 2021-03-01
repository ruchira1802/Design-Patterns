package structural.adapter;

import structural.adapterAdaptee.GeometricalShape;

public class GeometricalShapeAdapter implements Shape {

    private GeometricalShape geometricalShape;

    GeometricalShapeAdapter(GeometricalShape geometricalShape) {
        this.geometricalShape = geometricalShape;
    }

    @Override
    public void draw() {
        geometricalShape.showArea();
    }

    @Override
    public void resize() {
        geometricalShape.showPerimeter();
    }
}
