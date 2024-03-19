package them.JavaReport.JavaReport07;

public class Student {
    private String name;
    private String department;
    private String id;
    private Double grade;

    public Student(String name, String department, String id, Double grade) {
        this.name = name;
        this.department = department;
        this.id = id;
        this.grade = grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Double getGrade() {
        return grade;
    }

    public void setGrade(Double grade) {
        this.grade = grade;
    }
}
