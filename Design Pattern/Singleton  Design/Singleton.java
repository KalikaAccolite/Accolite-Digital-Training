public class Singleton {
    public static void main(String[] args) {
        Food singletonInstance = Food.getFood();
        singletonInstance.message();
    }
}