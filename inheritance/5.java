class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound.");
    }
}


class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog barks.");
    }
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("Cat meows.");
    }
}

public class AnimalDogCat {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.makeSound();   
         cat.makeSound();       }
}
