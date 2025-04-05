
abstract class ReportCard {
    private String studentName;

    public ReportCard(String name) {
        this.studentName = name;
    }

    public String getStudentName() {
        return studentName;
    }

    public abstract void generateReport();
}


class SemesterReport extends ReportCard {
    private int totalMarks;

    public SemesterReport(String name, int marks) {
        super(name);
        this.totalMarks = marks;
    }

    public void generateReport() {
        System.out.println("Semester Report for " + getStudentName() + ": " + totalMarks + " marks");
    }
}

public class ReportCardApp {
    public static void main(String[] args) {
        ReportCard report = new SemesterReport("Alice Johnson", 475);
        report.generateReport();    }
}
