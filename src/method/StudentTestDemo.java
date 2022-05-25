package src.method;

public class StudentTestDemo {
    public static void main(String[] args) {
        StudentTest studentTest = new StudentTest();
        System.out.println(studentTest.getName());
        StudentTest studentTest1 = new StudentTest("哈哈哈");
        System.out.println(studentTest1.getName());
        StudentTest studentTest2 = new StudentTest("hahha",23);
        System.out.println(studentTest2.getName());
        System.out.println(studentTest2.getGrade());

    }
}
