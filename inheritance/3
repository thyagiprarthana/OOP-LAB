class Building {
    int floors;
    String material;

    Building(int floors, String material) {
        this.floors = floors;
        this.material = material;
    }

    void displayInfo() {
        System.out.println("Floors: " + floors);
        System.out.println("Material: " + material);
    }
}


class House extends Building {
    int bedrooms;

    House(int floors, String material, int bedrooms) {
        super(floors, material);
        this.bedrooms = bedrooms;
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Bedrooms: " + bedrooms);
    }
}
class SmartHouse extends House {
    boolean smartFeatures;

    SmartHouse(int floors, String material, int bedrooms, boolean smartFeatures) {
        super(floors, material, bedrooms);
        this.smartFeatures = smartFeatures;
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Smart Features: " + smartFeatures);
    }
}

public class BuildingHouseSmartHouse {
    public static void main(String[] args) {
        SmartHouse smartHouse = new SmartHouse(2, "Concrete", 4, true);
        smartHouse.displayInfo();
    }
}
