package src.interfaceDemo;

public interface InPrivateMethod {

    //私有普通方法
    private void privateMethod(){

    }

    //私有静态方法
    private static void privateStaticMethod(){

    }

    //默认方法
    public default void defaultMethod(){
        privateMethod();
        privateStaticMethod();

    }

    public static void staticMethod(){
        privateStaticMethod();

    }
}
