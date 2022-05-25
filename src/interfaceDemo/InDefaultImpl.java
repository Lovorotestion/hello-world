package src.interfaceDemo;

public class InDefaultImpl implements IndefaultMethod{

    @Override
    public void walk() {
        IndefaultMethod.super.walk();
        System.out.println("实现类重写后的walk");
    }

    @Override
    public void run() {
        IndefaultMethod.super.run();
        System.out.println("实现类重写后的运行");
    }
}
