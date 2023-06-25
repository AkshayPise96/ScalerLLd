import lld.Singleton;
import org.junit.Test;

public class TestSingleton {

    @Test
    public void createSingleton() {
//        Singleton singleton = new Singleton();
        Singleton singleton = Singleton.getSingleton();

    }

}
