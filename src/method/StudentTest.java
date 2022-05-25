package src.method;

public class StudentTest {
    private String name;
    private int grade;

    public StudentTest(){
        System.out.println("没有参数");
    }

    public StudentTest(String name){
        System.out.println("只有一个参数");
        this.name =name;
    }

    public StudentTest(String name,int grade){
        System.out.println("有两个参数");
        this.name =name;
        this.grade=grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
