package structural.adapterAdaptee;

public class Triangle implements GeometricalShape {

    private final int a;
    private final int b;
    private final int c;

    Triangle() {
        a  =1;
        b = 1;
        c = 1;
    }

    Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public void showArea() {
        System.out.println("Triangle");
        System.out.println(a*b*c);
    }

    @Override
    public void showPerimeter() {
        System.out.println("Triangle");
        System.out.println(a+b+c);
    }
}
