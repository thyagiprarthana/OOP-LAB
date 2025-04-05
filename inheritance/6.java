class Gadget {
    String brand;
    double price;

  Gadget (String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: $" + price);
    }
}

class Phone extends  Gadget{
    int batteryLife;

    Phone(String brand, double price, int batteryLife) {
        super(brand, price);
        this.batteryLife = batteryLife;
    }

    void display() {
        super.display();
        System.out.println("Battery Life: " + batteryLife + " hours");
    }
}


class Tablet extends Gadget{
    double screenSize;

    Tablet(String brand, double price, double screenSize) {
        super(brand, price);
        this.screenSize = screenSize;
    }

    void display() {
        super.display();
        System.out.println("Screen Size: " + screenSize + " inches");
    }
}

public class GadgetPhoneTablet {
    public static void main(String[] args) {
        Phone phone = new Phone("Apple", 999.99, 24);
        Tablet tablet = new Tablet("Samsung", 599.99, 10.5);

        phone.display();       
     tablet.display();     }
}
