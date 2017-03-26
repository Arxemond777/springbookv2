package ch3.page_112_bean_instantion_mode;

public class Singleton {
    private static Singleton instance;

    static {
        instance = new Singleton(); 
    }

    public static Singleton getInstance() {
        return instance; 
    }
}
