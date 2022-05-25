package src.multi_01;

public class VarMain {
    public static void main(String[] args) {
        VarFather father = new VarSon();
        System.out.println(father.name);

        System.out.println(father.age);
        System.out.println(father.getAge());


    }
}
