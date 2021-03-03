package structural.decorator;

public class Main {

    public static void main(String[] args) {
        Coffee coffee1 = new Espresso();

        System.out.println(coffee1.getDescription());

        Coffee coffee2 = new HotBlend();
        CondimentDecorator condimentDecorator = new ChocoChipDecorator(coffee2);
        System.out.println(condimentDecorator.getDescription());

        Coffee coffee3 = new HotBlend();
        CondimentDecorator condimentDecorator1 = new ChocoChipDecorator(coffee2);
        System.out.println(new CreamDecorator(condimentDecorator).getDescription());
    }
}
