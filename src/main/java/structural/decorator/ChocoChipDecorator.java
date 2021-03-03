package structural.decorator;

public class ChocoChipDecorator extends CondimentDecorator {

    private Coffee coffee;

    ChocoChipDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " Choco Chip";
    }

    @Override
    public double cost() {
        return coffee.cost()+1.0;
    }
}
