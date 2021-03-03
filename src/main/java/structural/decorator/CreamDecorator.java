package structural.decorator;

public class CreamDecorator extends CondimentDecorator {

    private Coffee coffee;

    CreamDecorator(Coffee coffee) {
        this.coffee = coffee;
    }


    @Override
    public String getDescription() {
        return coffee.getDescription() + " with cream";
    }

    @Override
    public double cost() {
        return coffee.cost()+1.0;
    }
}
