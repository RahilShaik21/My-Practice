package Practice;

public class Studentmng {
    private String name;
    private String rollno;
    private double marks;

    public void setName(String name) {
        this.name = name;
    }

    public void setRollno(String rollno) {
        this.rollno = rollno;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public String getRollno() {
        return rollno;
    }

    public double getMarks() {
        if(marks <0&&marks>100) {
            throw new IllegalArgumentException("Marks must be greater than 0");
        }
        return marks;
    }
}
