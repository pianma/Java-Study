package study.javastudy.inheritance;

public class StudentRunner {

    public static void main(String[] args) {
        Student student = new Student();
        student.getAge();


        Employee employee = new Employee();
        employee.setName("kim");
        employee.setEmail("ikkw2040@naver.com");
        employee.setAge(20);
        employee.setEmployeeGrade('A');
        employee.setTitle("Programmer");

        System.out.println(employee.toString());
    }

}
