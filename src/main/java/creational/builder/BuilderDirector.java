package creational.builder;

//reference: https://howtodoinjava.com/design-patterns/creational/builder-pattern-in-java/
//https://howtodoinjava.com/design-patterns/creational/abstract-factory-pattern-in-java/
//When there are a lot of parameters in a class, and we only want to instantiate few parameters
//we might need separate constructors or else pass null values to the constructor.
//Another ways is to use setter methods but we will compromise immutability in this case.
//Using a builder class, we can create an object without using multiple constructors
//and at the end when we build the object it would be immutable
//for eg: StringBuilder is a builder for String
//when be do stringBuilder.build() the output string would be immutable
public class BuilderDirector {


    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount.BankBuilder().setAccountNumber(1L).setBalance(1.0).build();
        BankAccount bankAccount2 = new BankAccount.BankBuilder().setAccountNumber(2L).setBalance(2.0).build();
        System.out.println(bankAccount1.getAccountNumber());
        System.out.println(bankAccount2.getAccountNumber());
    }


}
