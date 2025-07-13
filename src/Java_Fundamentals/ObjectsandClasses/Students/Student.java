package Java_Fundamentals.ObjectsandClasses.Students;

public class Student {

    private String firstName;
    private String lastName;
    private int age;
    private String hometown;


    //konstruktor po podrazbirane
    public Student() {

    }

    //custom konstruktor
    public Student(String firstName, String lastName, int age, String hometown) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.hometown = hometown;

    }

    //osigurqva dostup do poletata
    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }

    public String getHometown() {
        return this.hometown;
    }

    //zadavame stoinost na poleta
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }
}
