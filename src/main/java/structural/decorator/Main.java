package structural.decorator;


//reference: https://www.codiwan.com/decorator-design-pattern-real-world-example-java/#:~:text=The%20decorated%20beverages%20can%20further,Whip%20as%20the%20condiment%20decorators
public class Main {

    public static void main(String[] args) {
        Coffee coffee1 = new Espresso();

        System.out.println(coffee1.getDescription());

        Coffee coffee2 = new HotBlend();
        CondimentDecorator condimentDecorator = new ChocoChipDecorator(coffee2);
        System.out.println(condimentDecorator.getDescription());

        Coffee coffee3 = new HotBlend();
        CondimentDecorator condimentDecorator1 = new ChocoChipDecorator(coffee3);
        System.out.println(new CreamDecorator(condimentDecorator1).getDescription());
    }
}
