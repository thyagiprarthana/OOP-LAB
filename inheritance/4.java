class Device {
    String brand;
    double price;

    Device(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    void showInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: $" + price);
    }
}


class Computer extends Device {
    int ram;

    Computer(String brand, double price, int ram) {
        super(brand, price);
        this.ram = ram;
    }

    void showInfo() {
        super.showInfo();
        System.out.println("RAM: " + ram + "GB");
    }
}


class Laptop extends Computer {
    double weight;

    Laptop(String brand, double price, int ram, double weight) {
        super(brand, price, ram);
        this.weight = weight;
    }

    void showInfo() {
        super.showInfo();
        System.out.println("Weight: " + weight + "kg");
    }
}

public class DeviceComputerLaptop {
    public static void main(String[] args) {
        Laptop laptop = new Laptop("Dell", 1200, 16, 2.5);
        laptop.showInfo();
    }
}
