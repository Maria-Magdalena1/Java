package Java_Fundamentals.ObjectsandClasses.StudentsAndGrades;

public class Student {
    private String firstName;
    private String lastName;
    private double grade;


    public Student(String firstName,String lastName,double grade) {
        this.firstName=firstName;
        this.lastName=lastName;
        this.grade=grade;
    }
    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public double getGrade() {
        return this.grade;
    }

    public void setFirstName(String firstName) {
        this.firstName=firstName;
    }

    public void setLastName(String lastName) {
        this.lastName=lastName;
    }

    public void setGrade(double grade) {
        this.grade=grade;
    }

    @Override
    public String toString() {
        return String.format("%s %s: %.2f",firstName,lastName,grade);
    }
}
