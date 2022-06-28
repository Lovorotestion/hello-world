package src.package_method;

public class TeacherTest {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.setName("李芳");
        teacher.setAge(10);
//        String tName = teacher.getName();
//        System.out.println(tName);
        int age11 = teacher.getAge();
        System.out.println(teacher.introducton());
    }
}
