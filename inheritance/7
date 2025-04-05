class Appliance {
    String brand;
    int power;

    Appliance(String brand, int power) {
        this.brand = brand;
        this.power = power;
    }

    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Power: " + power + " watts");
    }
}

// Interface for smart features
interface Smart {
    void connectToWiFi();
}

class WashingMachine extends Appliance {
    int capacity;

    WashingMachine(String brand, int power, int capacity) {
        super(brand, power);
        this.capacity = capacity;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Capacity: " + capacity + " kg");
    }
}

class SmartWashingMachine extends WashingMachine implements Smart {
    SmartWashingMachine(String brand, int power, int capacity) {
        super(brand, power, capacity);
    }

    public void connectToWiFi() {
        System.out.println("Connecting the washing machine to WiFi...");
    }
}

public class ApplianceSmartWashingMachine {
    public static void main(String[] args) {
        SmartWashingMachine smartWashingMachine = new SmartWashingMachine("Samsung", 1500, 7);
        smartWashingMachine.displayDetails();    // Calls WashingMachine's displayDetails method
        smartWashingMachine.connectToWiFi();     // Calls Smart's connectToWiFi method
    }
}
