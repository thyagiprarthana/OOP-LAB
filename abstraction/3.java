interface SpeedController {
    void accelerate();
    void brake();
    int getSpeed();
}

class Car implements SpeedController {
    private int speed = 0;

    public void accelerate() {
        speed += 10;
        System.out.println("Accelerating... Current speed: " + speed + " km/h");
    }

    public void brake() {
        if (speed >= 10) {
            speed -= 10;
            System.out.println("Braking... Current speed: " + speed + " km/h");
        } else {
            System.out.println("Car is already at minimum speed: " + speed + " km/h");
        }
    }

    public int getSpeed() {
        return speed;
    }
}

public class CarApp {
    public static void main(String[] args) {
        SpeedController myCar = new Car(); // Using interface reference

        myCar.accelerate(); // 10
        myCar.accelerate(); // 20
        myCar.brake();      // 10
        myCar.brake();      // 0
        myCar.brake();      // already at minimum

        System.out.println("Final Speed: " + myCar.getSpeed() + " km/h");
    }
}
