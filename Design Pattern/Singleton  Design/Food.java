public class Food {
    private static Food food;

    private Food() {
    }

    public static Food getFood() {
        if (food == null) {
            food = new Food();
        }
        return food;
    }

    public void message() {
        System.out.println("Your order will be delivered shortly");
    }
}