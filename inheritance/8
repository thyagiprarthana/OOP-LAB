class Vehicle {
    String brand;
    int speed;

    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }
}
interface Electric {
    void chargeBattery();
}

class Car extends Vehicle {
    int numberOfDoors;

    Car(String brand, int speed, int numberOfDoors) {
        super(brand, speed);
        this.numberOfDoors = numberOfDoors;
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}

class ElectricCar extends Car implements Electric {
    ElectricCar(String brand, int speed, int numberOfDoors) {
        super(brand, speed, numberOfDoors);
    }

    public void chargeBattery() {
        System.out.println("Charging the car's battery...");
    }
}

public class VehicleElectricCar {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar("Tesla", 200, 4);
        electricCar.displayInfo();    // Calls Car's displayInfo method
        electricCar.chargeBattery();  // Calls Electric's chargeBattery method
    }
}
