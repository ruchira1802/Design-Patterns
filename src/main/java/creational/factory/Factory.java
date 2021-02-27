package creational.factory;

//When the object creation logic is kept hidden from the user
//Used when a method returns one of the several possible classes that share a common super class
//The class is chosen at runtime
//When to use it: When all the potential claases are in the same hierarchy and you don't know which class to choose
//When you don't want the user to know all the sub classes
//Kind of encapsulation
public class Factory {

    public SocialMedia getSocialMedia(String input) {

        if(input.equals("1")) {
            return new Instagram();
        } else if(input.equals("2")) {
            return new Whatsapp();
        } else if(input.equals("3")) {
            return new Snap();
        } else {
            return null;
        }
    }
}
