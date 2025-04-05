class Teacher {
    void teach() {
        System.out.println("Teaching a subject...");
    }
}

class MathTeacher extends Teacher {

    void teach() {
        System.out.println("Teaching Mathematics...");
    }
}

public class School {
    public static void main(String[] args) {
        Teacher generalTeacher = new Teacher(); // Calls parent method
        generalTeacher.teach();

        MathTeacher mathTeacher = new MathTeacher(); // Calls overridden method
        mathTeacher.teach();

        Teacher myTeacher = new MathTeacher(); // Dynamic method dispatch
        myTeacher.teach();
    }
}
