package structural.decorator;

public class HotBlend implements Coffee {

    @Override
    public String getDescription() {
        return "HotBlend";
    }

    @Override
    public double cost() {
        return 5.0;
    }
}
