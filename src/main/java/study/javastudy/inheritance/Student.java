package study.javastudy.inheritance;

public class Student extends Person{
    private String college;

    private String major;

    public Student(String name, String college) {
        super(name);
        this.college = college;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

}
