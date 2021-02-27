package creational.singleton;

//reference: https://www.youtube.com/watch?v=NZaXM67fxbs
//This is a Lazy initialization and initializes the singleton class only when required for the first time.
//Pros: Better than eager initialization as it saves resource wastage
//cons: It is not thread safe.
//In a multi threaded env, Multiple threads could create multiple objects in case any thread is slower.
//Multiple threads

public class SingletonLazy {
    //The singleton object is static
    public static SingletonLazy singletonLazyObj = null;
    public int count = 0;
    private SingletonLazy() {
        count++;
    }

    public static SingletonLazy getInstance() {
        if(singletonLazyObj==null) {    //In case threads are slower, all can reach here and each of them could then create their own objects
            singletonLazyObj = new SingletonLazy();
        }
        return singletonLazyObj;
    }

    public static void main(String[] args) {
        SingletonLazy singletonLazyObj1 = getInstance();
        SingletonLazy singletonLazyObj2 = new SingletonLazy();
        System.out.println(singletonLazyObj1.getInstance().count);
        System.out.println(singletonLazyObj2.getInstance().count);
    }
}
