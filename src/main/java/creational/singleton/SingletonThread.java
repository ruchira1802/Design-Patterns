package creational.singleton;

//reference: https://www.youtube.com/watch?v=NZaXM67fxbs
//This is a thread safe lazy initialization for singleton class
//Use cases: Any Database/Resource client objects  are singleton
//(For eg: Multiple API's in an app will use the same database client obj to PUT/POST/DELETE int the same database,
// hence the clientObj will be singleton)
public class SingletonThread {
    //The singleton object is static
    public static SingletonThread singletonThreadObj =  null;
    public int count = 0;
    private SingletonThread() {
        count++;
    }

    public static synchronized SingletonThread getInstance() {
        if(singletonThreadObj==null) {
            singletonThreadObj = new SingletonThread();
        }
        return singletonThreadObj;
    }

    public static void main(String[] args) {
        SingletonThread singletonThreadObj1 = getInstance();
        SingletonThread singletonThreadObj2 = new SingletonThread();
        System.out.println(singletonThreadObj1.getInstance().count);
        System.out.println(singletonThreadObj2.getInstance().count);
    }
}
