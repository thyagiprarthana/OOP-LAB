interface StudentInfo {
    void setGrades(int[] grades);
    double calculateAverage();
    String getStudentName();
}

class Student implements StudentInfo {
    private String name;
    private int[] grades;

    public Student(String name) {
        this.name = name;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }

    public double calculateAverage() {
        int sum = 0;
        for (int g : grades) {
            sum += g;
        }
        return (double) sum / grades.length;
    }

    public String getStudentName() {
        return name;
    }
}

public class StudentApp {
    public static void main(String[] args) {
        StudentInfo student = new Student("Alice");

        int[] grades = {85, 90, 78, 92, 88};
        student.setGrades(grades);

        System.out.println("Student Name: " + student.getStudentName());
        System.out.println("Average Grade: " + student.calculateAverage());
    }
}
