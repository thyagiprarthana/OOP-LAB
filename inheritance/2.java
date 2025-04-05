class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
class Student extends Person {
    String course;

    Student(String name, int age, String course) {
        super(name, age);
        this.course = course;
    }

    void showDetails() {
        super.showDetails();
        System.out.println("Course: " + course);
    }
}

public class PersonStudent {
    public static void main(String[] args) {
        Student student = new Student("John", 20, "Computer Science");
        student.showDetails();
    }
}
