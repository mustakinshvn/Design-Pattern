package Singleton;

public class EagerInitializationSingleton {
    private static EagerInitializationSingleton instance = new EagerInitializationSingleton();

    private EagerInitializationSingleton() {
    }
  
    public static EagerInitializationSingleton getInstance() {
        return instance;
    }

}
