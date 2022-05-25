package src.interfaceDemo;

public interface IndefaultMethod {
    public default void run(){
        System.out.println("运行");
    }

    public default void walk(){
        System.out.println("走路");

    }
}
