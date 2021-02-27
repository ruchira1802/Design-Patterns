package creational.singleton;

//reference: https://www.youtube.com/watch?v=NZaXM67fxbs
//This is an eager initialization
//pros - easy to implement
//cons - may lead to resource wastage - initializes class even when it is not required
public class SingletonEager {

    //The singleton object is static
    public static SingletonEager singletonEagerObj = new SingletonEager();
    public int count = 0;
    private SingletonEager() {
        count++;
    }

    public static SingletonEager getInstance() {
        return singletonEagerObj;
    }

    public static void main(String[] args) {
        SingletonEager singletonEager1 = getInstance();
        SingletonEager singletonEager2 = new SingletonEager();
        System.out.println(singletonEager1.getInstance().count);
        System.out.println(singletonEager1.getInstance().count);
    }

}
