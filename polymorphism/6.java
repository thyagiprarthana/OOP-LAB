class Food {
    void prepare() {
        System.out.println("Preparing food...");
    }
}
class Pizza extends Food {

    void prepare() {
        System.out.println("Preparing pizza with dough, sauce, and cheese...");
    }
}
public class Restaurant {
    public static void main(String[] args) {
        Food generalFood = new Food(); // Calls parent method
        generalFood.prepare();

        Pizza myPizza = new Pizza(); // Calls overridden method
        myPizza.prepare();

        Food order = new Pizza(); // Dynamic method dispatch
        order.prepare();
    }
}
