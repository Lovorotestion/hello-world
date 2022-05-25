package src.method;

public class DemoTeet {
    public static void main(String[] args) {

        Constractor constractor = new Constractor();
        System.out.println(constractor.getName());
        System.out.println(constractor.getGrade());

        StudentNo studentNo = new StudentNo();
        System.out.println(studentNo.getName());
        System.out.println(studentNo.getGrade());

        StudentWith studentWith = new StudentWith("hogwarts",666);
        System.out.println(studentWith.getName());
        System.out.println(studentWith.getGrade());




    }
}
