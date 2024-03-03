package study.javastudy.inheritance;

public class StudentRunner {

    public static void main(String[] args) {
        Student student = new Student("kim","JavaUniv");
        student.getAge();


        Employee employee = new Employee("kim", "Programmer");
//        employee.setName();
        employee.setEmail("ikkw2040@naver.com");
        employee.setAge(20);
        employee.setEmployeeGrade('A');
//        employee.setTitle();

        System.out.println(employee.toString());
    }

}
