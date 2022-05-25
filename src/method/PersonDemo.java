package src.method;

public class PersonDemo {
    public static void main(String[] args) {
        Person zhangshan =new Person();
        zhangshan.name="张山";
        zhangshan.height=180;
        zhangshan.age=30;
        System.out.println(zhangshan.name);

        zhangshan.eat();
        zhangshan.meet("李四");

    }
}
