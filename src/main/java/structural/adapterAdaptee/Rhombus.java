package structural.adapterAdaptee;

public class Rhombus implements GeometricalShape {

    private final double a;
    private final double b;

    public Rhombus() {
        this(1.0,1.0);
    }
    public Rhombus(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void showArea() {
        System.out.println("Rhombus");
        System.out.println(a*b);
    }

    @Override
    public void showPerimeter() {
        System.out.println("Rhombus");
        System.out.println(2*(a+b));
    }
}
