public class Singleton_thread {
    private static volatile Singleton_thread instance;
    private String data;

    private Singleton_thread(String data) {
        this.data = data;
    }

    public static Singleton_thread getInstance(String data) {
        Singleton_thread result = instance;
        if (result == null) {
            synchronized (Singleton_thread.class) {
                result = instance;
                if (result == null) {
                    instance = result = new Singleton_thread(data);
                }
            }
        }
        return result;
    }
}
