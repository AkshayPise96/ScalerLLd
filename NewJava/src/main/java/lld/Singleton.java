package lld;

public class Singleton {

    public static Singleton singletonObj;

    //private constructor
    private Singleton() {}

    //public getter
    public static synchronized Singleton getSingleton() {
        if(singletonObj == null) {
            singletonObj = new Singleton();
        }
        return singletonObj;
    }

}
