package lld;

public class Singleton {

    public static Singleton singletonObj;

    //private constructor
    private Singleton() {}

    //public getter
    public static Singleton getSingleton() {

        if(singletonObj == null) {
            //thread 1 , thread 2
            synchronized (Singleton.class) {
                // thread 1
                if (singletonObj == null) {
                    singletonObj = new Singleton();
                }
            }
        }
        return singletonObj;
    }

}
